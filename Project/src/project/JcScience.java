/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.GUI;

/**
 *
 * @author x14426302
 */
public class JcScience extends javax.swing.JFrame {

    /**
     * Creates new form lcChem
     */
    public JcScience() {
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

        titleLbl = new javax.swing.JLabel();
        mdBtn = new javax.swing.JButton();
        msBtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();
        expBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        titleLbl.setText("Junior Certificate Science");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(196, 25, 202, 21);

        mdBtn.setText("Module Desciption");
        mdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mdBtn);
        mdBtn.setBounds(205, 108, 180, 83);

        msBtn.setText("Marking Scheme");
        msBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msBtnActionPerformed(evt);
            }
        });
        getContentPane().add(msBtn);
        msBtn.setBounds(205, 245, 180, 83);

        quizBtn.setText("Quiz");
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quizBtn);
        quizBtn.setBounds(205, 379, 180, 83);

        expBtn.setText("Experiments");
        expBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expBtnActionPerformed(evt);
            }
        });
        getContentPane().add(expBtn);
        expBtn.setBounds(205, 534, 180, 83);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<-- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(6, 611, 95, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/science-background-vector-371523.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void expBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expBtnActionPerformed
        // TODO add your handling code here:
        new JcExp().setVisible(true);
        dispose();
    }//GEN-LAST:event_expBtnActionPerformed

    private void mdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdBtnActionPerformed
        new JcMD().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_mdBtnActionPerformed

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        new JcQuiz().setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_quizBtnActionPerformed

    private void msBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msBtnActionPerformed
        new JcMS().setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_msBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new GUI().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JcScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcScience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton expBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mdBtn;
    private javax.swing.JButton msBtn;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
