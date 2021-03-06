/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;


/**
 *
 * @author caoimhemalone
 */
public class LcPhyMS extends javax.swing.JFrame {
    String mark, tips, timing, section;
    int count;
    
    ArrayList <LcPhyMarkingScheme> aListPhyMS = new ArrayList<>();
    /**
     * Creates new form MarkingSchemePhy
     */
    public LcPhyMS() {
        initComponents();
        
        doneBtn.setVisible(false);
        
        LcPhyMarkingScheme m1 = new LcPhyMarkingScheme();
        m1.setMark("120 Marks");
        m1.setTips("<html>Answer three questions from this section. Each question carries 40 marks. This section is worth 30% of the overall paper so each question is worth 10%</html>");
        m1.setTiming("<html>Total time one hour. 5 minutes to read over and pick your three questions, then 20 minutes for each question.</html>");
        m1.setSection("Section A:");
        aListPhyMS.add(m1);
        
        
        LcPhyMarkingScheme m2 = new LcPhyMarkingScheme();
        m2.setMark("280 Marks");
        m2.setTips("<html>Answer five questions from this section. Each question carries 56 marks. This section is worth 70% so each question is worth 14% </html>");
        m2.setTiming("<html>90 minutes for 5 questions. 5 minutes to read over and pick your five questions, then 20 minutes each. 10 minutes at the end to read over your paper.</html>");
        m2.setSection("Section B:");
        aListPhyMS.add(m2);
        
        count = 0;
        markDesLbl.setText(m1.getMark());
        tipsDesLbl.setText(m1.getTips());
        timingDesLbl.setText(m1.getTiming());
        sectionLbl.setText(m1.getSection());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        homeMarSchePhy = new javax.swing.JButton();
        backMarSchePhyHL = new javax.swing.JButton();
        MarSchLbl = new javax.swing.JLabel();
        sectionLbl = new javax.swing.JLabel();
        markLbl = new javax.swing.JLabel();
        tipsLbl = new javax.swing.JLabel();
        timingLbl = new javax.swing.JLabel();
        markDesLbl = new javax.swing.JLabel();
        timingDesLbl = new javax.swing.JLabel();
        tipsDesLbl = new javax.swing.JLabel();
        secBBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        backMarScheOL = new javax.swing.JButton();
        background5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(304, 1000));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 508));
        jPanel1.setLayout(null);

        homeMarSchePhy.setBackground(new java.awt.Color(255, 255, 255));
        homeMarSchePhy.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        homeMarSchePhy.setText("Home");
        homeMarSchePhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMarSchePhyActionPerformed(evt);
            }
        });
        jPanel1.add(homeMarSchePhy);
        homeMarSchePhy.setBounds(6, 6, 125, 75);

        backMarSchePhyHL.setBackground(new java.awt.Color(255, 255, 255));
        backMarSchePhyHL.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backMarSchePhyHL.setText("Back to HL Phy");
        backMarSchePhyHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMarSchePhyHLActionPerformed(evt);
            }
        });
        jPanel1.add(backMarSchePhyHL);
        backMarSchePhyHL.setBounds(404, 23, 168, 58);

        MarSchLbl.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        MarSchLbl.setForeground(new java.awt.Color(255, 255, 0));
        MarSchLbl.setText("Marking Scheme");
        jPanel1.add(MarSchLbl);
        MarSchLbl.setBounds(180, 160, 224, 42);

        sectionLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sectionLbl.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(sectionLbl);
        sectionLbl.setBounds(210, 200, 119, 27);

        markLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        markLbl.setForeground(new java.awt.Color(255, 255, 0));
        markLbl.setText("Mark:");
        jPanel1.add(markLbl);
        markLbl.setBounds(6, 238, 128, 31);

        tipsLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        tipsLbl.setForeground(new java.awt.Color(255, 255, 0));
        tipsLbl.setText("Tips:");
        jPanel1.add(tipsLbl);
        tipsLbl.setBounds(6, 294, 90, 53);

        timingLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        timingLbl.setForeground(new java.awt.Color(255, 255, 0));
        timingLbl.setText("Timing:");
        jPanel1.add(timingLbl);
        timingLbl.setBounds(6, 467, 77, 43);

        markDesLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        markDesLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(markDesLbl);
        markDesLbl.setBounds(152, 238, 151, 31);

        timingDesLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        timingDesLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(timingDesLbl);
        timingDesLbl.setBounds(95, 467, 459, 140);

        tipsDesLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        tipsDesLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tipsDesLbl);
        tipsDesLbl.setBounds(108, 294, 446, 155);

        secBBtn.setBackground(new java.awt.Color(255, 255, 255));
        secBBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        secBBtn.setText("Section B");
        secBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secBBtnActionPerformed(evt);
            }
        });
        jPanel1.add(secBBtn);
        secBBtn.setBounds(20, 610, 251, 51);

        doneBtn.setBackground(new java.awt.Color(255, 255, 255));
        doneBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        doneBtn.setText("Done");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });
        jPanel1.add(doneBtn);
        doneBtn.setBounds(370, 610, 153, 51);

        backMarScheOL.setBackground(new java.awt.Color(255, 255, 255));
        backMarScheOL.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backMarScheOL.setText("Back to OL Phy");
        backMarScheOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMarScheOLActionPerformed(evt);
            }
        });
        jPanel1.add(backMarScheOL);
        backMarScheOL.setBounds(404, 87, 168, 58);

        background5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        background5.setForeground(new java.awt.Color(255, 255, 0));
        background5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/background1.jpg"))); // NOI18N
        jPanel1.add(background5);
        background5.setBounds(-10, 0, 610, 700);

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMarSchePhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMarSchePhyActionPerformed
        // TODO add your handling code here:
        dispose();
        new GUI().setVisible(true);
    }//GEN-LAST:event_homeMarSchePhyActionPerformed

    private void backMarSchePhyHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMarSchePhyHLActionPerformed
        // TODO add your handling code here:
        dispose();
        new LcPhyHL().setVisible(true);
    }//GEN-LAST:event_backMarSchePhyHLActionPerformed

    private void secBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secBBtnActionPerformed
        // TODO add your handling code here:
        count++;
        backMarSchePhyHL.setVisible(false);
        backMarScheOL.setVisible(false);
        
        markDesLbl.setText(aListPhyMS.get(count).getMark());
        tipsDesLbl.setText(aListPhyMS.get(count).getTips());
        timingDesLbl.setText(aListPhyMS.get(count).getTiming());
        sectionLbl.setText(aListPhyMS.get(count).getSection());
        
        if(count == 1){
            doneBtn.setVisible(true);
            secBBtn.setVisible(false);
        }
    }//GEN-LAST:event_secBBtnActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new LcPhyHL().setVisible(true);
    }//GEN-LAST:event_doneBtnActionPerformed

    private void backMarScheOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMarScheOLActionPerformed
        // TODO add your handling code here:
        dispose();
        new LcPhyOL().setVisible(true);
    }//GEN-LAST:event_backMarScheOLActionPerformed

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
            java.util.logging.Logger.getLogger(LcPhyMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LcPhyMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LcPhyMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LcPhyMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LcPhyMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MarSchLbl;
    private javax.swing.JButton backMarScheOL;
    private javax.swing.JButton backMarSchePhyHL;
    private javax.swing.JLabel background5;
    private javax.swing.JButton doneBtn;
    private javax.swing.JButton homeMarSchePhy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel markDesLbl;
    private javax.swing.JLabel markLbl;
    private javax.swing.JButton secBBtn;
    private javax.swing.JLabel sectionLbl;
    private javax.swing.JLabel timingDesLbl;
    private javax.swing.JLabel timingLbl;
    private javax.swing.JLabel tipsDesLbl;
    private javax.swing.JLabel tipsLbl;
    // End of variables declaration//GEN-END:variables
}
