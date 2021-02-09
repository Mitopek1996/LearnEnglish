/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JButton;

/**
 *
 * @author admin
 */
public class Test extends javax.swing.JFrame {
    public static final int WORD_COUNT = 25; //nie zmieniac!!!
    //SystemSlowek system;
    private Czasomierz czasomierz;
    private Thread thread;
    private Random rand = new Random();
    
    private String currentWordAnswer;
    private boolean choseAnswerBlock = false;
    private int mistake = 0;
    private int doneCount = 0;
    private int sekcja;
    public Test(int sekcja) {
        initComponents();
        this.sekcja=sekcja;
        SystemSlow.resetUsedWordsInTestList();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Angielski 1.0");
        //system = new SystemSlowek(b1);
        jLabel6.setText("Sekcja nr "+(sekcja));
        jLabel4.setVisible(false);
        czasomierz = new Czasomierz(this);
    }
    private Test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(485, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(485, 350));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(405, 265));
        jPanel1.setMinimumSize(new java.awt.Dimension(306, 166));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x/y");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jProgressBar1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 176, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Słówko");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 450, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ocena: ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 480, 160));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 220, 70));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 220, 70));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sekcja nr 0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Błędy: 0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jButton5.setText("Menu Główne");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tlo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JButton checkAnswer(){
        JButton button = null;
        if(currentWordAnswer.equals(jButton4.getText())){
            jButton4.setForeground(new Color(0,200,0));
            button=jButton4;
        }else if(currentWordAnswer.equals(jButton3.getText())){
            jButton3.setForeground(new Color(0,200,0));
            button=jButton3;
        }
        else if(currentWordAnswer.equals(jButton2.getText())){
            jButton2.setForeground(new Color(0,200,0));
            button=jButton2;
        }
        else if(currentWordAnswer.equals(jButton1.getText())){
            jButton1.setForeground(new Color(0,200,0));
            button=jButton1;
        }
        return button;
    }
    public void nextQuestion() throws SQLException{
        if(doneCount!=WORD_COUNT){
            addDoneCount();
            choseAnswerBlock=false;
            jButton1.setForeground(new Color(0,0,0));
            jButton2.setForeground(new Color(0,0,0));
            jButton3.setForeground(new Color(0,0,0));
            jButton4.setForeground(new Color(0,0,0));
            String [][] gotoweSlowka = SystemSlow.get4WordsToTest(sekcja);
            jLabel1.setText(gotoweSlowka[0][0]);
            currentWordAnswer=gotoweSlowka[0][1];
            byte[] wylosowane = new byte[4];
            Set<Byte> wylosowaneSlowka= new HashSet<>();
            for(int i = 0 ; i<4 ; i++){
                do{
                    wylosowane[i] = (byte)Math.abs((byte)rand.nextInt()%4);
                }while(wylosowaneSlowka.contains(wylosowane[i]));
                wylosowaneSlowka.add(wylosowane[i]);
            }
            jButton1.setText(gotoweSlowka[wylosowane[0]][1]);
            jButton2.setText(gotoweSlowka[wylosowane[1]][1]);
            jButton3.setText(gotoweSlowka[wylosowane[2]][1]);
            jButton4.setText(gotoweSlowka[wylosowane[3]][1]);
        }else{
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jLabel1.setVisible(false);
            evaluate();
        }
    }
    private void evaluate() throws SQLException{
        int procent = 100-(mistake*4);
        jLabel4.setVisible(true);
        jLabel4.setText("Ocena: "+procent+"%");
        SystemSlow.updateSekcjaPercent(sekcja,procent);
    }
    private void addMistake(){
        mistake++;
        jLabel3.setText("Błędy: "+mistake);
    }
    private void addDoneCount(){
        doneCount++;
        jProgressBar1.setValue((int)(Math.round((double)doneCount/(double)WORD_COUNT*100)));
        jLabel2.setText(doneCount+"/"+WORD_COUNT);
    }
    private void startTimeToNextQuestion(){
        thread = new Thread(czasomierz);
        thread.start();
    }
    private void choseAnswer(JButton button){
        if(!choseAnswerBlock){
            choseAnswerBlock = true;
            if(checkAnswer()!=button){
                button.setForeground(new Color(230,0,0));
                addMistake();
            }
            startTimeToNextQuestion();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        choseAnswer(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        choseAnswer(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        choseAnswer(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        choseAnswer(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        MenuGlowne m1 = new MenuGlowne();
        m1.checkTheCheckBox();
        m1.refreshListSekcja();
        m1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
