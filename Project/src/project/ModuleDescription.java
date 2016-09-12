/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author Liam
 */
public class ModuleDescription implements Serializable {
    private String name;
    private String description;
    private String duration;

    public ModuleDescription() {
        name = new String();
        description = new String();
        duration = new String();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDuration(String duration){
        this.duration = duration;
    }
    
    public String getDuration(){
        return duration;
    }
}
 