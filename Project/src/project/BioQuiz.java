/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author barry
 */
public class BioQuiz implements Serializable {
    
    private String q1;
    private String q2;
    private String q3;
    
    public BioQuiz () {
        
        q1 = new String();
        q2 = new String();
        q3 = new String();        
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ1() {
        return q1;
    }

    public String getQ2() {
        return q2;
    }

    public String getQ3() {
        return q3;
    }
    
    
    
    
}
