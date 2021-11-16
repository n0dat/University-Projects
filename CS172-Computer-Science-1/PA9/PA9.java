//
// CS172
// PA9.java
// PA9
// Written by: James Cooper
// November 22nd, 2020
//
import java.util.Scanner;

public class PA9 {

   public static void main(String[] args) {

      // creaing instance of SearchSort class for ease of reading and typing
      SearchSort ss = new SearchSort();

      //
      // code test for the first array
      //

      // declaring first array of 200 elements
      int[] arrayOne = new int[200];

      // for loop to fill arrayOne with random integers from 1 - 1000
      for (int i = 0; i < arrayOne.length; i++) {
         arrayOne[i] = (int) (Math.random() * 1000 + 1);
      } // end for loop

      System.out.println("arrayOne\n"); // formatting

      ss.printIntArray(arrayOne); // printing arrayOne

      System.out.println("\nlinearSearch\n"); // printing out what method is being used

      // testing linearSearch method and printing out results
      System.out.println("Contains Value (30): " + ss.linearSearch(arrayOne, 30));
      System.out.println("Contains Value (86): " + ss.linearSearch(arrayOne, 86));
      System.out.println("Contains Value (87): " + ss.linearSearch(arrayOne, 87));

      System.out.println("\nlinearSearch2\n"); // printing out what method is being used

      // testing linearSearch method and printing out results
      System.out.println("Value (25) is at index: " + ss.linearSearch2(arrayOne, 25));
      System.out.println("Value (80) is at index: " + ss.linearSearch2(arrayOne, 80));
      System.out.println("Value (91) is at index: " + ss.linearSearch2(arrayOne, 91) + "\n");

      // sorting arrayOne with selectionSort method
      ss.selectionSort(arrayOne);

      ss.printIntArray(arrayOne); // printing arrayOne

      System.out.println("\nbinarySearch\n"); // printing out what method is being used

      // testing binarySearch method and printing results
      System.out.println("Contains Value (11): " + ss.binarySearch(arrayOne, 11));
      System.out.println("Contains Value (28): " + ss.binarySearch(arrayOne, 28));
      System.out.println("Contains Value (74): " + ss.binarySearch(arrayOne, 74));
      System.out.println("Contains Value (99): " + ss.binarySearch(arrayOne, 99) + "\n");

      //
      // code test for the second array
      //

      // declaring second array of 200 elements
      int[] arrayTwo = new int[200];

      // for loop to fill arrayTwo with random integers from 1 - 1000
      for (int i = 0; i < arrayTwo.length; i++) {
         arrayTwo[i] = (int) (Math.random() * 1000 + 1);
      } // end for loop

      System.out.println("arrayTwo\n"); // formatting
      ss.printIntArray(arrayTwo); // printing arrayTwo
      System.out.println("\nselectionSort\n"); // printing out what method is being used

      // sorting arrayTwo with selectionSort method
      ss.selectionSort(arrayTwo);

      ss.printIntArray(arrayTwo); // printing arrarTwo

      //
      // code test for the third array
      //

      // declaring third array of 200 elements
      int[] arrayThree = new int[200];

      // for loop to fill arrayThree with random integers from 1 - 1000
      for (int i = 0; i < arrayThree.length; i++) {
         arrayThree[i] = (int) (Math.random() * 1000 + 1);
      } // end for loop

      System.out.println("\narrayThree\n"); // formatting
      ss.printIntArray(arrayThree); // printing arrayThree
      System.out.println("\ninsertionSort\n"); // printing out what method is being used

      // sorting arrayThree with insertionSort method
      ss.insertionSort(arrayThree);

      ss.printIntArray(arrayThree); // printing arrayThree

   } // end main
} // end class
