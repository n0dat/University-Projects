//
// CS172
// PA5.java
// PA5
// Written by: James Cooper
// October 3rd, 2020
//
import java.util.*;
import java.io.*;

public class PA5a {

   public static void main(String[] args) throws IOException {
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Contents of array1: ");
      int[] array1 = new int[25];
      int i;
      
      // for loop to fill array1 with random values from 1 - 100 and output them to the screen
      for (i = 0; i < array1.length; i++) {
         array1[i] = (int) (Math.random() * 100 + 1);
         System.out.print(array1[i] + " ");
      } // end for
      
      System.out.println("\n\nContents of array1, 5 elements per line: ");
      
      // for loop to print out elements of array1 and enter a new line ever 5 elements
      for (i = 0; i < array1.length; i++) {
         //System.out.print(array1[i]+ " ");
         System.out.printf("%-4d", array1[i]);
         if (i % 5 == 4) {
            System.out.println();
         } // end if
      } // end for
      
      System.out.println();
      int[] array2 = new int[50];
      System.out.println("\nContents of array2, 10 elements per line: ");
      
      // for loop to fill array2 with random values from 1 - 1000 and output elements 10 at a time then enter a new line
      for (i = 0; i < array2.length; i++) {
         array2[i] = (int) (Math.random() * 1000 + 1);
         System.out.printf("%-5d", array2[i]);
         if (i % 10 == 9) {
            System.out.println();
         } // end if
      } // end for
      
      System.out.println("\nEven numbers in array1: ");
      
      // for loop to find even numbers and output them to screen
      for (i = 0; i < array1.length; i++) {
         if (array1[i] % 2 == 0) {
            System.out.printf("%-3d", array1[i]);
         } // end if
      } // end for
      
      int[] array3 = new int[25];
      
      // copying elements of array1 to array 3
      for (i = 0; i < array1.length; i++) {
         array3[i] = array1[i];
      } // end for
      
      // adding 1 the the last element in array3
      array3[24]++;
      
      // sorting then finding the max value in array1
      Arrays.sort(array1);
      int max1 = array1[array1.length - 1];
      System.out.println("\n\nMaximum value in array1 = " + max1);
      
      // sorting then finding the max value in array2
      Arrays.sort(array2);
      int max2 = array2[array2.length - 1];
      System.out.println("\nMaximum value in array2 = " + max2);
      
      String[] array4 = new String[10]; 
      System.out.print("\nSelect an option- stringsA, stringsB, or stringsC: ");
      String filename = scan.nextLine();      
      Scanner fileScan = new Scanner(new File(filename + ".txt"));
      System.out.println();
      
      // creating scanner instance with a .txt file in local directory
      String fileInput;
      i = 0;
      // inputing the contents of file to an array
      while (fileScan.hasNext() && i < 10) {
         fileInput = fileScan.nextLine();
         array4[i] = fileInput;
         i++;
      } // end while

      int max4 = 0;
      // for loop to check for longest string in file
      for (i = 0; i < array4.length; i++) {
         
         if (i == 0) {
            max4 = array4[i].length();
         } // end if
         // if the loop encounters a null value it will exit
         else if (array4[i] == null) {
            break;
         } // end else if
         else if (array4[i].length() > max4) {
            max4 = array4[i].length();
         } // end else if
         
      } // end for
      
      System.out.println("Length of the longest string in the file = " + max4);
         
      
   } // end class
} // end main
