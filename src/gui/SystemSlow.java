package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class SystemSlow {
    private static String DBURL; //= "jdbc:mysql://127.0.0.1:3306/angielski";
    private static String DBUSER;// = "root";
    private static String DBPASS;// = "";
    private static String DBDRIVER;// = "com.mysql.jdbc.Driver";
    
    private static Connection connection;
    private static Statement statement;
    private static String query;
    private static ArrayList<String> polishWords = new ArrayList<>();;
    private static ArrayList<String> englishWords = new ArrayList<>();
    private static Set<Integer> usedWordsInTestNumbers = new HashSet<>();
    private SystemSlow() {
    }
    public static void downloadSettingFromFile() throws FileNotFoundException{
        File file = new File("DatabaseSettings.txt");
        Scanner myReader = new Scanner(file);
        int i=0;
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String data = line.substring(line.indexOf("'")+1,line.lastIndexOf("'"));
            if(i==0){
                DBURL=data;
            }else if(i==1){
                DBUSER=data;
            }else if(i==2){
                DBPASS=data;
            }else if(i==3){
                DBDRIVER=data;
            }else
                break;
            i++;     
        }  
    }
    public static ArrayList<String> getPolishWords(){
        return polishWords;
    }
    public static ArrayList<String> getEnglishWords(){
        return englishWords;
    }
    public static void downloadWords () throws SQLException, ClassNotFoundException {
        query = "SELECT * FROM slowa";
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = (Statement) connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        int n=0;
        polishWords.clear();
        englishWords.clear();
        while (rs.next())
        { 
            n++;
            polishWords.add(rs.getString("pl"));
            englishWords.add(rs.getString("en"));
        }
        statement.close();
        connection.close(); 
    }
    public static void updateSekcjaPercent(int sekcja,int procent) throws SQLException{
        query = "UPDATE sekcje SET procent="+procent+" WHERE sekcja="+sekcja;
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = (Statement) connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close(); 
    }
    public static Integer getSekcjaPercent(int sekcja) throws SQLException{
        query = "Select procent FROM sekcje WHERE sekcja="+sekcja+"";
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = (Statement) connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        int percent=0;
        while (rs.next()) {
            percent = rs.getInt(1);
        }
        return percent;
    }
    public static void insertWords(String en, String pl) throws SQLException{
        query = "Select MAX(id) FROM slowa";
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = (Statement) connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        int rows=0;
        while (rs.next()) {
            rows = rs.getInt(1);
        }
        query = "INSERT INTO slowa(id,pl,en) VALUES('"+(rows+1)+"','"+pl+"','"+en+"')";
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = (Statement) connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close(); 
        
    }
    public static Integer getWordsSize(){
        return polishWords.size();
    }
    public static String getEnglishWords(int x){
        return englishWords.get(x);
    }
    public static String getPolishWords(int x){
        return polishWords.get(x);
    }
    public static void resetUsedWordsInTestList(){
        usedWordsInTestNumbers.clear();
    }
    static String[][] get4WordsToTest(int sekcja){
        String [][] readyWords = new String[4][2];
        Random rand = new Random();
        int nrDrawnWord;
        ArrayList<Integer> all4WordsNumbers = new ArrayList<>();
        //----------Losowanie czterech slowek---------
        for(int i = 0 ; i<4 ; i++){  
            do{
                nrDrawnWord=(sekcja-1)*Test.WORD_COUNT+(rand.nextInt(Test.WORD_COUNT));
            }while(all4WordsNumbers.contains(nrDrawnWord) || (usedWordsInTestNumbers.contains(nrDrawnWord) && i==0));
            all4WordsNumbers.add(nrDrawnWord);
            readyWords[i][0]=englishWords.get(nrDrawnWord);
            readyWords[i][1]=polishWords.get(nrDrawnWord);
        }
        usedWordsInTestNumbers.add(all4WordsNumbers.get(0));
        return readyWords;
    }
}
