/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1; //kemasan latihan1

import javax.swing.JOptionPane; //suatu perintah untuk memasukkan suatu method 
        //atau perintah dalam bahasa pemograman java 

/**
 *
 * @author Friska Amelia Vega
 * tanggal 28/03/2022 10:00
 */
import javax.xml.ws.BindingProvider;
public class Login extends javax.swing.JFrame { //sebagai isi folder packeg yang 
    //nantinya dapat diisi dengan beberapa argumen sehingga dapat lebih memudahkan
    //kita saat mencari data
    

    /**
     * Creates new form Login
     */ 
    public Login() { //memberikan akses publik dari sebuah program dijalankan
        initComponents(); //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        apa = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        iya = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(624, 400));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        label3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("PIKACU KASIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setLabel("CANCEL");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setLabel("LOGIN");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        apa.setName("apa"); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("USERNAME");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("PASSWORD");

        iya.setName("iya"); // NOI18N
        iya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apa, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iya, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iya)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        /**
         ** Tombol ini akan membuat sistem keluar
         * Friska
         * 28/03/2022 12:15
         */
        System.exit(0);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
       //Tombol ini berfungsi sebagai pindah halaman
       String uname = "Friska"; //Untuk username dari login
       String pass = "Rahasia"; //Untuk isi password menuju beranda
       beranda beran = new beranda();
       if (apa.getText().equals(uname)&& iya.getText().equals(pass)){
          beran.setVisible(true);
          this.setVisible(false);
       }
       else{
       JOptionPane.showMessageDialog(null, "Maaf nama pengguna atau sandi salah");
       }
        
//        Menu jv = new Menu();
//        jv.setVisible(true);
//        jv.pack();
//        jv.setLocationRelativeTo(null);
//        jv.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
//        
    }//GEN-LAST:event_button4ActionPerformed

    private void iyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iyaActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_iyaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { //hanya menerima perintah main method
        //public static void main, selain itu menghasilkan error pada saat kompilasi program java
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login restan=new Login();
                restan.setLocationRelativeTo(null);
                restan.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField apa;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JPasswordField iya;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
