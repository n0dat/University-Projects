// James Cooper
// CS278 - M01
// PA2
// September 1, 2021

public class PA2Methods {
	
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
		if (input) {
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
	
	// not logic for input
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

	// and logic for input
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
	
	// or logic for input
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

} // end class PA2Methods
