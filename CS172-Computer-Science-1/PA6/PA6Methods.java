//
// CS172
// PA6Methods.java
// PA6
//Written by: James Cooper
// October 20th, 2020
//

import java.util.*;

public class PA6Methods {

   public static void printOddNumbers(int max) {

      // prints the odd numbers less thatn or equal to max

      int n = 1, count = 0;

      // loop to iterate to the value of the integer given
      while (n <= max) {

         System.out.printf("%5d", n); // prints the number in field of 5
         n+=2;
         count++;

         // creates new line if 10 integers are printed
         System.out.print((count % 10 == 0) ? "\n" : "");
      } // end while
   } // end printOddNumbers

   public static String formatName(String name) {

      // returns the last name a comma then the first name after a space

      // creates substring for the first sequence in entire string
      String first = name.substring(0, name.indexOf(' '));

      // creates substring for the last sequence in the entire string
      String last = name.substring(name.lastIndexOf(' ') + 1, name.length());

      // creates string based on last and first neatly formatted
      String finalName = last + ", " + first;
      return finalName;
   } // end formatName

   public static boolean hasLower(String text) {

      // checks if a string has a lowercase character, if yes it returns true

      boolean isLower = false;

      // iterating through entire string to check if any of the characters are lowercase
      for (int i = 0; i < text.length(); i++) {

         // returns true if a character is lowercase
         if (Character.isLowerCase(text.charAt(i))) {

            isLower = true;
         } // end if
      } // end for
      return isLower;
   } // end hasLower

   public static void temperatures(int minTemp, int maxTemp, int increment) {

      // calculates 2 values based on initial value, then prints out results in a specific format

      double celsius = 0, kelvin = 0;

      // print statements for formatting and labeling
      System.out.printf("%s", "Fahrenheit      ");
      System.out.printf("%s", "Celsius      ");
      System.out.printf("%s", "Kelvin\n");
      System.out.print("----------      -------      ------\n");

      // Do the appropriate calculations then print out results formatted
      for (int fahrenheit = minTemp; fahrenheit <= maxTemp; fahrenheit+=increment) {

         System.out.printf("%10d", fahrenheit);
         System.out.print("      ");
         // calculating celsius
         celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
         System.out.printf("%7.2f", celsius);
         System.out.print("      ");
         // calculating kelvin
         kelvin = celsius + 273.15;
         System.out.printf("%6.2f", kelvin);
         System.out.println("");
      } // end for
      // blank line for neatness
      System.out.println("");

   } // end temperatures
} // end class
