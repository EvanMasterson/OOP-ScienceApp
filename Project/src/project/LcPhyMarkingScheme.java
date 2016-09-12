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
public class LcPhyMarkingScheme {
    private String tips, timing, mark, section;
    
    public LcPhyMarkingScheme(){
        tips = new String();
        timing = new String();
        mark = new String();
        section = new String();
    }
    
    public String getTips(){
        return tips;
    }
    
    public void setTips(String tips){
        this.tips = tips;
    }
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }
    
    public String getTiming(){
        return timing;
    }
    
    public void setTiming(String timing){
        this.timing = timing;
    }
    
    public String getSection(){
        return section;
    }
    
    public void setSection(String section){
        this.section = section;
    }
}
