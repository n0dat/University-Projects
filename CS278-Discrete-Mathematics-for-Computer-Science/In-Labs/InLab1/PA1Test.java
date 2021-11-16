// James Cooper
// CS 278 - M1A
// Lab 1
// August 31, 2021

import java.util.*;
import java.io.*;

public class PA1Test {
	
	// creating 2 global arrays
	public static char charArray[] = {'T', 'F'};
	public static boolean boolArray[] = {true, false};
	
	// fill string array with table values
	// returns array with length of 8 and filled
	public static String[] buildTableRows() {
		String array[] = new String[8];
		int count = 0;
		for (char i : charArray) {
			for (char j : charArray) {
				for (char k : charArray) {
					array[count] = (i + "  " + j + "  " + k + "  ");
					count++;
				} // end for-each
			} // end for-each
		} // end for-each
		return array;
	} // end buildTableRows
	
	// converts boolean value to character
	// input is a single character
	// returns boolean value
	public static char booleanToChar(boolean input) {
		// checking if input is 'T' therefore true
		if (input == true) {
			return 'T';
		} // end if
		return 'F';
	} // end booleanToChar
	
	// converts character to boolean value
	// input is a single boolean type
	// returns character
	public static boolean charToBoolean(char input) {
		// making sure input is 'T' or 'F' and not something else
		if (input != 'T' && input != 'F') {
			throw new IllegalArgumentException("Parameter must be 'T' or 'F'.");
		} // end if
		// if input is 'T' therefore true
		else if (input == 'T') {
			return true;
		} // end else if
		return false;
	} // end charToBoolean
	
	// not logic gate for input
	// input character as input of 'T' or 'F'
	// return 'not' result of input: take 'T' return 'F' and vise versa
	public static char not(char input) {
		boolean value = false;
		// trying to do check
		try {
			// converting from char to bool
			value = charToBoolean(input);
		} // end try
		// catch if input is not 'T' or 'F'
		catch (IllegalArgumentException e) {
			System.out.println("An error occured in the not method. " + e.getMessage() + " Defaulting to false.");
		} // end catch
		return booleanToChar(!value);
	} // end not

	// and logic gate for input
	// input 2 characters of 'T' or 'F'
	// return 'and' result of the two; input 'T' and 'F' return 'F'
	public static char and(char a, char b) {
		// trying to do check
		try {
			// conferting from char to bool
			boolean one = charToBoolean(a);
			boolean two = charToBoolean(b);
			if (one && two) {
				return 'T';
			} // end if
		} // end try
		// catch if input is not 'T' or 'F'
		catch (IllegalArgumentException error) {
			System.out.println("An error occured in the and method. " + error.getMessage() + " Defaulting to false. ");
		} // end catch
		return 'F';
	} // end and
	
	// or logic gate for input
	// input 2 characters of 'T' or 'F'
	// return 'or' result of the two: input 'T' and 'F' return 'T'
	public static char or(char a, char b) {
		// trying to to check
		try {
			// converting from char to bool
			boolean one = charToBoolean(a);
			boolean two = charToBoolean(b);
			if (one && two) {
				return 'T';
			} // end if
			else if (one || two) {
				return 'T';
			} // end else if
		} // end try
		// catch if input is not 'T' or 'F'
		catch (IllegalArgumentException error) {
			System.out.println("An error occured in the or method. " + error.getMessage() + " Defaulting to false. ");
		} // end catch
		return 'F';
	} // end or
	
	// implies logic for input
	// input 2 characters of 'T' or 'F'
	// return 'implies' result of the two: input 'T' and 'F' return 'F'
	public static char implies(char a, char b) {
		// trying to do check
		try {
			// converting from char to bool
			boolean one = charToBoolean(a);
			boolean two = charToBoolean(b);
			if (one && two) {
				return 'T';
			} // end if
			else if (one && !two) {
				return 'F';
			} // end else if
			else if (!one && two) {
				return 'T';
			} // end else if
			else if (!one && !two) {
				return 'T';
			} // end else if
		}
		// catch if input is not 'T' r 'F'
		catch (IllegalArgumentException error) {
			System.out.println("An error occured in the implies method. " + error.getMessage() + " Defaulting to false. ");
		} // end catch
		return 'F';
	} // end implies
	
	// main method
	public static void main(String args[]) {

		// filling aray with buildTableRows() method
		String array[] = buildTableRows();
		// printing out first 4 lines of table
		System.out.println("Truth table for not(q) and r and p");
		System.out.println("p  q  r  not(q) and r and p");
		System.out.println("-- -- -- ------------------");
		// variables to keep track of values
		char p, q, r;
		// for-each loop to print out rows of truth table with
		// result of not(q) and r and p in last column
		for (String i : array) {
			// getting values of p, q, and r based on current row
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			// trying to find the result given p, q, and r
			try {
				// printing out result
				System.out.println(i + and(and(not(q), r), p));
			}
			// catch if the input is not 'T' or 'F' somehow
			catch (IllegalArgumentException error) {
				System.out.println("An error occured in the charToBoolean method. " + error.getMessage() + " Defaulting to false. ");
			} // end catch
			
		} // end for-each
	
		System.out.println();
		
		// printing out first 4 lines of table
		System.out.println("\nTruth table for p and not(r)\n");
		System.out.println("p  q  r  p and not(r)");
		System.out.println("-- -- -- ------------");
		// for-each loop to print out rows of truth table with
		// result of p and not(r)in last column
		for (String i : array) {
			// getting values of p and r based on current row
			p = i.charAt(0);
			r = i.charAt(6);
			// trying to find the result given p and r
			try {
				// printing out result
				System.out.println(i + and(p, not(r)));
			}
			// catch if the input is not 'T' or 'F' somehow
			catch (IllegalArgumentException error) {
				System.out.println("An error occured in the charToBoolean method. " + error.getMessage() + " Defaulting to false. ");
			} // end catch
			
		} // end for-each
		
		System.out.println();
		
		// printing out first 4 lines of table
		System.out.println("Truth table for p and q and r\n");
		System.out.println("p  q  r  p and q and r");
		System.out.println("-- -- -- -------------");
		// for-each loop to print out rows of truth table with
		// result of p and not(r)in last column
		for (String i : array) {
			// getting values of p, q, and r based on current row
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			// trying to find the result given p, q, and r
			try {
				// printing out result
				System.out.println(i + and(p, and(q, r)));
			}
			// catch if the input is not 'T' or 'F' somehow
			catch (IllegalArgumentException error) {
				System.out.println("An error occured in the charToBoolean method. " + error.getMessage() + " Defaulting to false. ");
			} // end catch
			
		} // end for-each

	} // end main
} // end class PA1Test