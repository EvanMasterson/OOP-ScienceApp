package project;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class JcMS extends javax.swing.JFrame {
    
    private final ArrayList <MarkingSchemeJC> aList;
    
   
    private int grade1, grade2, grade3;
    
    private int count;

    /**
     * Creates new form BioMarkingSchemeGUI
     */
    public JcMS() {
        initComponents();
        
        MarkingScheme ms = new MarkingScheme();
        MarkingSchemeJC mj = new MarkingSchemeJC();
        
        //initialise variables
        aList = new ArrayList<>();
        
        grade1 = 0;
        grade2 = 0;
        grade3 = 0;
        count = 0;
        
        section1.setText(mj.getSection1());
        section2.setText(mj.getSection2());
        section3.setText(mj.getSection3());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        section1 = new javax.swing.JLabel();
        section2 = new javax.swing.JLabel();
        section3 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        TF3 = new javax.swing.JTextField();
        ResetBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(0, 640, 75, 29);

        btnSubmit.setText("Submit Answers");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(280, 640, 145, 29);

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisplay);
        btnDisplay.setBounds(490, 640, 91, 29);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Junior Certificate Marking Scheme");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(139, 6, 321, 21);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel2.setText("Please enter the marks you got for each section. All out of 130:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(73, 77, 460, 57);

        section1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        section1.setText("Enter Section A marks:");
        getContentPane().add(section1);
        section1.setBounds(0, 225, 113, 14);

        section2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        section2.setText("Enter Section B marks:");
        getContentPane().add(section2);
        section2.setBounds(6, 375, 113, 14);

        section3.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        section3.setText("Enter Section C marks:");
        getContentPane().add(section3);
        section3.setBounds(6, 577, 113, 14);

        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF1);
        TF1.setBounds(244, 217, 273, 28);
        getContentPane().add(TF2);
        TF2.setBounds(244, 367, 273, 28);
        getContentPane().add(TF3);
        TF3.setBounds(244, 563, 273, 28);

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn);
        ResetBtn.setBounds(140, 640, 78, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/science-background-vector-371523.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         dispose();
        new JcScience ().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //getting text from texfields
        grade1 = Integer.parseInt(TF1.getText());
        grade2 = Integer.parseInt(TF2.getText());
        grade3 = Integer.parseInt(TF3.getText());
        
        
        MarkingSchemeJC a = new MarkingSchemeJC();
        
        a.setGrade1(grade1);
        a.setGrade2(grade2);
        a.setGrade3(grade3);
        
        
        //adding object to ArrayList
        aList.add(a);
        
        count++;
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
         //loop
        
        MarkingScheme ms = new MarkingScheme();
        MarkingSchemeJC jc = new MarkingSchemeJC();
        
        for (int i = 0; i < aList.size(); i = 1 + 1) {
    
        JOptionPane.showMessageDialog(null, "Section: " + jc.getSection1() + " percentage: " + ((aList.get(i).getGrade1() * 100) /130) + "%"
                + 
                 "\n Section: " + jc.getSection2() + " percentage: " + ((aList.get(i).getGrade2() * 100) / 130) + "%"
                
                + " \n Section: " + jc.getSection3() + " percentage: " + ((aList.get(i).getGrade3() * 100) / 130) + "%"
                
        );
        }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        TF1.setText(""); 
        TF2.setText("");
        TF3.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

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
            java.util.logging.Logger.getLogger(JcMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel section1;
    private javax.swing.JLabel section2;
    private javax.swing.JLabel section3;
    // End of variables declaration//GEN-END:variables

    
}