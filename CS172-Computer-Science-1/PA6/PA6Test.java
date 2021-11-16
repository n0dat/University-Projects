//
// CS172
// PA6Test.java
// PA6
//Written by: James Cooper
// October 20th, 2020
//

import java.util.*;

public class PA6Test {
   public static void main(String[] args) {
      // Calling the printOddNumbers method from PA6Methods
      PA6Methods.printOddNumbers(100);
      System.out.println("");
      // Calling the formatName method from PA6Methods
      System.out.println(PA6Methods.formatName("James Cooper"));
      // System.out.println("\n" + PA6Methods.formatName("James Cooper Kelvin Celsius")); *Had to modify code to only take the first
      // and last word seperated by whitespace, it would output: "Cooper Kelvin Celsius, James"*
      // System.out.println("\n" + PA6Methods.formatName("12309485 129038")); *Words as expected: "129038, 12309485"*
      // Calling the hasLower method from PA6Methods
      System.out.println("\nString contains lowercase characters: " +  PA6Methods.hasLower("JFALSdA")+ "\n");
      // System.out.println("The string has lowercase: " + PA6Methods.hasLower("12390847")); *Returns false as expected, only entered numbers*
      // System.out.println("The string has lowercase: " + PA6Methods.hasLower("!#$_*!)#$%^:><")); *Returns false as expected, only
      // entered special characters*
      // Calling the temperatures method from PA6Methods
      PA6Methods.temperatures(10, 100, 10);
      // PA6Methods.temperatures(1,2,0.5); *This will not work as the method only takes in integer values for the increment*
      // PA6Methods.temperatures(1,5,2); *Works as expected, only prints out odd values of fahrenheit until 5*

   } // end main
} // end class
