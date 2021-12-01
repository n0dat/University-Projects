// James Cooper
// CS272 - M01
// Lab11
// November 26, 2021

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.io.File;

public class dictionary {
	public static void main(String args[]) throws IOException {
	
		// declare HashMap with String key, and String element types
		HashMap<String, String> hmap = new HashMap<String, String>();
		Scanner fs = new Scanner(new File("example_words.txt"));
		String line[];
		
		// inputting the file input into the HashMap
		while (fs.hasNext()) {
			line = fs.nextLine().split("\\t");
			hmap.put(line[0], line[1]);
		}
		
		fs.close();
		
		// uncomment this to have it print out all words and definitions
		// located in the HashMap
		
		/*
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("Word is: " + mentry.getKey());
			System.out.println("Defintion is: " + mentry.getValue());
		}
		*/
		
		// Input key value or word
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String inputKey = in.next();
		String def = "";
		
		// checking if the HashMap contians the key
		if (hmap.containsKey(inputKey)) {
			def = hmap.get(inputKey);
			System.out.println(inputKey + " - " + def);
		}
		
		// key not found
		else
			System.out.println("\"" + inputKey + "\" was not found in this dictionary");
		
	}
}
