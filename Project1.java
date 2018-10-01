/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author stefi
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature in fahrenheit scale:");
        
        fahrenheit = sc.nextInt ();
        celsius = ((fahrenheit - 32) * 5) / 9;
        
        System.out.println(fahrenheit + "ºF" + " is:" + celsius + "ºC");
        
        
        
        
        
        
    }
    
}
