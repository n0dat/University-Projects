// James Cooper
// CS78 - M1A
// Lab 3
// September 14, 2021

import java.util.Scanner;

public class InLab3 {
	
	// runs statement One
	public static boolean statementOne(String sentence, String wordList[]) {
		sentence = sentence.toLowerCase();
		// removing punctuation
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(sentence.length() - 1) == ',' || sentence.charAt(sentence.length() - 1) == '.') {
				sentence = sentence.substring(0, sentence.length() - 1);
			} // end if
			if (sentence.charAt(i) == ',' || sentence.charAt(i) == '.') {
				sentence = sentence.substring(0, i) + sentence.substring(i + 1, sentence.length());
			} // end if
		} // end for
		String words[] = sentence.split(" ");
		int counter = 0;
		// checking whether all words are there
		for (String i : words) {
			for (String n : wordList) {
				if ((n.equals(i)))
					counter++;
			} // end for-each
		} // end for-each
		if (counter == wordList.length)
			return false;
		return true;
	} // end statementOne
	
	// runs statement Two
	public static boolean statementTwo(String sentence, int n) {
		sentence = sentence.toLowerCase();
		// removing punctuation
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(sentence.length() - 1) == ',' || sentence.charAt(sentence.length() - 1) == '.') {
				sentence = sentence.substring(0, sentence.length() - 1);
			} // end if
			if (sentence.charAt(i) == ',' || sentence.charAt(i) == '.') {
				sentence = sentence.substring(0, i) + sentence.substring(i + 1, sentence.length());
			} // end if
		} // end for
		String words[] = sentence.split(" ");
		// checking lenght of words
		for (String i : words) {
			if ((i.length() > n))
				return false;
		} // end for-each
		return true;
	} // end statementTwo

	public static void main(String args[]) {
		// Scanner instance
		Scanner in = new Scanner(System.in);
		// getting sentence
		System.out.print("Please enter a sentence: ");
		String line = in.nextLine();
		// getting words
		System.out.print("\nPlease enter 5 words: ");
		String words = in.nextLine();
		// getting individual words
		String array[];
		array = words.split(" ");
		// running statementOne
		System.out.println("\n'All words in the list can be found in the sentence.' is " + statementOne(line, array));
		System.out.print("Please enter a word length limit (integer): ");
		int limit = in.nextInt();
		// running statementTwo
		System.out.println("\n'There are no words in the list longer than " + limit + " characters.' is " + statementTwo(line, limit));
		
	} // end main
} // end class