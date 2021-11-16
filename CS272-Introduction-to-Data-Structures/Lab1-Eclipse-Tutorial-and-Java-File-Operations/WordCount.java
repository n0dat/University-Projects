// James Cooper
// CS272 -M01
// Lab 1

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
	

	// This did not need its own method, it just made the code look a little cleaner
	// in the readIn() method and provided convenience
	public static boolean duplicate(String[] words, String word) {
		int c = 0;
		// checking up until a null element is reached in the search
		while(words[c] != null) {
			// return true if input word is found in input array
			if (words[c].equals(word)) {
				return true;
			}
			c++;
		}
		return false;
	}
	
	// some global arrays and variable to help use data from other methods
	static int counter[] = null;
	static int index[] = null;
	static int totalWords = 0;
	public static String[] readIn(String fname) throws IOException {
		String text = "";
		String line = "";
		String[] words = null;
		try {
			FileReader in = new FileReader(fname);
			BufferedReader br = new BufferedReader(in);
			int l = 0;
			
			// reading input file and adding all the lines to a single string
			while ((line = br.readLine()) != null) {
				text += " " + line;
				System.out.println("Line number: " + l);
				System.out.println(line);
				l++;
			}
			
			// Tokenise the text getting rid of special characters
			StringTokenizer token = new StringTokenizer(text, " !\"#$%&'()*+,-./:;?@[\\]^_`{|}~");
			int num_tokens = token.countTokens();
			
			// some variables to help keep track of things
			totalWords = num_tokens;
			String tempWords[] = new String[num_tokens];
			counter = new int[tempWords.length];
			int c = 0;
			boolean value = true;
			
			// storing words and skipping if they are duplicates
			while (token.hasMoreTokens()) {
				String word = token.nextToken().toLowerCase();
				if(duplicate(tempWords, word)) {
					counter[c]++;
					continue;
				}
				tempWords[c] = word;
				counter[c]++;
				c++;
			}
			br.close();
			
			// checking how long the array is before a null element is found
			c = 0;
			for (int i = 0; i < tempWords.length; i++) {
				if (tempWords[i] == null) {
					c = i;
					break;
				}
			}
			// creating new arrays with correct size and no null elements
			words = new String[c];
			index = new int[c];
			
			// filling in new ararys
			for (int i = 0; i < c; i++) {
				words[i] = tempWords[i];
				index[i] = counter[i];
			}
			
			// status message
			System.out.println("\nStill running, currently counting words...\n");
			
		}
		catch (FileNotFoundException error) {
			System.out.println("Unable to open file: 'pg100.txt'");
		}
		catch (IOException error) {
			System.out.println("Error reading file 'pg100.txt'");
		} 
		return words;
	}
	
	public static void write(String words[]) {
		try {
			File file = new File("WordCount.csv");
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			// sorting arrays in ascending order based on occurrence of words using bubble sort
			for (int i = 0; i < index.length - 1; i++) {
				for (int n = 0; n < index.length - i - 1; n++) {
					if (index[n] > index[n + 1]) {
						int cont = index[n];
						index[n] = index[n + 1];
						index[n + 1] = cont;
						String temp = words[n];
						words[n] = words[n + 1];
						words[n + 1] = temp;
					}
				}
			}
			// more temp arrays
			String tempString[] = new String[words.length];
			int tempIndex[] = new int[index.length];
			
			// reversing the order
			for (int i =0 ; i < words.length; i++) {
				tempString[words.length - i - 1] = words[i];
				tempIndex[words.length - i - 1] = index[i];
			}
			
			// writing to file
			bw.write("Total number of words: " + totalWords + "\n");
			for (int i = 0; i < words.length; i++) {
				bw.write(tempIndex[i] + " : " + tempString[i] + "\n");
			}
			bw.close();
			fw.close();
			
		}
		catch (IOException error) {
			error.printStackTrace();
		}
		
		System.out.println("Finish writing words to file 'WordCount.csv'");
	}
	
	public static void main(String args[]) {

		try {
			String words[] = readIn("pg100_small.txt");
			write(words);
		}
		catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}
}