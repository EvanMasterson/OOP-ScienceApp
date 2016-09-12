/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.*;
import project.Experiment;
import project.LcChem;


/**
 *
 * @author x14426302
 */
public class JcExp extends javax.swing.JFrame{
    String name,description,home;
    int count;
    ArrayList <Experiment> aListExp = new ArrayList <>();
    ListIterator newList;
    
    
    
    
    /**
     * Creates new form exp
     */
    public JcExp() {
        initComponents();
        count = 0;
        expNameLbl.setText("The Experiment Name");
        descBoxLbl.setText("<html>This is the Leaving Certificate Chemistry Experiments section. Your Experiment Description will be placed here, with a diagram below. To start viewing the Experiments, click the Start button below.</html>");
        home = "";
        ExpNameLbl.setText("");

        
        Experiment e1 = new Experiment();
        e1.setName("<html>Investigate the conditions necessary for germination</html>");
        e1.setDescription("<html>Place cress seeds and cotton wool in each test-tube, leave test tube A as it is [without water], add a little water to test tube B [this one now has moisture, oxygen and heat], keep test tube C (containing moist cotton wool) in the fridge [there is no heat], add water which has cooled after boiling to test tube D and cover it with oil [no oxygen].</html>");
        e1.setDiagram(new ImageIcon ("diag1.png"));
        aListExp.add(e1);
        
        Experiment e2 = new Experiment();
        e2.setName("<html>Investigate the pH of a variety of materials using the pH scale</html>");
        e2.setDescription("<html>Put substances in test tubes (they must be dissolved in water if they are not a liquid). Pour in a few drops of universal indicator and shake well (the colour will change according to how acidic or basic the substance is). Use the pH scale to write up results. </html>");
        e2.setDiagram(new ImageIcon ("diag2.png"));
        aListExp.add(e2);
        
        Experiment e3 = new Experiment();
        e3.setName("<html>Prepare carbon dioxide and show that it does not support combustion.</html>");
        e3.setDescription("<html>Set up as shown (calcium carbonate is the chemical name for marble chips). Slowly release the hydrochloric acid into the flask underneath.</html>");
        e3.setDiagram(new ImageIcon ("diag3.png"));
        aListExp.add(e3);
        
        Experiment e4 = new Experiment();
        e4.setName("<html>Investigate the relationship between the extension of a spring and the applied force.</html>");
        e4.setDescription("<html>Use a newton-meter to stretch a spring (or hang weights from the spring as shown). Note the extension and the force used and record the results in a table. Repeat for lot of different forces. Plot a graph of force used against extension. Result: You should get the graph on a straight line</html>");
        e4.setDiagram(new ImageIcon ("diag4.png"));
        aListExp.add(e4);
        
        Experiment e5 = new Experiment();
        e5.setName("<html>Show that starch is produced by a photo-synthesising plant</html>");
        e5.setDescription("<html>Place a plant in the dark for a few days so that all the starch is removed. Place aluminium foil over one of the leaves and put the plant in strong sunlightfor a day. Put the leaves in boiling water for a minute to kill and soften them. Soak the leaves in alcohol for a few minutes to remove the chlorophyll (this also makes them brittle). Dip the leaves in boiling water again rinse and soften them. Test for starch by putting drops of iodine on the leaves.</html>");
        e5.setDiagram(new ImageIcon ("diag5.png"));
        aListExp.add(e5);
        
        Experiment e6 = new Experiment();
        e6.setName("<html>Set up a simple electric circuit; use appropriate instruments to measure current, potential difference(voltage) and resistance, and establish the relationship between them.</html>");
        e6.setDescription("<html>Note the current (I) and potential difference (V). Adjust the variable resistor (rheostat) to get a new set of values. Repeat about 6 times and then plot a graph of potentialdifference against current. Record the results in a table and then draw a graph of  potential difference against current.</html>");
        e6.setDiagram(new ImageIcon ("diag6.png"));
        aListExp.add(e6);
    
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            outFile = new File("JCScienceExp.txt");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(aListExp);
            oStream.close();
        } 
        catch(IOException e){
            System.out.println(e);
        }

        loadFile();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void loadFile() {
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        try {
            inFile = new File("JCScienceExp.txt");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<Experiment> aListExp;
            aListExp = (ArrayList<Experiment>) oStream.readObject();
            newList = aListExp.listIterator();
            oStream.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expTitleLbl = new javax.swing.JLabel();
        expNameLbl = new javax.swing.JLabel();
        expDescLbl = new javax.swing.JLabel();
        ExpNameLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nxtBtn = new javax.swing.JButton();
        descBoxLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 650));
        setMinimumSize(new java.awt.Dimension(600, 650));
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        expTitleLbl.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        expTitleLbl.setText("Junior Certificate Science");
        getContentPane().add(expTitleLbl);
        expTitleLbl.setBounds(197, 6, 202, 21);

        expNameLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        expNameLbl.setText("Experiment Name:");
        getContentPane().add(expNameLbl);
        expNameLbl.setBounds(27, 61, 117, 91);

        expDescLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        expDescLbl.setText("                                         Experiment Description:");
        getContentPane().add(expDescLbl);
        expDescLbl.setBounds(102, 200, 380, 17);

        ExpNameLbl.setText("NAME HERE");
        getContentPane().add(ExpNameLbl);
        ExpNameLbl.setBounds(316, 61, 238, 91);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<-- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(84, 594, 124, 29);

        nxtBtn.setText("Start");
        nxtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nxtBtn);
        nxtBtn.setBounds(380, 600, 139, 29);
        getContentPane().add(descBoxLbl);
        descBoxLbl.setBounds(6, 223, 573, 141);

        jScrollPane1.setViewportView(imageLabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 573, 218);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/science-background-vector-371523.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new JcScience().setVisible(true); 
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void nxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtnActionPerformed

        nxtBtn.setText("Next -->");
        
//        ExpNameLbl.setText(aListExp.get(count).getName());
//        descBoxLbl.setText(aListExp.get(count).getDescription());
//        imageLabel.setIcon(aListExp.get(count).getDiagram());
        
        
        if(count == 5 || count == 6){
            nxtBtn.setText("Finish");
        }
        
        if (newList.hasNext()) {
            Experiment ex = (Experiment) newList.next();
            ExpNameLbl.setText(ex.getName());
            descBoxLbl.setText(ex.getDescription());
            imageLabel.setIcon(ex.getDiagram());
        }
        
        if (count == 6) {
            home = JOptionPane.showInputDialog(null, "This is the end of the Experiments would you like to return to Junior Certificate Science? y/n");
            if (home.equalsIgnoreCase("y"));
            {
                dispose();
                new JcScience().setVisible(true);
            } 
        }
         
        count++;
            // TODO add your handling code here:
    }//GEN-LAST:event_nxtBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JcExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcExp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExpNameLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel descBoxLbl;
    private javax.swing.JLabel expDescLbl;
    private javax.swing.JLabel expNameLbl;
    private javax.swing.JLabel expTitleLbl;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nxtBtn;
    // End of variables declaration//GEN-END:variables
}
