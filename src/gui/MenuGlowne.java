package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MenuGlowne extends javax.swing.JFrame {
    public MenuGlowne() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Angielski 1.0");
    }
    public void refreshListSekcja(){
        try {
            SystemSlow.downloadWords();
            int n = SystemSlow.getWordsSize();
            int k = (int) n/Test.WORD_COUNT;
            jComboBox1.removeAllItems();
            for(int i = 0 ; i<k ; i++){
                int percent = SystemSlow.getSekcjaPercent(i+1);
                jComboBox1.addItem("Sekcja nr "+(i+1)+" ("+percent+"%)");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(495, 355));
        setSize(new java.awt.Dimension(495, 355));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(405, 265));
        jPanel1.setMinimumSize(new java.awt.Dimension(306, 166));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Testy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, 50));

        jButton2.setText("Zwykła");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Zacznij naukę:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 360, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, -1));

        jButton3.setText("Dodaj");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 90, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 50, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("en -- pl");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("en -- pl");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 20));

        jCheckBox1.setBackground(new java.awt.Color(0, 102, 153));
        jCheckBox1.setAlignmentY(0.0F);
        jCheckBox1.setMargin(new java.awt.Insets(2, 6, 2, 2));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 30, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 60));

        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tlo.jpg"))); // NOI18N
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(SystemSlow.getWordsSize()<Test.WORD_COUNT){
            JOptionPane.showMessageDialog(null, "Potrzebujesz min. "+Test.WORD_COUNT+" słówek w wybranym zbiorze!","Błąd",2);
        }
        else{
            //SystemSlowek system = new SystemSlowek(b1);
            Test t1 = new Test(jComboBox1.getSelectedIndex()+1);
            setVisible(false);
            t1.setVisible(true);
            try {
                t1.nextQuestion();
            } catch (SQLException ex) {
                Logger.getLogger(MenuGlowne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Nauka n1 = new Nauka();
        setVisible(false);
        n1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    //!!!!!!!!!!! JEŚLI z aplikakcji miałby korzystać ktoś inny warto dodać tutaj wiecej ifow!!!!!!!!!!!!!!!!!!
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String text = jTextArea1.getText();
       String english;
       String polish;
       boolean petla=true;
       while(petla){
           int idmyslnik=text.indexOf("--");
           int idkoniec=text.indexOf("\n");
           if(idmyslnik==-1 || (idmyslnik>idkoniec && idkoniec!=-1)){ 
               petla=false;
               break;
           }
           if(idkoniec==-1){
               idkoniec=text.length();
               petla=false;
           }
           english=text.substring(0,idmyslnik).trim();
           polish=text.substring(idmyslnik+2,idkoniec).trim();
           if(idkoniec<text.length())
                text=text.substring(idkoniec+1,text.length());
           else
               text="";
           try {
               //juz  mamy je teraz co z nimi robimy
               SystemSlow.insertWords(english, polish);
           } catch (SQLException ex) {
               Logger.getLogger(MenuGlowne.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
        jTextArea1.setText("");
        refreshListSekcja();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        checkTheCheckBox();
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public void checkTheCheckBox(){
        if(jCheckBox1.isSelected()){
            jTextArea1.setEditable(true);
            jButton3.setEnabled(true);
            jLabel1.setEnabled(true);
            jLabel3.setEnabled(true);
            jLabel4.setEnabled(true);
        }else{
            jTextArea1.setEditable(false);
            jButton3.setEnabled(false);
            jLabel1.setEnabled(false);
            jLabel3.setEnabled(false);
            jLabel4.setEnabled(false);
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
