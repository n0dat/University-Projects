// CS 172
// Program4.java
// PA4
// Written by: James Cooper
// September 20th, 2020
import java.util.Scanner;

public class Program4 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      //
      // Problem 1a - a for loop that will print the odd numbers from 1 to 99
      //
      System.out.println("\nProblem 1 - For loop output\n");
      int i;
      // outputting odd numbers
      for (i = 1; i < 100; ++i) {

         System.out.println(i++);
      } // end for
      //
      // Problem 1b - a while loop that will print the odd numbers from 1 to 99
      //
      System.out.println("\nProblem 1 - While loop output\n");
      int f = -1;
      // outputting odd numbers
      while (f < 98) {
         f = f + 2;
         System.out.println(f);
      } // end while
      //
      // Problem 2a -  a for loop that will take 10 values and keep the smallest
      //
      System.out.println("\nProblem 2 - For loop output\n");
      double forInput;
      double forSmallest = 0;
      int k;

      System.out.println("Enter 10 values: ");
      // for loop to find the smallest number entered
      for (k = 0; k < 10; ++k) {
         forInput = scan.nextDouble();
         if (k == 0) {
            forSmallest = forInput;
         } // end else if
         else if (forInput < forSmallest) {
            forSmallest = forInput;
         } // end if
      } // end for
      System.out.println("\nThe smallest value was: " + forSmallest + " in the for loop\n");
      //
      // Problem 2b - a while loop that will take 10 values and keep the smallest
      //
      System.out.println("Problem 2 - While loop output\n");
      double whileInput;
      double whileSmallest = 0;
      int m = 0;
      System.out.println("Enter 10 values: ");
      // while loop to find the smallest number entered
      while (m < 10) {
         whileInput = scan.nextDouble();
         if (m == 0) {
            whileSmallest = whileInput;
         } // end else if
         else if (whileInput < whileSmallest) {
            whileSmallest = whileInput;
         } // end if
         ++m;
      } // end while
      System.out.println("\nThe smallest value was: " + whileSmallest + " in the while loop\n");
      scan.nextLine();

      //
      // Problem 3a - a for loop that will count how many of each vowel (a, e, i, o, u) are in a string
      // 
      System.out.println("Problem 3 - For loop output\n");
      String forString;
      int aCount, eCount, iCount, oCount, uCount;
      aCount = eCount = iCount = oCount = uCount = 0;
      int h;
      // getting user input
      System.out.println("Enter a string: ");
      forString = scan.nextLine();
      String forStringL = forString.toLowerCase();
      // for loop to count the amount of vowels in a string
      for (h = 0; h < forString.length(); h++) {
         if (forStringL.charAt(h) == 'a') {
            aCount++;
         } // end else if
         else if (forStringL.charAt(h) == 'e') {
            eCount++;
         } // end else if
         else if (forStringL.charAt(h) == 'i') {
            iCount++;
         } // end else if
         else if (forStringL.charAt(h) == 'o') {
            oCount++;
         } // end else if
         else if (forStringL.charAt(h) == 'o') {
            uCount++;
         } // end if
      } // end for
      System.out.println("\n" + forString + " contained: " + aCount + " a's, " + eCount + " e's, " + iCount + " i's, " + oCount + " o's and " + uCount + " u's.\n");

      //
      // Problem 3b - a while loop that will count how many of each vowel (a, e, i, o, u) are in a string
      //
      System.out.println("Problem 3 - While loop output\n");
      int y = 0;
      String whileString;
      aCount = eCount = iCount = oCount = uCount = 0;
      // getting user input
      System.out.println("Enter a string: ");
      whileString = scan.nextLine();
      String whileStringL = whileString.toLowerCase();
      // while loop to count the amount of vowels in a string
      while (y < whileString.length()) {
         if (whileStringL.charAt(y) == 'a') {
            aCount++;
         } // end if
         else if (whileStringL.charAt(y) == 'e') {
            eCount++;
         } // end else if
         else if (whileStringL.charAt(y) == 'i') {
            iCount++;
         } // end else if
         else if (whileStringL.charAt(y) == 'o') {
            oCount++;
         } // end else if
         else if (whileStringL.charAt(y) == 'u') {
            uCount++;
         } // end else if
         y++;
      } // end while
      System.out.println("\n" + whileString + " contained: " + aCount + " a's, " + eCount + " e's, " + iCount + " i's, " + oCount + " o's and " + uCount + " u's.\n");
      
   } // end main
} // end class

// There is an issue with the code for problem 2 in that if you enter more than 10 numbers it will create an error
// This can me remedied by using an array that will only store 10 values no matter what, but I didn't do this because
// I am unsure if you want us to use them yet.