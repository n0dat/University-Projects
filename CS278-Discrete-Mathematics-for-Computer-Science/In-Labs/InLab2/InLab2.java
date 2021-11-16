// James Cooper
// CS278 - M1A
// Lab 2
// September 7, 2021

import java.util.Arrays;

public class InLab2 {

	public static void main(String args[]) {
		
		// filling array with truth table values
		String tableRows[] = PA2Methods.buildTableRows();
		// arrays to store the results of Proposition 1 and Propsition 2
		char prop1[] = new char[8];
		char prop2[] = new char[8];
		// variables to keep track of things
		char p, q, r;
		int count = 0;
		
		// for-each loop to find results of Propsition 1 and store them
		for (String i : tableRows) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			prop1[count] = PA2Methods.not(PA2Methods.and(PA2Methods.implies(p,q),PA2Methods.implies(q,r)));
			count++;
		} // end for-each
		
		count = 0;
		
		// loop to find the results of Proposition 2 and store them
		for (String i : tableRows) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			prop2[count] = PA2Methods.or(PA2Methods.and(p,PA2Methods.not(q)),PA2Methods.and(q,PA2Methods.not(r)));
			count++;
		} // end for-each
		
		// heading of truth table
		System.out.println("p  q  r  Proposition 1 Proposition 2");
		System.out.println("-- -- -- ------------- -------------");
	
		count = 0;
		
		// loop to print out results and table
		for (String i : tableRows) {
			System.out.printf("%s%-13s %-13s\n", i, prop1[count], prop2[count]);
			count++;
		} // end for-each
		
		System.out.println("\n");
		
		// checking if Prop 1 and Prop 2 are logically equivalent using the Arrays class
		if (Arrays.equals(prop1, prop2)) {
			System.out.println("Proposition 1 and Proposition 2 are logically equivalent.");
		} // end if
		else {
			System.out.println("Proposition 1 and Proposition 2 are not logically equivalent.");
		} // end else
		
	} // end main
} // end InLab2