/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Evan
 */
public class ProjectApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI myGUI = new GUI();
        myGUI.setVisible(true);
        
        BioMarkingSchemeGUI myGUI2 = new BioMarkingSchemeGUI();
        myGUI2.setVisible(false);
        
        BioQuizGUI myBioQuizGui = new BioQuizGUI();
        myBioQuizGui.setVisible(false);
    }
    
}
