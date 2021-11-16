//
// CS 172
// StringPractice.java
// PA3
// Written by: James Cooper
//September 14th, 2020
// Analyzes string, and outputs based on certain conditions and manipulations
//
import java.util.Scanner;

public class StringPractice {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String inputString;
      // request input of a string from user
      System.out.println("Enter a string, it may contain spaces: ");
      inputString = scan.nextLine();
      // output the length of input string
      System.out.println("The length of the string is: " + inputString.length() + ".");

       // checking if string has a space
      if (inputString.contains(" ")) {

         int spaceIndex = inputString.indexOf(" ");
         // output first word of string
         System.out.println("First word: " + inputString.substring(0, spaceIndex));

      } else {
         // output if string does not contain a space
         System.out.println(inputString);
      }

      // output string in lower case
      System.out.println("Lower case: " + inputString.toLowerCase());
      // output string in upper case
      System.out.println("Upper case: " + inputString.toUpperCase());
      // output string after replacing 'n' with 'm'
      System.out.println("'m' insead of 'n': " + inputString.replace('n', 'm'));

      // check if string contains char 'a'
      if (inputString.indexOf("a") == -1) {
         System.out.println("String does not contain 'a'");
      } else {
         // output the index of char 'a'
         System.out.println("The first 'a' is at index: " + inputString.indexOf("a"));
      }

      System.out.println("The last character: " + inputString.charAt(inputString.length() - 1));
      //checking is string is longer than 8 characters

      if (inputString.length() > 7) {

         System.out.println("First 8 characters: " + inputString.substring(0, 8));

      } else {
         // output if string does not contain a space
         System.out.println("String is less than 8 characters: " + inputString);
      }

   } // end main
} // end class
