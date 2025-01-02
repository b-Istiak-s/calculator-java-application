/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainActivity mainFrame = new MainActivity();

        // Set JFrame properties
        mainFrame.setVisible(true); // Make the JFrame visible
        mainFrame.setTitle("My JFrame Example"); // Set a title
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
