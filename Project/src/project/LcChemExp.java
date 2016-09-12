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
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Evan
 */
public class LcChemExp extends javax.swing.JFrame {

    String name, description, home;
    int count;
    ArrayList<Experiment> aListExp = new ArrayList<>();
    ListIterator newList;

    /**
     * Creates new form lcChemExp
     */
    public LcChemExp() {
        initComponents();
        count = 0;
        showExpNameLbl.setText("The Experiment Name");
        descBoxLbl.setText("<html>This is the Leaving Certificate Chemistry Experiments section. Your Experiment Description will be placed here, with a diagram below. To start viewing the Experiments, click the Start button below.</html>");
        home = "";

        Experiment e1 = new Experiment();
        e1.setName("<html>Flame Tests</html>");
        e1.setDescription("<html>The characterisitc colours given off when salts of certain metals are heated in the flame of a a Bunsen burner are noted. The colours obtained can then be used to idetify the metals present in unknown compounds.</html>");
        e1.setDiagram(new ImageIcon("dia1.png"));
        aListExp.add(e1);

        Experiment e2 = new Experiment();
        e2.setName("<html>Monitoring the rate of production of oxygen from hydrogen peroxide using manganese dioxide as a catalyst</html>");
        e2.setDescription("<html>Hydrogen proxide decomposes into water and oxygen. This occurs much too slowly to be monitored. However, manganese dioxide acts as a suitable catalyst, and the reactio occurs at a measurable rate.</html>");
        e2.setDiagram(new ImageIcon("dia2.png"));
        aListExp.add(e2);

        Experiment e3 = new Experiment();
        e3.setName("<html>Determination of total dissolved solids in a water sample by evaporation</html>");
        e3.setDescription("<html>Dissolved solids can affect the colour or taste of water and, if very high, may be an indication that the water sample is saline. Determination of total dissolved solids is done by evaporating a known volume of the filtered water sample. The increase in mass of the container is then determined.</html>");
        e3.setDiagram(new ImageIcon("dia3.png"));
        aListExp.add(e3);

        Experiment e4 = new Experiment();
        e4.setName("<html>Determination of pH of a water sample</html>");
        e4.setDescription("<html>The pH of a solution may be measured by using a pH meter, pH paper or univesal indicator solution. The colour reading from the paper or solution can be matched against a chart and will determine a pH number estimate.</html>");
        e4.setDiagram(new ImageIcon("dia4.png"));
        aListExp.add(e4);

        Experiment e5 = new Experiment();
        e5.setName("<html>Estimation of the relative molecular mass of a volatile liquid</html>");
        e5.setDescription("<html>In order to find the relative moleclar mass of a substance, a sample of the substance, the mass of which is known, is taken. If it is possible to find the number of moles in the sample it is possible to calculate the mass of one mole.</html>");
        e5.setDiagram(new ImageIcon("dia5.png"));
        aListExp.add(e5);

        Experiment e6 = new Experiment();
        e6.setName("<html>Determination of the heat of reaction of hydrochloric acid with sodium hydroxide</html>");
        e6.setDescription("<html>In this experiment a known number of moles of hydrochloric acid is mixed with an equal number of moles of sodium hydoxide in an insulaed container. The rise in temperature of the mixture is then measured and from this the heat of reaction if calculated.</html>");
        e6.setDiagram(new ImageIcon("dia6.png"));
        aListExp.add(e6);

        Experiment e7 = new Experiment();
        e7.setName("<html>Studying the effects on reaction rate of concentration</html>");
        e7.setDescription("<html>The reastion used is that between sodium thiosulfate and hydrochlori acid. The precipitate of sulfur formed gradually obscures a cross marked on paper and placed beneath the reaction flask. The rate of reaction, and consequently the time taken to obscure the cross, depends on a number of variables such as temperature, concentration and volume. By varying one of these and keeping the other constant, the feect on rate can be studied. The inverse of the time taken to obscure the cross is the measure of reaction rate used in this experiment.</html>");
        e7.setDiagram(new ImageIcon("dia7.png"));
        aListExp.add(e7);

        Experiment e8 = new Experiment();
        e8.setName("<html>Separation of a mixture of indicators using thin layer chromatography</html>");
        e8.setDescription("<html>Chromatography involves the use of a mobile phase and a stantionary phase to seperate the components of a mixture from each other. The seperation is based on the fact that different components of a mixture are more soluble than others. The components that are not very soluble will come out of the soluction and will appear as a spot on the paper. The components that are more soluble will rise further and eventually appear as spots at a different and higher point on the paper.</html>");
        e8.setDiagram(new ImageIcon("dia8.png"));
        aListExp.add(e8);

        Experiment e9 = new Experiment();
        e9.setName("<html>Determination of the percentage (w/v) of hypochlorite in bleach</html");
        e9.setDescription("<html>Hypochlorite ion reacts with excess iodide ion in the presence of acid to generate an iodine solution. The liberated iodine solution can be titrated against sodium thiosulfate solution using a freshly prepared starch solution as indicator. Starch indicator is added during the titration when the colour of the solution in the conical flask fades to a pale yellow colour. The solution becomes blue-black, and the titration is continued until it goes colourless.</html>");
        e9.setDiagram(new ImageIcon("dia9.png"));
        aListExp.add(e9);

        Experiment e10 = new Experiment();
        e10.setName("<html>To prepare ethene and examine it's properties</html>");
        e10.setDescription("<html>The purpose of this experiment was to prepare samples of ethene gas by dehydrating ethanol using aluminium oxide as a dehydrating agent and catalyst and then to perform various tests on the gas obtained to examine its properties.</html>");
        e10.setDiagram(new ImageIcon("dia10.png"));
        aListExp.add(e10);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("chemExp.txt");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(aListExp);
            oStream.close();
        } catch (IOException e) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        expTitleLbl = new javax.swing.JLabel();
        expNameLbl = new javax.swing.JLabel();
        showExpNameLbl = new javax.swing.JLabel();
        expDescLbl = new javax.swing.JLabel();
        diaLbl = new javax.swing.JLabel();
        descBoxLbl = new javax.swing.JLabel();
        diaBoxLbl = new javax.swing.JLabel();
        bgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<--  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(40, 600, 100, 29);

