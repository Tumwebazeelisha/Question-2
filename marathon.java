/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppcoursework;

/**
 *
 * @author Shakur
 */

    
    
    
    import java.util.*;

public class marathon {
    public static void main(String[] args) {
        // we list the names of the of runners in the arrays
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", 
            "Matt", "Alex", "Emma", "John", "James", 
            "Jane", "Emily", "Daniel", "Neda", "AaronT", "Kate"
        };

        // we then still list the times of runners respectively 
        int[] times = {
            341, 273, 278, 329, 445, 
            402, 388, 275, 243, 334, 
            412, 393, 299, 343, 317, 265
        };

        // we can now set variables to hold the fastest and second fastest times and their indices
        int fastestTimeIndex = 0;
        int secondFastestTimeIndex = 0;

        // Initializing fastest and second fastest times
        int fastestTime = times[0];
        int secondFastestTime = Integer.MAX_VALUE;

        // Finding the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < fastestTime) {
                secondFastestTime = fastestTime;
                secondFastestTimeIndex = fastestTimeIndex;
                fastestTime = times[i];
                fastestTimeIndex = i;
            } else if (times[i] < secondFastestTime && times[i] != fastestTime) {
                secondFastestTime = times[i];
                secondFastestTimeIndex = i;
            }
        }

        // we can now print the fastest runner
        System.out.println("Fastest runner: " + names[fastestTimeIndex] + " with a time of " + fastestTime + " minutes.");

        //  The same applies to the second fastest runner
        System.out.println("Second fastest runner: " + names[secondFastestTimeIndex] + " with a time of " + secondFastestTime + " minutes.");
    }
}

    

