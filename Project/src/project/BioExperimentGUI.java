package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author barry
 */
public class BioExperimentGUI extends javax.swing.JFrame {
    
    String name,description,home;
    int count;
    ArrayList <Experiment> aListExp = new ArrayList <>();

    /**
     * Creates new form BioExperimentGUI
     */
    public BioExperimentGUI() {
        initComponents();
        
    count = 0;
        showExpNameLbl.setText("The Experiment Name");
        descBoxLbl.setText("<html>This is the Leaving Certificate Biology Experiments section. Your Experiment Description will be placed here, with a diagram below. To start viewing the Experiments, click the Start button below.</html>");
        home = "";

        
        Experiment e1 = new Experiment();
        e1.setName("<html>The Microscope</html>");
        e1.setDescription("<html>For this apparatus you are required to know the features of the microscope and where they are situated. There are 11 features, see diagram below.</html>");
        e1.setDiagram(new ImageIcon ("d1.png"));
        aListExp.add(e1);
        
        Experiment e2 = new Experiment();
        e2.setName("<html>Preparing Animal Cells for Microscopic Examination</html>");
        e2.setDescription("<html> 1. Use a clean sterile toothpick to scrape gently across the inside of your cheek. 2. Spread the scrape thinly onto a glass microscope slie. 3. Place a drop of water onto the smear. 4. Cover with coverslip. </html>");
        e2.setDiagram(new ImageIcon ("d2.png"));
        aListExp.add(e2);
        
        Experiment e3 = new Experiment();
        e3.setName("<html>Preparing Plant Cells for Microscopic Examination</html>");
        e3.setDescription("<html>1. Cut onion bulb vertically in half. 2. Pull out a section of one half to expose the concave surface of a fleshy leaf. 3.Place the union epidermis in the centre of a clean glass slide. 4.Place a few drops of yellow-brown iodine stain onto the epidermis square.</html>");
        e3.setDiagram(new ImageIcon ("d3.png"));
        aListExp.add(e3);
        
        Experiment e4 = new Experiment();
        e4.setName("<html>Demonstration of Osmosis</html>");
        e4.setDescription("<html>1. Tie a knot at one end of a short length of visking tubing. 2. Half fill a length of tubing with a strong sucros solution. 3. Using a balance find and record the mass of each tube. 4. Record the mass, firmness and size. </html>");
        e4.setDiagram(new ImageIcon ("d4.png"));
        aListExp.add(e4);
        
        Experiment e5 = new Experiment();
        e5.setName("<html>To Investigate the Effect of pH on the Rate of Enzyme Action.</html>");
        e5.setDescription("<html>1. Substrate: starch. 2. Enzyme: amylase. 3. Temperature: 37 degrees C 4. Use a range of buffer solutions from pH3 to pH11. A buffer solution will remain at its pH despite dilution or addition of a small amount of acid or alkali that may form during the process.</html>");
        e5.setDiagram(new ImageIcon ("d5.png"));
        aListExp.add(e5);
        
        Experiment e6 = new Experiment();
        e6.setName("<html>Prepare and Demonstrate an Enzyme Immobilisation Procedure</html>");
        e6.setDescription("<html>1. Add 1g of sodum alginate to 25cm^2 of distilled water. 2. Premate 20 cm^3 of amylase solution. 3. Draw some of this mixture into a syringe. 4. Gently squeeze out the amylase-alginate mixture drop by drop into the calcium chloride solution.</html>");
        e6.setDiagram(new ImageIcon ("d6.png"));
        aListExp.add(e6);
        
        Experiment e7 = new Experiment();
        e7.setName("<html>To investigate the Influence of Light Intensity on the Rate of Photosynthesis</html>");
        e7.setDescription("<html>1. Constant temperature of 25 degrees C. 2. Constant saturated CO2 solution. 3. The only light source is the lamp. 4. The lght intensity is varied by changing the distance of the lamp.</html>");
        e7.setDiagram(new ImageIcon ("d7.png"));
        aListExp.add(e7);
        
        Experiment e8 = new Experiment();
        e8.setName("<html>To Prepare and Show the Production of Alcohol by Yeast</html>");
        e8.setDescription("<html>1. Control: glucose solution. 2. The heating tray is used to maintain a favourable temperature of 25 degrees C. 3. The fermentation lock allows carbon dioxide gas produced by yeast fermentation to escape but prevents the entry of air. 4. A sterilising tablet should be placed in the air trap to prevent bacterial ontamination.</html>");
        e8.setDiagram(new ImageIcon ("d8.png"));
        aListExp.add(e8);
        
        Experiment e9 = new Experiment();
        e9.setName("<html>Extraction of DNA from Onion Cells</html");
        e9.setDescription("<html>1. Put a small piece of fresh onion in a small beaker of salt solution. 2. The detergent breaks down the cell membranes, setting the chromatin free. 3. Add protease solution to the liquid and mix well. 4. At the boundary of the two layers, carefully twirl the scord end of a glass rod. A mucus-like material is collected at the end of the rod - this is DNA.</html>");
        e9.setDiagram(new ImageIcon ("d9.png"));
        aListExp.add(e9);
        
        Experiment e10 = new Experiment();
        e10.setName("<html>Cultering Leaf Yeasts</html>");
        e10.setDescription("<html>1. Use four sterile malt agar plates. 2. Seal one plate and on the base, label it 'control' with waterproof ink. 3. Open plate 2 and turn the base upside down to prevent contamination of the agar. With a sterile forceps and scissors, cut a small pieces of ash leaflet. 4. Repeat again for third plate with the lower surface in contact with the jelly.</html>");
        e10.setDiagram(new ImageIcon ("d10.png"));
        aListExp.add(e10);
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showExpNameLbl = new javax.swing.JLabel();
        descBoxLbl = new javax.swing.JLabel();
        diaBoxLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(0, 0, 80, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(0, 568, 80, 23);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Experiments");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(134, 29, 118, 21);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Experiment Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 109, 14);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Experiment Description:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 136, 140, 14);

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Diagram:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 269, 55, 14);

        showExpNameLbl.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(showExpNameLbl);
        showExpNameLbl.setBounds(159, 78, 419, 26);

        descBoxLbl.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(descBoxLbl);
        descBoxLbl.setBounds(20, 161, 509, 90);

        diaBoxLbl.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(diaBoxLbl);
        diaBoxLbl.setBounds(83, 297, 607, 210);

        nextBtn.setText("Start");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(440, 570, 80, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/bioBG.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
         nextBtn.setText("Next -->");
        showExpNameLbl.setText(aListExp.get(count).getName());
        descBoxLbl.setText(aListExp.get(count).getDescription());
        diaBoxLbl.setIcon(aListExp.get(count).getDiagram());
        count++;

        if(count == 10){
            home = JOptionPane.showInputDialog(null,"This is the end of the Experiments would you like to return to Leaving Cert Biology? yes/no");
            if(home.equalsIgnoreCase("yes"));{
                dispose();
                new LcBio().setVisible(true);
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
         dispose();
        new GUI ().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         dispose();
        new LcBio ().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(BioExperimentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BioExperimentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BioExperimentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BioExperimentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioExperimentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel descBoxLbl;
    private javax.swing.JLabel diaBoxLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel showExpNameLbl;
    // End of variables declaration//GEN-END:variables
}
