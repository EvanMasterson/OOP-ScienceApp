package project;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class BioMarkingScheme implements Serializable {
    
    private int gradeA;
    private int gradeB;
    private int gradeC;
    private int year;
    private final int sumA;
    private final int sumB;
    private final int sumC;

    
    
    public BioMarkingScheme() {
        
        
        gradeA = 0;
        gradeB = 0;
        gradeC = 0;
        year = 0;
        sumA = gradeA /50 * 100;
        sumB = gradeB /60 * 100;
        sumC = gradeC /40 * 100;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

    public int getYear() {
        return year;
    }

    
    public double getSumB() {
        return sumB;
    }

    public double getSumC() {
        return sumC;
    }

public double getSumA() {
        return sumA;
    }
    public double getGradeA() {
        return gradeA;
    }

    public double getGradeB() {
        return gradeB;
    }

    public double getGradeC() {
        return gradeC;
    }

    public void setGradeA(int gradeA) {
        this.gradeA = gradeA;
    }

    public void setGradeB(int gradeB) {
        this.gradeB = gradeB;
    }

    public void setGradeC(int gradeC) {
        this.gradeC = gradeC;
    }
           //Polymorphism
    public String getDetails() { 
        return "Year: " + year + "GradeA: " + gradeA + "\n GradeB " + gradeB + "\n GradeC: " + gradeC;
    }
}
