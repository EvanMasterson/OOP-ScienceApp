/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author caoimhemalone
 */
public class Quiz implements Serializable{
    private String question;
    private String answer; 
    private String correctAnswer;
    private String correctAnswer1;
    private String correctAnswer2;
    private String correctAnswer3;
    private String correctAnswer4;
    private String correctAnswer5;
    private String correctAnswer6;
    private double markPhy;
    private double resultPhy;
    private String question1;
    private String question2;
    private String question3;
    private String pQ;
    private String pQ2;
    private String pQ3;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;


 public Quiz(){
     question = new String();
     question3 = new String();
     question1 = new String();
     question2 = new String();
     pQ = new String();
     pQ2 = new String();
     pQ3 = new String();
     answer = new String();
     correctAnswer = new String();
     correctAnswer1 = new String();
     correctAnswer2 = new String();
     correctAnswer3 = new String();
     correctAnswer4 = new String();
     correctAnswer5 = new String();
     correctAnswer6 = new String();
     answer1 = new String();
     answer2 = new String();
     answer3 = new String();
     answer4 = new String();
     answer5 = new String();
     answer6 = new String();
     markPhy = 0.0;
     resultPhy = 0.0;
 }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public double getMarkPhy() {
        return markPhy;
    }

    public void setMarkPhy(double markPhy) {
        this.markPhy = markPhy;
    }

    public double getResultPhy() {
        return resultPhy;
    }

    public void setResultPhy(double resultPhy) {
        this.resultPhy = resultPhy;
    }
    
    public String getQuestion1(){
        return question1;
    }
    
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }
    
      public String getQuestion2(){
        return question2;
    }
    
    public void setQuestion2(String question2) {
        this.question2 = question2;
    } 
    
    public String getQuestion3(){
        return question3;
    }
    
    public void setQuestion3(String question3) {
        this.question3 = question3;
    }
    
    public String getPQ(){
        return pQ;
    }
    
    public void setPQ(String pQ) {
        this.pQ = pQ;
    }
    
    public String getPQ2(){
        return pQ2;
    }
    
    public void setPQ2(String pQ2) {
        this.pQ2 = pQ2;
    }
    
    public String getPQ3(){
        return pQ3;
    }
    
    public void setPQ3(String pQ3) {
        this.pQ3 = pQ3;
    }

    
    public String getCorrectAnswer1() {
        return correctAnswer1;
    }

    public void setCorrectAnswer1(String correctAnswer1) {
        this.correctAnswer1 = correctAnswer1;
    }
    
    public String getCorrectAnswer2() {
        return correctAnswer2;
    }

    public void setCorrectAnswer2(String correctAnswer2) {
        this.correctAnswer2 = correctAnswer2;
    }
    
    public String getCorrectAnswer3() {
        return correctAnswer;
    }

    public void setCorrectAnswer3(String correctAnswer3) {
        this.correctAnswer3 = correctAnswer3;
    }
    
    public String getCorrectAnswer4() {
        return correctAnswer4;
    }

    public void setCorrectAnswer4(String correctAnswer4) {
        this.correctAnswer4 = correctAnswer4;
    }
    
    public String getCorrectAnswer5() {
        return correctAnswer5;
    }

    public void setCorrectAnswer5(String correctAnswer5) {
        this.correctAnswer5 = correctAnswer5;
    }
    
    public String getCorrectAnswer6() {
        return correctAnswer6;
    }

    public void setCorrectAnswer6(String correctAnswer6) {
        this.correctAnswer6 = correctAnswer6;
    }
    
    public String getAnswer1(){
        return answer1;
    }
    
    public void setAnswer1(String answer1){
        this.answer1 = answer1;
    }
     public String getAnswer2(){
        return answer2;
    }
    
    public void setAnswer2(String answer2){
        this.answer2 = answer2;
    }
     public String getAnswer3(){
        return answer3;
    }
    
    public void setAnswer3(String answer3){
        this.answer3 = answer3;
    }
     public String getAnswer4(){
        return answer4;
    }
    
    public void setAnswer4(String answer4){
        this.answer4 = answer4;
    }
     public String getAnswer5(){
        return answer5;
    }
    
    public void setAnswer5(String answer5){
        this.answer5 = answer5;
    }
    public String getAnswer6(){
        return answer6;
    }
    
    public void setAnswer6(String answer6){
        this.answer6 = answer6;
    }
    
}

