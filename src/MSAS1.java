/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */
public class MSAS1 extends javax.swing.JFrame {

    /**
     * Creates new form MSAS1
     */
    public MSAS1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        check = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        Check_Expiry = new javax.swing.JButton();
        jit = new javax.swing.JButton();
        pass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 77, 224));
        jLabel1.setText("Medical Shop Automation Software");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 490, 49));

        report.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        report.setText("Report_Card");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        getContentPane().add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 150, 30));

        check.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        check.setText("Check Avail Stock");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, 30));

        jButton3.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        sales.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        sales.setText("SalesInfo");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        getContentPane().add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        jButton5.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jButton5.setText("Threshold value");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 150, 30));

        add.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        add.setText("Add Stock");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        Check_Expiry.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Check_Expiry.setText("Check Expiry");
        Check_Expiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_ExpiryActionPerformed(evt);
            }
        });
        getContentPane().add(Check_Expiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, 30));

        jit.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jit.setText("JIT Checker");
        jit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitActionPerformed(evt);
            }
        });
        getContentPane().add(jit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 150, 30));

        pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy.jpg"))); // NOI18N
        pass.setMinimumSize(new java.awt.Dimension(1920, 1200));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 340));

        jButton1.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Search srch = new Search();
        srch.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitActionPerformed
        // TODO add your handling code here:
        JIT jit = new JIT();
        jit.setVisible(true);
    }//GEN-LAST:event_jitActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        AddStock add = new AddStock();
        add.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void Check_ExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_ExpiryActionPerformed
        // TODO add your handling code here:
        CheckExpiry exp = new CheckExpiry();
        exp.setVisible(true);
    }//GEN-LAST:event_Check_ExpiryActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        CheckStock check = new CheckStock();
        check.setVisible(true);
    }//GEN-LAST:event_checkActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        // TODO add your handling code here:
        Sales s = new Sales();
        s.setVisible(true);
    }//GEN-LAST:event_salesActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
        Report rep = new Report();
        rep.setVisible(true);
    }//GEN-LAST:event_reportActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Threshold th = new Threshold();
        th.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChangePassword psw = new ChangePassword();
        psw.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MSAS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MSAS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MSAS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MSAS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MSAS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check_Expiry;
    private javax.swing.JButton add;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jit;
    private javax.swing.JLabel pass;
    private javax.swing.JButton report;
    private javax.swing.JButton sales;
    // End of variables declaration//GEN-END:variables
}
