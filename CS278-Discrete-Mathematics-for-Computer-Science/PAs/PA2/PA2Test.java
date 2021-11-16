// James Cooper
// CS278 - M01
// PA2
// September 1, 2021

public class PA2Test {
	
	// run code to test PA2Methods.java
	
	public static void main(String args[]) {
		PA2Methods P = new PA2Methods();
		String array[] = PA2Methods.buildTableRows();
		char p, q, r, result;
		int truths = 0;
		
		// Proposition One
		System.out.println("Truth table for Proposition One\n");
		System.out.println("p  q  r  Proposition One\n");
		System.out.println("-- -- -- ---------------");
		// loop to evaluate Propositon 1 and print results and 
		// keep track of how many end values were Truths
		for (String i : array) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			result = P.and(P.implies(P.not(p), q), P.implies(r, p));
			System.out.println(i + result);
			if (result == 'T') {
				truths++;
			} // end if
		} // end for-each
		
		System.out.println();
		
		// if tautology
		if (truths == 8) {
			System.out.println(truths + " combinations result in Proposition 1 being T.\n" + (8-truths)
								 + " combinations result in Proposition 1 being F.\nProposition 1 is a tautology.");
		} // end else if
		// not tautology
		else if (truths > 0 && truths < 8) {
			System.out.println(truths + " combinations result in Proposition 1 being T.\n" + (8-truths)
								 + " combinations result in Proposition 1 being F.\nProposition 1 is neither a tautology nor a contradiction.");
		} // end else if
		// if contradiction
		else if (truths == 0) {
			System.out.println(truths + " combinations result in Proposition 1 being T.\n" + (8-truths)
								 + " combinations result in Proposition 1 being F.\nProposition 1 is a contraditcion.");
		} // end else if
		
		truths = 0;
		
		System.out.println();

		// Proposition Two
		System.out.println("Truth table for Proposition Two\n");
		System.out.println("p  q  r  Proposition Two");
		System.out.println("-- -- -- ---------------");
		// loop to evaluate Propositon 2 and print results and 
		// keep track of how many end values were Truths
		for (String i : array) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			result = P.and(P.or(p, P.not(q)), (P.or(r, P.not(P.implies(p,q)))));
			System.out.println(i + result);
			if (result == 'T') {
				truths++;
			} // end if
		} // end for-each
		
		System.out.println();
		
		// if tautology
		if (truths == 8) {
			System.out.println(truths + " combinations result in Proposition 2 being T.\n" + (8-truths)
								 + " combinations result in Proposition 2 being F.\nProposition 2 is a tautology.");
		} // end if
		// not tautology
		else if (truths > 0 && truths < 8) {
			System.out.println(truths + " combinations result in Proposition 2 being T.\n" + (8-truths)
								 + " combinations result in Proposition 2 being F.\nProposition 2 is neither a tautology nor a contradiction.");
		} // end else if
		// if contradiction
		else if (truths == 0) {
			System.out.println(truths + " combinations result in Proposition 2 being T.\n" + (8-truths)
								 + " combinations result in Proposition 2 being F.\nProposition 2 is a contraditcion.");
		} // end else if
		
		truths = 0;
		
		System.out.println();

		// Proposition Three
		System.out.println("Truth table for Proposition Three\n");
		System.out.println("p  q  r  Proposition Three");
		System.out.println("-- -- -- -----------------");
		// loop to evaluate Propositon 3 and print results and 
		// keep track of how many end values were Truths
		for (String i : array) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			result = P.implies(p, (P.implies(P.not(P.or(p, P.not(q))), P.and(p, q))));
			System.out.println(i + result);
			if (result == 'T') {
				truths++;
			} // end if
		} // end for-each
		
		System.out.println();
		
		// if tautology
		if (truths == 8) {
			System.out.println(truths + " combinations result in Proposition 3 being T.\n" + (8-truths)
								 + " combinations result in Proposition 3 being F.\nProposition 3 is a tautology.");
		} // end else if
		// not tautology
		else if (truths > 0 && truths < 8) {
			System.out.println(truths + " combinations result in Proposition 3 being T.\n" + (8-truths)
								 + " combinations result in Proposition 3 being F.\nProposition 3 is neither a tautology nor a contradiction.");
		} /// end else if
		// if contradiction
		else if (truths == 0) {
			System.out.println(truths + " combinations result in Proposition 3 being T.\n" + (8-truths)
								 + " combinations result in Proposition 3 being F.\nProposition 3 is a contraditcion.");
		} // end else if
		
		truths = 0;
		
		System.out.println();
		
		// Proposition Four
		System.out.println("Truth table for Proposition Four\n");
		System.out.println("p  q  r  Proposition Four");
		System.out.println("-- -- -- ----------------");
		// loop to evaluate Propositon 4 and print results and 
		// keep track of how many end values were Truths
		for (String i : array) {
			p = i.charAt(0);
			q = i.charAt(3);
			r = i.charAt(6);
			result = P.and(P.and(p,P.implies(p,q)),P.not(q));
			System.out.println(i + result);
			if (result == 'T') {
				truths++;
			} // end if
		} // end for-each
		
		System.out.println();
		
		// if tautology
		if (truths == 8) {
			System.out.println(truths + " combinations result in Proposition 4 being T.\n" + (8-truths)
							 + " combinations result in Proposition 4 being F.\nProposition 4 is a tautology.");
		} // end if
		// not tautology
		else if (truths > 0 && truths < 8) {
			System.out.println(truths + " combinations result in Proposition 4 being T.\n" + (8-truths)
							 + " combinations result in Proposition 4 being F.\nProposition 4 is neither a tautology nor a contradiction.");
		} // end else if
		// if contradiction
		else if (truths == 0) {
			System.out.println(truths + " combinations result in Proposition 4 being T.\n" + (8-truths)
							 + " combinations result in Proposition 4 being F.\nProposition 4 is a contraditcion.");
		} // end else if
		
	} // end main
} // end class PA2Test