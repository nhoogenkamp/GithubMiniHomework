/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githubminihomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Niels
 */
public class GithubMiniHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What will the dog do?");
        System.out.println("Please pick from the following: eat, sleep, sit or run");
    
    BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in)); 
     
        try {
            String activity = keyboardInput.readLine();
            System.out.println("The dog will "+ activity);
        } 
        catch (Exception e) {
           
        }
        System.out.println("Would you like a dog?");
    }}
