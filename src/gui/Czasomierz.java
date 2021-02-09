package gui;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Czasomierz implements Runnable{
    private Test t1;
    public Czasomierz(Test t1){
        this.t1=t1;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);

        } catch (InterruptedException ex) {
            Logger.getLogger(Czasomierz.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t1.nextQuestion();
        } catch (SQLException ex) {
            Logger.getLogger(Czasomierz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
