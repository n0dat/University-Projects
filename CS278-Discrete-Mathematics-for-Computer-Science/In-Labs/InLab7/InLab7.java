// James Cooper
// CS272 - M1A
// InLab7
// October 19, 2021
import java.util.*;

public class InLab7 {

    public static void hourglass ( String s, int spaces ) {
        
        // base case
        if (s.length() == 2 || s.length() == 1) {
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            System.out.println(s); 
            return;
        }
        else {
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");

            System.out.println(s);
            // recursive call
            hourglass(s.substring(1, s.length() - 1), spaces + 1);
            
            // before the last print
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            System.out.println(s);
        }
        
    } // end hourglass method
   
    public static int floorLog ( int number, int base ) {
        // :)
        return 1;  // remove this line and add your own code.
        
    } // end floorLog method
    
    public static int population ( int p0, int n, double r ) {
    
        // p0 is the initial population
        // n is the day
        // r is the growth rate
        
        // base case
        if (n == 0)
            return p0;
        else {
            // recursive call
            return (int) ((1 + r) * population(p0,  n - 1, r));
        }
       
    } // end population
    
    public static void main ( String args[] ) {
        hourglass("yellow", 0);
        System.out.println();
        hourglass("hello", 0);
        System.out.println("\nPopulation: " + population(80, 3, 0.25));
        System.out.println("\nPopulation: " + population(100, 4, 0.05));
    
    } // end main
} // end class
