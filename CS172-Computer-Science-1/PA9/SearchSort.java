//
// CS172
// SearchSort.java
// PA9
// Written by: James Cooper
// November 22nd, 2020
//
import java.util.Arrays;

public class SearchSort {

   // method to printout the elements of an integer array
   public static void printIntArray(int[] array) {

      // for loop to printout elements of array with formatting
      for (int i = 0; i < array.length; i++) {
         // printing out elements of the array at index i
         System.out.printf("%5d", array[i]);
         // printing a new line if 10 elements have been printed
         if (i % 10 == 9) {
            System.out.println(""); // formatting
         } // end if
      } // end for loop

   } // end printIntArray

   public static boolean linearSearch(int[] array, int key) {

      boolean temp = false;

      // for loop to go through the array one by one to find a key value
      for (int i = 0; i < array.length; i++) {
         if (array[i] == key) {
            temp = true;
         } // end if
      } // end for loop
      // return false if the key is not found else it will return true do to the loop
      return temp;
   } // end linearSearch

   public static int linearSearch2(int[] array, int key) {

      int position = -1;

      // for loop to go through the array one by one to find a key value
      for (int i = 0; i < array.length; i++) {
         if (array[i] == key) {
            position = i;
         } // end if
      } // end for loop
      // return -1 if the key is found else it will return the index of array where the key was found
      return position;
   } // end linearSearch2

   public static boolean binarySearch(int[] array, int key) {

      // sorting the array
      Arrays.sort(array);

      // declaring and initializing variables to keep track during the search
      int i = 0;
      int low = 0;
      int high = array.length - 1;

      // while loop to find key value in array through the binary search algorithm
      while (high >= low) {
         i = (high + low) / 2;
         // changing search bounds if the key value is greater than the current search value
         if (array[i] < key) {
            low = i + 1;
         } // end if
         // changing search bounds of the key value is less than the current search value
         else if (array[i] > key) {
            high = i - 1;
         } // end else if
         else if (array[i] == key) {
            low = high + 1;
            // return value if key value is found within the array
            return true;
         } // end else if
      } // end while loop
      // return value if key value is not found within the array
      return false;
   } // end binarySearch

   public static void selectionSort(int[] list) {

      int min;
      int temp;

      for (int index = 0; index < list.length - 1; index++) {

         // find the position of the smallest value
         // in the unsorted part of the array

         min = index;
         for (int scan = index + 1; scan < list.length; scan++) {
            if (list[scan] < list[min]) {
               min = scan;
            } // end if
         } // end for loop scan

         // swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }// end for loop index

   } // end selectionSort

   public static void insertionSort(int[] list) {

      for (int index = 1; index < list. length; index++) {
         int key = list[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && key < list[position - 1]) {
            list[position] = list[position - 1];
            position--;
         } // end while

         list[position] = key;
      } // end for loop index

   } // end insertionSort

} // end class
