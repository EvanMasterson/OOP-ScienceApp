/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.ModuleDescription;

/**
 *
 * @author Liam
 */
public class JcMD extends javax.swing.JFrame {

    /**
     * Creates new form moduleDescription
     */
    public JcMD() {
        initComponents();
        
        ModuleDescription md = new ModuleDescription(); 
        
        md.setName("Junior Certificate Science");
        md.setDuration("3 Year Course");
        md.setDescription("Junior Certificate Science is a 3 year course, "
            + " \nin which you learn about the 3 areas of Science,"
            + " \nBiology, Chemistry and Physics."
            + " \n"
            + " \nThrough out this course you do various experiments"
            + " \nand complete and experiment book that goes towards"
            + " \nyour final grade."
            + " \n"
            + " \nThis subject allows for you to get the understanding"
            + " \nare world works and what are all the possibilities "
            + " \non how you can extend your knowledge so you can learn"
            + " \nmore and get a better understanding on how every living thing"
            + " \nor object works.");
        
        mdTitleLbl.setText(md.getName());
        durLbl.setText(md.getDuration());
        DescriptionArea.setText(md.getDescription());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcTitleLbl = new javax.swing.JLabel();
        mdTitleLbl = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        durLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        jcTitleLbl.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jcTitleLbl.setText("    Junior Certificate Science");
        getContentPane().add(jcTitleLbl);
        jcTitleLbl.setBounds(177, 6, 240, 49);

        mdTitleLbl.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        mdTitleLbl.setText("   Module Description");
        getContentPane().add(mdTitleLbl);
        mdTitleLbl.setBounds(67, 101, 256, 39);

        imageLbl.setText(" ");
        getContentPane().add(imageLbl);
        imageLbl.setBounds(122, 493, 70, 49);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<-- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(10, 630, 95, 29);

        durLbl.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        durLbl.setText("           Duration");
        getContentPane().add(durLbl);
        durLbl.setBounds(365, 104, 159, 32);

        DescriptionArea.setEditable(false);
        DescriptionArea.setBackground(new java.awt.Color(238, 238, 238));
        DescriptionArea.setColumns(20);
        DescriptionArea.setRows(5);
        jScrollPane1.setViewportView(DescriptionArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(67, 210, 457, 277);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/science-background-vector-371523.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new JcScience().setVisible(true);    
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
            java.util.logging.Logger.getLogger(JcMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcMD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionArea;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel durLbl;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcTitleLbl;
    private javax.swing.JLabel mdTitleLbl;
    // End of variables declaration//GEN-END:variables
}
