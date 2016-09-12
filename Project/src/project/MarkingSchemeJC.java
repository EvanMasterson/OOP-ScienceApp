/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Liam
 */
public class MarkingSchemeJC {
    private String section1, section2, section3;
    private int grade1, grade2, grade3, fullMark1, fullMark2, fullMark3;
    
    
    public MarkingSchemeJC(){
    section1 = "Biology";
    section2 = "Chemistry";
    section3 = "Physics";
    grade1 = 0;
    grade2 = 0;
    grade3 = 0;
    fullMark1 = 0;
    fullMark2 = 0;
    fullMark3 = 0;
    
}
    public void setGrade1(int grade1){
        this.grade1 = grade1;
    }
    public void setGrade2(int grade2){
        this.grade2 = grade2;
    }
    public void setGrade3(int grade3){
        this.grade3 = grade3;
    }
    public void setFullMark1(int fullMark1){
        this.fullMark1 = fullMark1;
    }
    
     public void setFullMark2(int fullMark2){
        this.fullMark2 = fullMark2;
    }
     
     public void setFullMark3(int fullMark3){
        this.fullMark3 = fullMark3;
    }
    
    public void setSection1(String section1){
        this.section1 = section1;
    }
    
    public void setSection2(String section2){
        this.section2 = section2;
    }
    
    public void setSection3(String section3){
        this.section3 = section3;
    }
    
    public String getSection1(){
        return section1;
    }
    
     public String getSection2(){
        return section2;
    }
     
     public String getSection3(){
        return section3;
    }
    
    public int getGrade1(){
        return grade1;
    }
    
    public int getGrade2(){
        return grade2;
    }
    
    public int getGrade3(){
        return grade3;
    }
    
    
    public int getFullMark1(){
        return fullMark1;
    }
    
    public int getFullMark2(){
        return fullMark2;
    }
    
    public int getFullMark3(){
        return fullMark3;
    }
}


