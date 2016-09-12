/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author caoimhemalone
 */
public class LcPhyExp extends javax.swing.JFrame {
    String  name, description, topic, apparatus;
    int count;
    ImageIcon diagram;

    ArrayList <Experiment> aListPhyExp = new ArrayList <>();

    

    /**
     * Creates new form ExperimentsPhy
     */
    public LcPhyExp() {
       initComponents();
        doneBtn.setVisible(false);
        
        
        Experiment e1 = new Experiment();
        e1.setTopic("Refraction");
        e1.setName("<html> Verification of Snell's Law of refraction </html>");
        e1.setApparatus("<html> Glass Block, ray-box, protractor, page </html>");
        e1.setDescription("<html> 1.Place a glass block on the page and mark its outline. 2.Shine a ray of light from the ray-box into the glass block. 3.Mark two dots on the incident ray and exit ray and draw the outline of the block. 4.Remove the block and complete all lines including the normal, as indicated on the diagram. 5.Measure the angle of incidence i and angle of refraction r using the protractor. 6.Repeat for different values of i. 7.Draw up a table as shown. 8.Plot a graph of sin i against sin r. A straight line through the origin verifies Snell’s law of refraction i.e. sin i ∝ sin r. 9.The slope of the line gives a value for the refractive index of glass.\" </html>");
        e1.setDiagram(new ImageIcon("snellslaw.png"));
        
        aListPhyExp.add(e1); 

        Experiment e2 = new Experiment();
        e2.setTopic("Acceleration");
        e2.setName("<html> Measurement of acceleration due to gravity (g) using the freefall method </html>");
        e2.setApparatus("<html> Millisecond timer, metal ball, trapdoor and electromagnet. </html>");
        e2.setDescription("<html> 1.Set up the apparatus as shown. The millisecond timer starts when the ball is released and stops when the ball hits the trapdoor. 2.Measure the distance s using a metre stick.  3.Flick the switch to release the ball and record the time t from the millisecond timer.  4.Repeat for different values of s.  5.Calculate the values for g using the equation s = (g/2) t2. Obtain an average value for g.  6.Draw a graph of s against t2 and use the slope to find a value for g (g will be twice the slope). </html>");
        e2.setDiagram(new ImageIcon("freefall.png"));
        aListPhyExp.add(e2);

        Experiment e3 = new Experiment();
        e3.setTopic("Pressure");
        e3.setName("<html> Verification of Boyle's Law </html>");
        e3.setApparatus("<html> Pressure gauge, syringe </html>");
        e3.setDescription("<html> 1.The tube is filled with air.  2.Note the pressure of the gas from the pressure-gauge and the volume from the graduated scale.  3.Turn the screw to decrease the volume and increase the pressure.  4.Note the new readings and repeat to get about seven readings.  5.Draw a graph of pressure against 1/volume. This should result in a straight line through the origin. </html>");
        e3.setDiagram(new ImageIcon("Boyleslaw.png"));
        aListPhyExp.add(e3);

        Experiment e4 = new Experiment();
        e4.setTopic("Heat");
        e4.setName("<html> Measurement of Specific Heat Capacity of water </html>");
        e4.setApparatus("<html> Power supply, joulemeter, heating coil, calorimeter, thermometer, electronic balance. </html>");
        e4.setDescription("<html> 1.Find the mass of the water by first measuring the mass of the empty calorimeter, then the mass of the calorimeter with water in it, and subtracting one form the other.  2.Set up the apparatus as shown in the diagram (with a power supply connected to the joulemeter).  3.Record the initial temperature of the water (we assume this to be the same temperature as the calorimeter).  4.Switch on the power supply and allow the temperature of the water to rise by about 10 degrees.  5.Switch off the power supply.  6.Note the reading on the joulemeter and the final temperature of the water (and calorimeter).  7.Calculate the specific heat capacity of water (cwater) using the equation: Energy Supplied = (mcΔθ)cal + (mcΔθ)water </html>");
        e4.setDiagram(new ImageIcon("SHC.png"));
        aListPhyExp.add(e4);

        Experiment e5 = new Experiment();
        e5.setTopic("Currents");
        e5.setName("<html> To verify Joule's Law </html>");
        e5.setApparatus("<html> Calorimeter with a lid, heating coil, power supply, rheostat, ammeter, thermometer, stopwatch, electronic balance. </html>");
        e5.setDescription("<html> 1.Set up the circuit as shown.  2.Note the temperature.  3.Switch on the power and simultaneously start the stopwatch.  4.Make sure the current stays constant throughout; adjust the rheostat if necessary.  5.Note the current using the ammeter and note the time for which the current flowed using the stopwatch.  6.Stir and note the highest temperature. Calculate the change in temperature (θΔ)  7.Repeat the above procedure for increasing values of current I, taking at least six readings.  8.Plot a graph of I2 (y-axis) against θΔ (x-axis).  </html>");
        e5.setDiagram(new ImageIcon("jouleslaw.png"));
        aListPhyExp.add(e5);
        
        
        count = 0;
        diagramLbl.setIcon(e1.getDiagram());
        topicLbl.setText(e1.getTopic());
        nameLbl.setText(e1.getName());
        apparatusLbl.setText(e1.getApparatus());
        desLbl.setText(e1.getDescription());
        
        
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        homeExpPhy = new javax.swing.JButton();
        expTitleLbl = new javax.swing.JLabel();
        backExpPhy = new javax.swing.JButton();
        expNameLbl = new javax.swing.JLabel();
        expDescLbl = new javax.swing.JLabel();
        appUsedLbl = new javax.swing.JLabel();
        diaLbl = new javax.swing.JLabel();
        topicLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        apparatusLbl = new javax.swing.JLabel();
        diagramLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        desLbl = new javax.swing.JLabel();
        expTitleLbl1 = new javax.swing.JLabel();
        backExpPhy1 = new javax.swing.JButton();
        expTitleLbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane3.setOpaque(false);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(600, 1000));

