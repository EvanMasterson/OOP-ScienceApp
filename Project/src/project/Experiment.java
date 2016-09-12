/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Evan
 */
public class Experiment implements Serializable{
    private String name, description, apparatus, topic, next;
    private ImageIcon diagram;
    
    public Experiment(){
        name = new String();
        description = new String();
        topic = new String();
        diagram = new ImageIcon();
        next = new String();
        apparatus = new String();
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getTopic(){
        return topic;
    }
    
    public void setTopic(String topic){
        this.topic = topic;
    }
    
    public String getNext(){
        return next;
    }
    
    public void setNext(String next){
        this.next = next;
    }
    
    public String getApparatus(){
        return apparatus;
    }
    
    public void setApparatus(String apparatus){
        this.apparatus = apparatus;
    }
    
    public ImageIcon getDiagram(){
        return diagram;
    }
    
    public void setDiagram(ImageIcon diagram){
        this.diagram = diagram;
    }
    
}
