//
// CS172
// PA8.java
// PA8
// Written by: James Cooper
// November 14th, 2020
//

// importing Scanner class
import java.util.Scanner;

public class PA8 {
   
   // defining and initializing unnecessary variables
   static char tempLower = 'a';
   static char tempUpper = 'A';
   
   // method to print letters of the alphabet in lower and uppercase up to input character
   // Ex: input = j, output = abcdefghij
   public static void printLettersForward(char c) {

      // error case? sure
      if (!(Character.isLetter(c))) {
      } // end if
      else {
         if (Character.isLowerCase(c)) {
            // base case
            if (tempLower == c) {
               System.out.print(c);
            } // end if
            else {
               System.out.print(tempLower);
               // incremeting the alphabet
               tempLower = (char) (tempLower + 1);
               printLettersForward(c);
            } // end else
         } // end if
         else if (Character.isUpperCase(c)) {
            // base case
            if (tempUpper == c) {
               System.out.print(c);
            } // end if
            else {
               System.out.print(tempUpper);
               // incremeting the alphabet
               tempUpper = (char) (tempUpper + 1);
               printLettersForward(c);
            } // end else
         } // end else if
      } // end else
   } // end printLettersForward
   
   // more defining and initializing of variables
   static int posMult = 1;
   static int negMult = -1;
   static double product = 10;
   static double result = 0;
   
   // method to return the 10 the the input power
   // Ex: input = 2, return = 100
   public static double powerOfTen(int a) {
      
      // this is gross
      // base case
      if (posMult == a || negMult == a) {
         // sub-base case?
         if (posMult == a) {
            result = product;
            // re-assigning variables because I did this bad
            posMult = 1;
            product = 10;
         } // end if
         // sub-base case
         else if (negMult == a) {
            result = 1 / product;
            // re-assigning variables
            negMult = -1;
            product = 10;
         } // end else if
      } // end if
      else {
         if (a < -1) {
            product = (product * 10);
            negMult--; // incrementing
            powerOfTen(a);
         } // end if
         else if (a > 1) {
            product = (product * 10) / 1;
            posMult++; // incrementing
            powerOfTen(a);
         } // end else if
         else if (a == 0) {
            product = 1;
            posMult = a;
            powerOfTen(a);
         } // end else if
      } // end else
      return result;
   } // end powerOfTen
   
   // defining and initializing variables
   static String tempString;
   
   // method to print out substrings every space of a input string
   public static void stringByWords(String s) {

      int i = s.indexOf(' ');
      
      // base case
      if (i == -1) {
         System.out.println(s);
      } // end if
      else {
         // assigning variable with substring with only 1 word
         tempString = s.substring(0 ,i);
         stringByWords(tempString); // calling self with new substring 
         stringByWords(s.substring((char)(i + 1))); // calling own method with incremented i
      } // end else
   } // end stringByWords
      
   public static void main(String[] args) {
      
      // creating instance of Scanner class
      Scanner scan = new Scanner(System.in);
      // defining variables for String input
      String input, input2;
      
      // print statements for part 1
      System.out.println("\nPart 1\n");
      printLettersForward('f');
      System.out.println(""); // formatting
      printLettersForward('D');
      
      // print statements for part 2
      System.out.println("\n\nPart 2\n");
      // print return statements from powerOfTen
      System.out.println("Input of 3: " + powerOfTen(3));
      System.out.println("Input of -3: " + powerOfTen(-3) + "\n");
      
      /// print statements for part 3
      System.out.print("Enter a string (it may contain spaces): ");
      input = scan.nextLine(); // user input
      // calling stringByWords method with string input
      stringByWords(input);
      System.out.println(""); // formatting
      System.out.print("Enter a string (it may contain spaces): ");
      input2 = scan.nextLine(); // user input
      // calling stringByWords method with string input
      stringByWords(input2);
      
   } // end main
} // end class


// PS: I could not figure out how to get this to work
// without global variables... :\

// Looking back on this I realize I could have done this
// assignment much much better. None the less it works
// (think so), but it is not pretty. If I had allocated
// more time to this is could have been cleaner. Usually
// I take more time but this week was very busy. Sorry!