/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Liam
 */
public class JcQuiz extends javax.swing.JFrame {

    //declare array of objects
    ArrayList<Question> arrJC;
    ArrayList<String> ansArr;
    ArrayList<QuestionMC> arrAns;

    //declare counter
    int count;
    int mark = 0;
    int result = 0;
    
    /**
     * Creates new form JcQuiz
     */
    public JcQuiz() {
        initComponents();
        submitBtn.setVisible(false);
        backBtn.setVisible(true);
        
        //create array
        arrJC = new ArrayList<>();
        ansArr = new ArrayList<>();
        arrAns = new ArrayList<>();

        Question q1 = new Question();
        QuestionMC mC1 = new QuestionMC();
        q1.setQuestion("Benedict's solution is used to test for ");
        q1.setCorrectAnswer("Proteins");
        mC1.setAns1("Proteins");
        mC1.setAns2("Glucose");
        mC1.setAns3("Starch");
        arrJC.add(q1);
        arrAns.add(mC1);
        
        Question q2 = new Question();
        QuestionMC mC2 = new QuestionMC();
        q2.setQuestion("Muscles are attached to bones by ");
        q2.setCorrectAnswer("Tendons");
        mC2.setAns1("Joints");
        mC2.setAns2("Tendons");
        mC2.setAns3("Ligaments");
        arrJC.add(q2);
        arrAns.add(mC2);
        
        Question q3 = new Question();
        QuestionMC mC3 = new QuestionMC();
        q3.setQuestion("The function of the nucleus in the cell is to ");
        q3.setCorrectAnswer("Control what enters and leaves the cell");
        mC3.setAns1("Provide shape and support to the cell");
        mC3.setAns2("Control what enters and leaves the cell");
        mC3.setAns3("Control the activities of the cell");
        arrJC.add(q3);
        arrAns.add(mC3);
        
        Question q4 = new Question();
        QuestionMC mC4 = new QuestionMC();
        q4.setQuestion("How many atoms out there in a molecule of CO2?");
        q4.setCorrectAnswer("3");
        mC4.setAns1("3");
        mC4.setAns2("1");
        mC4.setAns3("2");
        arrJC.add(q4);
        arrAns.add(mC4);
        
        Question q5 = new Question();
        QuestionMC mC5 = new QuestionMC();
        q5.setQuestion("The acid responsible for putting the fizz in fizzy drinks is");
        q5.setCorrectAnswer("Carbonic acid");
        mC5.setAns1("Hydrochloric acid");
        mC5.setAns2("Sulfuric acid");
        mC5.setAns3("Carbonic Acid");
        arrJC.add(q5);
        arrAns.add(mC5);
        
        Question q6 = new Question();
        QuestionMC mC6 = new QuestionMC();
        q6.setQuestion("Which one of the following metals is the best heat conductor?");
        q6.setCorrectAnswer("Copper");
        mC6.setAns1("Copper");
        mC6.setAns2("Iron");
        mC6.setAns3("Aliminium");
        arrJC.add(q6);
        arrAns.add(mC6);
        
        Question q7 = new Question();
        QuestionMC mC7 = new QuestionMC();
        q7.setQuestion("What type of force occurs when the brakes are applied on a bike?");
        q7.setCorrectAnswer("Friction");
        mC7.setAns1("Magnet");
        mC7.setAns2("Electric");
        mC7.setAns3("Friction");
        arrJC.add(q7);
        arrAns.add(mC7);
        
        Question q8 = new Question();
        QuestionMC mC8 = new QuestionMC();
        q8.setQuestion("Which one of the following materials is not attracted to a magnet?");
        q8.setCorrectAnswer("Aliminium");
        mC8.setAns1("Aliminium");
        mC8.setAns2("Colbat");
        mC8.setAns3("Steel");
        arrJC.add(q8);
        arrAns.add(mC8);
        
        Question q9 = new Question();
        QuestionMC mC9 = new QuestionMC();
        q9.setQuestion("The amount of space taken up by an object is known as it's?");
        q9.setCorrectAnswer("Volume");
        mC9.setAns1("Area");
        mC9.setAns2("Volume");
        mC9.setAns3("Mass");
        arrJC.add(q9);
        arrAns.add(mC9);
        
        Question q10 = new Question();
        QuestionMC mC10 = new QuestionMC();
        q10.setQuestion("Ecology is the study of");
        q10.setCorrectAnswer("How living things react with each other and their environment");
        mC10.setAns1("How living things react with each other and their environment");
        mC10.setAns2("Local habitats");
        mC10.setAns3("Inherited characteristics");
        arrJC.add(q10);
        arrAns.add(mC10);
        
        

//initialise count to 0
        count = 0;
        ansArr = new ArrayList<>();
        
        Question q = arrJC.get(count);
        QuestionMC m = arrAns.get(count);
        
       
        
        
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());

        
        
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup5 = new javax.swing.ButtonGroup();
        jcTitleLbl = new javax.swing.JLabel();
        quizTitleLbl = new javax.swing.JLabel();
        ans1RB = new javax.swing.JRadioButton();
        ans2RB = new javax.swing.JRadioButton();
        ans3RB = new javax.swing.JRadioButton();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        quesLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        jcTitleLbl.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jcTitleLbl.setText("  Junior Certificate Science ");
        getContentPane().add(jcTitleLbl);
        jcTitleLbl.setBounds(201, 6, 220, 44);

        quizTitleLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        quizTitleLbl.setText("                           Quiz");
        getContentPane().add(quizTitleLbl);
        quizTitleLbl.setBounds(207, 56, 206, 35);

        buttonGroup5.add(ans1RB);
        ans1RB.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        ans1RB.setText("Answer1");
        ans1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1RBActionPerformed(evt);
            }
        });
        getContentPane().add(ans1RB);
        ans1RB.setBounds(48, 211, 530, 24);

        buttonGroup5.add(ans2RB);
        ans2RB.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        ans2RB.setText("Answer2");
        ans2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2RBActionPerformed(evt);
            }
        });
        getContentPane().add(ans2RB);
        ans2RB.setBounds(48, 344, 460, 24);

        buttonGroup5.add(ans3RB);
        ans3RB.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        ans3RB.setText("Answer3");
        ans3RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3RBActionPerformed(evt);
            }
        });
        getContentPane().add(ans3RB);
        ans3RB.setBounds(48, 508, 450, 24);

        nextBtn.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        nextBtn.setText("Next -->");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(500, 600, 102, 50);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<-- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(0, 600, 95, 50);

        quesLbl.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        quesLbl.setText("Question ");
        getContentPane().add(quesLbl);
        quesLbl.setBounds(6, 141, 588, 29);

        submitBtn.setText("Submit");
        submitBtn.setPreferredSize(new java.awt.Dimension(50, 116));
        submitBtn.setSize(new java.awt.Dimension(102, 50));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn);
        submitBtn.setBounds(250, 600, 102, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/science-background-vector-371523.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        count++;
        
        ans1RB.setVisible(true);
        ans2RB.setVisible(true);
        ans3RB.setVisible(true);
        
        
        backBtn.setVisible(true);
        
        if (count < arrJC.size()) {
            if (ans1RB.isSelected()) {
                ansArr.add(ans1RB.getText());
            } else if (ans2RB.isSelected()) {
                ansArr.add(ans2RB.getText());
            } else {
                ansArr.add(ans3RB.getText());
            }
        }
        
        if (count == arrJC.size() - 1){
            nextBtn.setVisible(false);
        }
         
        buttonGroup5.clearSelection();
        
        //declare and create Quiz object
        Question q = arrJC.get(count);
        QuestionMC m = arrAns.get(count);
        
        

    if(count == 1){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 2){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 3){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 4){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 5){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 6){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 7){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 8){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    else if(count == 9){
        quesLbl.setText(q.getQuestion());
        ans1RB.setText(m.getAns1());
        ans2RB.setText(m.getAns2());
        ans3RB.setText(m.getAns3());
    }
    
      
        //adding object to the array
        if (count == arrJC.size() - 1) {
            submitBtn.setVisible(true);
        }
        
        
         
    
         
//        
//        new JcQuiz(count).setVisible(true);
//        dispose();// TODO add your handling code here:


    }//GEN-LAST:event_nextBtnActionPerformed

    private void ans1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans1RBActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       new JcScience().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void ans2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2RBActionPerformed

    private void ans3RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans3RBActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       if (count < arrJC.size()) {
            if (ans1RB.isSelected()) {
                ansArr.add(ans1RB.getText());
            } else if (ans2RB.isSelected()) {
                ansArr.add(ans2RB.getText());
            } else {
                ansArr.add(ans3RB.getText());
            }
        }

       
        //loop for array
        for (int i = 0; i < arrJC.size(); i = i + 1) {
             if(ansArr.get(i).equals (arrJC.get(i).getCorrectAnswer())){
                 mark = mark ++;
             }
            JOptionPane.showMessageDialog(null, "Question " + (i + 1) + ": " + arrJC.get(i).getQuestion() + "\n Your Answer: " + ansArr.get(i) + "\n Correct Answer: " + arrJC.get(i).getCorrectAnswer() + "\n Mark:" + mark);
        }
            
            if(mark == 1){
                result = ((mark*100)/10);
            }
            else if(mark == 2){
                result = ((mark*100)/10);
            }
            else if(mark == 3){
                result = ((mark*100)/10);
            }
            else if(mark == 4){
                result = ((mark*100)/10);
            }
            else if(mark == 5){
                result = ((mark*100)/10);
            }
            else if(mark == 6){
                result = ((mark*100)/10);
            }
            else if(mark == 7){
                result = ((mark*100)*100);
            }
            else if(mark == 8){
                result = ((mark*100)*100);
            }
            else if(mark == 9){
                result = ((mark*100)/10);
            }
            else if(mark == 10){
                result = ((mark*100)/10);
            }
            
            JOptionPane.showMessageDialog(null, "Your result is" + result + "%");
           
            new JcScience().setVisible(true);
            dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JcQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JcQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JcQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JcQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JcQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans1RB;
    private javax.swing.JRadioButton ans2RB;
    private javax.swing.JRadioButton ans3RB;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jcTitleLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel quesLbl;
    private javax.swing.JLabel quizTitleLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