        nextBtn.setText("Start");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(440, 600, 80, 29);

        expTitleLbl.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        expTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        expTitleLbl.setText("Experiments");
        getContentPane().add(expTitleLbl);
        expTitleLbl.setBounds(220, 20, 150, 28);

        expNameLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        expNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        expNameLbl.setText("Experiment Name:");
        getContentPane().add(expNameLbl);
        expNameLbl.setBounds(50, 100, 117, 17);

        showExpNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(showExpNameLbl);
        showExpNameLbl.setBounds(180, 120, 280, 70);

        expDescLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        expDescLbl.setForeground(new java.awt.Color(255, 255, 255));
        expDescLbl.setText("Experiment Description:");
        getContentPane().add(expDescLbl);
        expDescLbl.setBounds(50, 210, 152, 17);

        diaLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        diaLbl.setForeground(new java.awt.Color(255, 255, 255));
        diaLbl.setText("Diagram:");
        getContentPane().add(diaLbl);
        diaLbl.setBounds(50, 420, 57, 17);

        descBoxLbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(descBoxLbl);
        descBoxLbl.setBounds(140, 230, 350, 180);

        diaBoxLbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(diaBoxLbl);
        diaBoxLbl.setBounds(150, 420, 330, 160);

        bgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/chemBG.jpg"))); // NOI18N
        getContentPane().add(bgLbl);
        bgLbl.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadFile() {
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        try {
            inFile = new File("chemExp.txt");
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


    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        nextBtn.setText("Next -->");

        if (newList.hasNext()) {
            Experiment ex = (Experiment) newList.next();
            showExpNameLbl.setText(ex.getName());
            descBoxLbl.setText(ex.getDescription());
            diaBoxLbl.setIcon(ex.getDiagram());
        }

        
        if(count == 9 || count ==10){
            nextBtn.setText("Finish");
        }
        if (count == 10) {
            home = JOptionPane.showInputDialog(null, "This is the end of the Experiments would you like to return to Leaving Cert Chemistry? y/n");
            if (home.equalsIgnoreCase("y"));
            {
                dispose();
                new LcChem().setVisible(true);
            }
        }
        count++;
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (newList.hasPrevious()) {
            Experiment ex = (Experiment) newList.previous();
            showExpNameLbl.setText(ex.getName());
            descBoxLbl.setText(ex.getDescription());
            diaBoxLbl.setIcon(ex.getDiagram());
        }
        
        if(count == 0){
            dispose();
            new LcChem().setVisible(true);
        }
        count--;
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
            java.util.logging.Logger.getLogger(LcChemExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LcChemExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LcChemExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LcChemExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LcChemExp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bgLbl;
    private javax.swing.JLabel descBoxLbl;
    private javax.swing.JLabel diaBoxLbl;
    private javax.swing.JLabel diaLbl;
    private javax.swing.JLabel expDescLbl;
    private javax.swing.JLabel expNameLbl;
    private javax.swing.JLabel expTitleLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel showExpNameLbl;
    // End of variables declaration//GEN-END:variables
}
