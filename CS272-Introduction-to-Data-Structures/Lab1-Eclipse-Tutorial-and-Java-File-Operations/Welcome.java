// James Cooper
// CS272 - M01
// Lab 1

import java.io.*;

public class Welcome {
	static void sum() throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line;
		int total = 0;
		System.out.println("Enter a line of integers seperated by a space: ");
		
		// read in string from keyboard
		if ((line = br.readLine()) != "\n\r") {
			String numbers[] = line.split(" ");
			System.out.println();
			// storing total from string that is split and converted to int
			for (int i = 0; i < numbers.length; i++) {
				total += Integer.parseInt(numbers[i]);
			}
		}
		System.out.println("The sum is: " + total);
	}
	public static void main(String args[]) {
		System.out.println("Welcome to Java\n");
		System.out.println("Current Time: " + System.currentTimeMillis());
		// trying to do sum and catching if IOException error
		try {
			sum();
		}
		catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}	
}