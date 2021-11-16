//
// James Cooper
// September 4th, 2020
// CS 172
// PA2Program2.java
//
// Purpose: Calculate the circumference of a circle
//

import java.util.Scanner;

public class PA2Program2 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      double radius;
      // Input the radius
      System.out.print("Enter the radius: ");
      radius = scan.nextDouble();
      // Calculate the circumference
      double circumference = 2 * Math.PI * radius;
      // Display Output
      System.out.println("The radius is: " + radius + ".");
      System.out.println("The circumference is: " + circumference + ".");

   } // end main
} // end class
