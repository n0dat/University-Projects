//
// CS 172
// PA5b.java
// PA5
// Written by: James Cooper
// October 15th, 2020
//
import java.util.Scanner;

public class PA5b {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Problem 1\n");

      String[] countingNumbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
       "eighteen", "nineteen", "twenty"};
      int check = 0;
      int i = 0;
      String bufferString;

      System.out.print("Enter a letter: ");
      char userInput = scan.next().charAt(0);
      userInput = Character.toLowerCase(userInput);

      // makes sure the user inputs a letter character
      while (! (Character.isLetter(userInput))) {

         System.out.print("Please enter a letter: ");
         userInput = scan.next().charAt(0);
         userInput = Character.toLowerCase(userInput);
      } // end while

      System.out.println();
      // goes through all the elements of the array
      for (i = 0; i < countingNumbers.length; ++i) {

         // checks if the element of the array contains the character input by the user
         if (countingNumbers[i].contains(Character.toString(userInput))) {
            System.out.print(countingNumbers[i] + " ");
         } // end if
         // checks how many elements don't contain the character input by the user
         if (! (countingNumbers[i].contains(Character.toString(userInput)))) {
            check++;
         } // end if
         if ((check > 19)) {
            System.out.println("No elements contain that letter");
         } // end if
      } // end for

      System.out.println("\n\nProblem 2\n");

      int[] arrayOne = new int[100];
      int sum = 0;
      double average = 0;
      // fills the array with random values and prints out the elements 10 per line
      for (i = 0; i < arrayOne.length; i++) {

         arrayOne[i] = (int) (Math.random() * 1000 + 1);
         sum = sum + arrayOne[i];
         System.out.printf("%-5d", arrayOne[i]);

         if (i % 10 == 9) {
            System.out.println();
         } // end if
      } // end for

      average = sum / arrayOne.length;
      System.out.println("\nThe average is: " + average);

      int arrayMax = 0;
      // finds the max value in the array
      for (i = 0; i < arrayOne.length; i++) {

         if (i == 0) {
            arrayMax = arrayOne[i];
         } // end if
         // checking for max value
         else if (arrayMax < arrayOne[i]) {
            arrayMax = arrayOne[i];
         } // end if
      } // end for
      // outputting the max value
      System.out.println("\nThe array max: " + arrayMax);

      int arrayMin = 0;
      // finds the min value in the array
      for (i = 0; i < arrayOne.length; i++) {

         if (i == 0) {
            arrayMin = arrayOne[i];
         } // end if
         // checking for min value0
         else if (arrayMin > arrayOne[i]) {
            arrayMin = arrayOne[i];
         } // end if
      } // end for
      // outputting the max value in the array
      System.out.println("\nThe array min: " + arrayMin);


   } // end main
} // end class
