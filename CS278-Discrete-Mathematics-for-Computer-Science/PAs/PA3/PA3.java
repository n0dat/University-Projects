// James Cooper
// CS278 - M01
// PA3
// September 9, 2021

import java.util.Scanner;

public class PA3 {
	
	// statementA runs Statement A with array input
	// returns true or false after evaluation
	public static boolean statementA(int array[]) {
		for (int i : array) {
			// converting to char to use PA2Methods helper methods
			char lessThan = PA2Methods.booleanToChar(i < 0);
			char isEven = PA2Methods.booleanToChar(i % 2 == 0);
			// getting result
			boolean result = PA2Methods.charToBoolean(PA2Methods.implies(lessThan, isEven));
			if (!result) {
				return false;
			} // end if
		} // end for-each
		return true;
	} // end statementA
	
	// statementB runs Statement B with array input
	// returns true or false after evaluation
	public static boolean statementB(int array[]) {
		for (int i : array) {
			// converting to char to use PA2Methods helper methods
			char lessThan = PA2Methods.booleanToChar(i < 0);
			char isEven = PA2Methods.booleanToChar(i % 2 == 0);
			// getting result
			boolean result = PA2Methods.charToBoolean(PA2Methods.implies(lessThan, isEven));
			if (result) {
				return true;
			} // end if
		} // end for-each
		return false;
	} // end statementB
	
	// statementC runs Statement C with array input
	// returns true or false after evaluation
	public static boolean statementC(int array[]) {
		for (int i : array) {
			// converting to char to use PA2Methods helper methods
			char lessThan = PA2Methods.booleanToChar(i < 0);
			char isEven = PA2Methods.booleanToChar(i % 2 == 0);
			// getting result
			boolean result = PA2Methods.charToBoolean(PA2Methods.and(lessThan,isEven));
			if (result) {
				return true;
			} // end if
		} // end for-each
		return false;
	} // end statementC
	
	// statementD runs Statement D with array input
	// returns true or false after evaluation
	public static boolean statementD(int array[]) {
		for (int i : array) {
			// converting to char to use PA2Methods helper methods
			char byThree = PA2Methods.booleanToChar((i - 1) % 3 == 0);
			char byTwo = PA2Methods.booleanToChar((i - 1) % 2 == 0);
			// getting result
			boolean result = PA2Methods.charToBoolean(PA2Methods.or(byThree,byTwo));
			if (!result) {
				return false;
			} // end if
		} // end for-each
		return true;
	} // end statementD

	public static void main(String args[]) {
		// instantiating Scanner for input
		Scanner in = new Scanner(System.in);
		int array[] = new int[10];
		// getting input from user and filling array
		System.out.print("Please enter 10 different integers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		} /// end for
		// printing results of user input being passed into Statement A - D
		System.out.println();
		System.out.println("a) is " + statementA(array));
		System.out.println("b) is " + statementB(array));
		System.out.println("c) is " + statementC(array));
		System.out.println("d) is " + statementD(array));
	} // end main
} // end class PA3