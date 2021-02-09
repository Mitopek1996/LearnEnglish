# LearnEnglish
## (Java, NetBeans, JDBC, MySQL)

The application was written for individual use, but of course other users can benefit from it because app is friendly and 99% complete. 
The project provides for the possibility of 2 types of learning: normal and tests. All words is saved in SQL base and in application we can add new words to 
the base. In addition, last test result is recorded for each section in sql


### 1. Main menu

![alt text](https://github.com/Mitopek1996/LearnEnglish/blob/master/images/MenuGlowne.png)


### 2. Normal learn

![alt text](https://github.com/Mitopek1996/LearnEnglish/blob/master/images/Nauka.png)


### 3. Learn by tests

![alt text](https://github.com/Mitopek1996/LearnEnglish/blob/master/images/Test.png)


## Run project
Sample file sql is included with the project - **angielski.sql** (about 400 words)

We must configure this code in **SystemSlow.java** for proper connection to the base:

    ...
    private final static String DBURL = "jdbc:mysql://127.0.0.1:3306/angielski";
    private final static String DBUSER = "root";
    private final static String DBPASS = "";
    private final static String DBDRIVER = "com.mysql.jdbc.Driver";
    ...

After run our local server e.g. with xampp, we can run the application.


    
  
