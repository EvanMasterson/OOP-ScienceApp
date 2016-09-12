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
import javax.swing.JOptionPane;

/**
 *
 * @author Evan
 */
public class LcChemQuiz extends javax.swing.JFrame {
    String question,answer,correctAnswer,home;
    int count,mark;
    ArrayList <Question> aListQuiz = new ArrayList <>();
    ArrayList <Question> aListAns = new ArrayList <> ();
    ListIterator newList;
    Question q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;

    /**
     * Creates new form lcChemQuiz
     */
    public LcChemQuiz() {
        initComponents();
        count=0;
        mark=0;
        JOptionPane.showMessageDialog(null,"Each of the Questions will be displayed here as you progress through the Quiz. Your answer MUST be ONE WORD. Click OK to continue.");
        
       
        q1 = new Question();
        q1.setQuestion("<html>What is the systematic (IUPAC) name for C₂H₂?</html>");
        q1.setCorrectAnswer("Ethyne");
        aListQuiz.add(q1);
        
        q2 = new Question();
        q2.setQuestion("<html>CH2=CH2, CH2=CH(CH2)2CH3 and CH2=CHCH2CH3 belong to what group of compounds?</html>");
        q2.setCorrectAnswer("Alkenes");
        aListQuiz.add(q2);
        
        q3 = new Question();
        q3.setQuestion("<html>What colour is observed in a flame test on barium?</html>");
        q3.setCorrectAnswer("Green");
        aListQuiz.add(q3);
        
        q4 = new Question();
        q4.setQuestion("<html>What solution is used to test for the presence of starch?</html>");
        q4.setCorrectAnswer("Iodine");
        aListQuiz.add(q4);
        
        q5 = new Question();
        q5.setQuestion("<html>In titrations, what is ALWAYS put in the burette?</html>");
        q5.setCorrectAnswer("Acid");
        aListQuiz.add(q5);
        
        q6 = new Question();
        q6.setQuestion("<html>What is the common househould name for Sodium Hypochlorite?</html>");
        q6.setCorrectAnswer("Bleach");
        aListQuiz.add(q6);
        
        q7 = new Question();
        q7.setQuestion("<html>What is the term used to describe a loss of electrons of an atom in a chemical compound</html>");
        q7.setCorrectAnswer("Oxidation");
        aListQuiz.add(q7);
        
        q8 = new Question();
        q8.setQuestion("<html>What is the name of the gas formed at the negative electrode when aqueous sodium sulfate solution is electrolysed?</html>");
        q8.setCorrectAnswer("Hydrogen");
        aListQuiz.add(q8); 

        q9 = new Question();
        q9.setQuestion("<html>State the shape of the PH3 molecule</html>");
        q9.setCorrectAnswer("Pyramidal");
        aListQuiz.add(q9);
        
        
        q10 = new Question();
        q10.setQuestion("<html>What process is used in oil refining to convert a less useful compound into a more useful cyclic hydrocarbon?</html>");
        q10.setCorrectAnswer("Dehydrocyclisation");
        aListQuiz.add(q10);
        
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("chemQuiz.txt");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(aListQuiz);
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        loadFile();
        
        if (newList.hasNext()) {
            Question q = (Question) newList.next();
            showQuesLbl.setText(q.getQuestion());
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quizTitleLbl = new javax.swing.JLabel();
        quesLbl = new javax.swing.JLabel();
        showQuesLbl = new javax.swing.JLabel();
        ansLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        ansTf = new javax.swing.JTextField();
        bgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        quizTitleLbl.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        quizTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        quizTitleLbl.setText("Quiz");
        getContentPane().add(quizTitleLbl);
        quizTitleLbl.setBounds(270, 30, 60, 28);

        quesLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        quesLbl.setForeground(new java.awt.Color(255, 255, 255));
        quesLbl.setText("Question:");
        getContentPane().add(quesLbl);
        quesLbl.setBounds(70, 140, 60, 17);

        showQuesLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        showQuesLbl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(showQuesLbl);
        showQuesLbl.setBounds(180, 140, 220, 82);

        ansLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        ansLbl.setForeground(new java.awt.Color(255, 255, 255));
        ansLbl.setText("Answer:");
        getContentPane().add(ansLbl);
        ansLbl.setBounds(80, 310, 82, 17);

        nextBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        nextBtn.setText("Next -->");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(430, 560, 90, 25);

        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setText("<--  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(70, 560, 100, 25);
        getContentPane().add(ansTf);
        ansTf.setBounds(190, 310, 201, 22);

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
            inFile = new File("chemQuiz.txt");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<Question> aListQuiz;
            aListQuiz = (ArrayList<Question>) oStream.readObject();
            newList = aListQuiz.listIterator();
            oStream.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (newList.hasPrevious()) {
            Question q = (Question) newList.previous();
            showQuesLbl.setText(q.getQuestion());
        }
        
        if(count ==0){
            dispose();
            new LcChem().setVisible(true);
        }
        count--;
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        backBtn.setVisible(false);
        aListQuiz.get(count).setAnswer(ansTf.getText());
        ansTf.setText("");
        

        if (newList.hasNext()) {
            Question q = (Question) newList.next();
            showQuesLbl.setText(q.getQuestion());
        }
        
        
        if(aListQuiz.get(count).getAnswer().equalsIgnoreCase(aListQuiz.get(count).getCorrectAnswer())){
            mark++;
        }
        
        
        if(count == 9){
           
            for(int i=0; i<aListQuiz.size(); i++){
                JOptionPane.showMessageDialog(null,"Question "+(i+1)+": "+aListQuiz.get(i).getQuestion() + "\n" +"Your Answer: "+aListQuiz.get(i).getAnswer() + "\n" +"Correct Answer: "+aListQuiz.get(i).getCorrectAnswer());
            }
            home = JOptionPane.showInputDialog(null,"The Quiz is now over, Your Mark is "+mark+"\n"+"Would you like to return home? y/n");
            if(home.equalsIgnoreCase("y")){
                dispose();
                new LcChem().setVisible(true);
            }
        }
        count++;
        if(count==9){
            nextBtn.setText("Finish");
        } else {
            
        }
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LcChemQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LcChemQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LcChemQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LcChemQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LcChemQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansLbl;
    private javax.swing.JTextField ansTf;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bgLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel quesLbl;
    private javax.swing.JLabel quizTitleLbl;
    private javax.swing.JLabel showQuesLbl;
    // End of variables declaration//GEN-END:variables
}
