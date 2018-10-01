/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author stefi
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        long minutes = sc.nextLong(); // the user can enter more than 2.147.483.647 minutes

        System.out.println("Please enter the number of minutes: ");
        // number of minutes converted in a 365 days year
        long year = minutes / 525600;
        //long remainingMinutes = minutes % 525600;
        long day = minutes / 1440; // compute the number of the days

        System.out.println(minutes + " minutes is approximately " + year + " year(s) or " + day + " day(s).");
    }
    
}