        jScrollPane4.setEnabled(false);
        jScrollPane4.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        homeExpPhy.setBackground(new java.awt.Color(255, 255, 255));
        homeExpPhy.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        homeExpPhy.setText("Home");
        homeExpPhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeExpPhyActionPerformed(evt);
            }
        });

        expTitleLbl.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        expTitleLbl.setForeground(new java.awt.Color(255, 255, 0));
        expTitleLbl.setText("Experiments");

        backExpPhy.setBackground(new java.awt.Color(255, 255, 255));
        backExpPhy.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backExpPhy.setText("Back to HL Phy");
        backExpPhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backExpPhyActionPerformed(evt);
            }
        });

        expNameLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        expNameLbl.setForeground(new java.awt.Color(255, 255, 0));
        expNameLbl.setText("Experiment Topic:");

        expDescLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        expDescLbl.setForeground(new java.awt.Color(255, 255, 0));
        expDescLbl.setText("Experiment Description:");

        appUsedLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        appUsedLbl.setForeground(new java.awt.Color(255, 255, 0));
        appUsedLbl.setText("Apparatus Used:");

        diaLbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        diaLbl.setForeground(new java.awt.Color(255, 255, 0));
        diaLbl.setText("Diagram:");

        topicLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        topicLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Experiment Name:");

        nameLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));

        apparatusLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        apparatusLbl.setForeground(new java.awt.Color(255, 255, 255));
        apparatusLbl.setPreferredSize(new java.awt.Dimension(209, 117));

        diagramLbl.setPreferredSize(new java.awt.Dimension(280, 249));

        nextBtn.setBackground(new java.awt.Color(255, 255, 255));
        nextBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        doneBtn.setBackground(new java.awt.Color(255, 255, 255));
        doneBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        doneBtn.setText("Done");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        desLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        desLbl.setForeground(new java.awt.Color(255, 255, 255));
        desLbl.setPreferredSize(new java.awt.Dimension(200, 300));

        expTitleLbl1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        expTitleLbl1.setForeground(new java.awt.Color(255, 255, 0));
        expTitleLbl1.setText("Higher & Ordinary Level");

        backExpPhy1.setBackground(new java.awt.Color(255, 255, 255));
        backExpPhy1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backExpPhy1.setText("Back to OL Phy");
        backExpPhy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backExpPhy1ActionPerformed(evt);
            }
        });

        expTitleLbl2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        expTitleLbl2.setForeground(new java.awt.Color(255, 255, 0));
        expTitleLbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/ScienceAtom.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(expTitleLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(backExpPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backExpPhy1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(395, 395, 395))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(expTitleLbl)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expTitleLbl1))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(expNameLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(topicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(expDescLbl)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diaLbl)
                                .addComponent(desLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diagramLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(153, 153, 153)
                                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(appUsedLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(apparatusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(homeExpPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeExpPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(backExpPhy1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backExpPhy)))
                        .addGap(41, 41, 41)
                        .addComponent(expTitleLbl)
                        .addGap(38, 38, 38)
                        .addComponent(expTitleLbl1))
                    .addComponent(expTitleLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(expNameLbl)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addComponent(topicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expDescLbl)
                .addGap(32, 32, 32)
                .addComponent(desLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appUsedLbl)
                    .addComponent(apparatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(diaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diagramLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane4.setViewportView(jPanel2);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backExpPhy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backExpPhy1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new LcPhyOL().setVisible(true);
    }//GEN-LAST:event_backExpPhy1ActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
        count++;
        if(count ==5){
            JOptionPane.showMessageDialog(null, "You have finished viewing the Experiments. Press enter to return to the Physics home page");

            dispose();
            new LcPhyHL().setVisible(true);

        }
    }//GEN-LAST:event_doneBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        count++;
        backExpPhy.setVisible(false);
        backExpPhy1.setVisible(false);

        diagramLbl.setIcon(aListPhyExp.get(count).getDiagram());
        topicLbl.setText(aListPhyExp.get(count).getTopic());
        nameLbl.setText(aListPhyExp.get(count).getName());
        desLbl.setText(aListPhyExp.get(count).getDescription());
        apparatusLbl.setText(aListPhyExp.get(count).getApparatus());

        if (count == 4) {
            doneBtn.setVisible(true);
            nextBtn.setVisible(false);

        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backExpPhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backExpPhyActionPerformed
        // TODO add your handling code here:

        dispose();
        new LcPhyHL().setVisible(true);
    }//GEN-LAST:event_backExpPhyActionPerformed

    private void homeExpPhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeExpPhyActionPerformed
        // TODO add your handling code here:
        dispose();
        new GUI().setVisible(true);
    }//GEN-LAST:event_homeExpPhyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LcPhyExp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appUsedLbl;
    private javax.swing.JLabel apparatusLbl;
    private javax.swing.JButton backExpPhy;
    private javax.swing.JButton backExpPhy1;
    private javax.swing.JLabel desLbl;
    private javax.swing.JLabel diaLbl;
    private javax.swing.JLabel diagramLbl;
    private javax.swing.JButton doneBtn;
    private javax.swing.JLabel expDescLbl;
    private javax.swing.JLabel expNameLbl;
    private javax.swing.JLabel expTitleLbl;
    private javax.swing.JLabel expTitleLbl1;
    private javax.swing.JLabel expTitleLbl2;
    private javax.swing.JButton homeExpPhy;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel topicLbl;
    // End of variables declaration//GEN-END:variables
}
