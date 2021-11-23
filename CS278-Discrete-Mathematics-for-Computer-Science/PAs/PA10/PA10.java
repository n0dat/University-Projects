// James Cooper
// CS278 - M01
// PA10
// November 17, 2021

// I enjoyed your class this year, and the new concepts were challenging.
// It is nice to finally have a decent grasp of recursion through
// all the practice we did. Have a good winter break! See you next semester.

import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class PA10 {
    
    // print array of characters
    public static void printArr(char arr[]) {
        for (char i : arr)
            System.out.print(i);
        System.out.println();
    } // end printArr
    
    // store input array of characters into next available String[]
    public static void storeArr(char arr[], String arr2[]) {
        String temp = "" + arr[0] + arr[1] + arr[2];
        int i = 0;
        for (; arr2[i] != null; i++);
        arr2[i] = temp;
    } // end storeArr
    
    // recursive function to print out and store all permutations of input characters into second input String[]
    public static void permutate(char arr[], int length, String arr2[]) {
        // base case
        if (length == arr.length)
            return;
            
        // recursive case
        if (length < arr.length) {
            for (int i = length; i < arr.length; i++) {
                
                // swap 
                char temp = arr[i];
                arr[i] = arr[length];
                arr[length] = temp;
                
                // special case when current permutation is not a duplicate
                // store and print current permutation
                if (length == arr.length - 1) {
                    printArr(arr);
                    storeArr(arr, arr2);
                } // end if
                
                // recursive call
                permutate(arr, length + 1, arr2);
                
                // swap back
                temp = arr[length];
                arr[length] = arr[i];
                arr[i] = temp;
            } // end for
        } // end if
    } // end permutate
    
    // searches valid[] for input word value, and store it into key
    public static int wordSearch(String key[], String valid[], String words[]) {
        Arrays.sort(valid);
        int validwords = 0;
        int store = 0;
        
        // linear check of array
        for (int i = 0; i < words.length && words[i] != null; i++) {
            if (Arrays.binarySearch(valid, words[i]) >= 0) {
                key[store] = words[i];
                store++;
                validwords++;
            } // end if
        } // end for
        return validwords;
    } // end wordSearch

    public static void main(String args[]) throws IOException {
    
        // input scrabble3.txt into String[]
        Scanner fs = new Scanner(new File("scrabble3.txt"));
		String scrabbleWords3[] = new String[1065];
		int index = 0;
		while (fs.hasNext()) {
			scrabbleWords3[index++] = fs.nextLine();
		}
        fs.close();
        
        // input scrabble4.txt into String[]
        fs = new Scanner(new File("scrabble4.txt"));
        String scrabbleWords4[] = new String[3996]; // 3996
        index = 0;
        while (fs.hasNext()) {
            scrabbleWords4[index++] = fs.nextLine();
        }
        fs.close();
        
        // getting user input of 3 characters
        Scanner in = new Scanner(System.in);
        char chars[] = new char[3];
        System.out.print("Enter 3 letters with no spaces in between: ");
        String input = in.nextLine().toLowerCase();
        
        // convert string input to character array for use of permutate()
        chars[0] = input.charAt(0);
        chars[1] = input.charAt(1);
        chars[2] = input.charAt(2);
        
        // showing all 3-letter permutations and creating arrays
        System.out.println("\nThere are 6 3-letter permutations. They are:");
        String threeLetterPermutations[] = new String[6];
        String valid3LetterWords[] = new String[6];
        
        // call permutate to find the permutations and print them out
        permutate(chars, 0, threeLetterPermutations);
        
        // calculate number of valid 3-letter words from permutations
        int valid3 = wordSearch(valid3LetterWords, scrabbleWords3, threeLetterPermutations);
        
        // if there are none
        if (valid3 <= 0)
            System.out.println("\nThere are no valid 3-letter Scrabble words.");
            
        // if there is at least 1, print out with message
        else {
            System.out.println("\nThe permutations that are valid 3-letter Scrabble words are:");
            index = 0;
            while (valid3LetterWords[index] != null)
                System.out.println(valid3LetterWords[index++]);
        }
        
        // printing how many 4-letter permutations are possible and creating arrays
        System.out.println("\nIf one letter is added at the beginning, there are 156 permutations.");
        String fourLetterPermutations[] = new String[156];
        String valid4LetterWords[] = new String[156];
        
        // creating the 4-letter permutations based on 3-letter permutations
        char letter = 'a';
        for (int i = 0; i < fourLetterPermutations.length; i++) {
            for (int n = 0; n < threeLetterPermutations.length; n++)
                fourLetterPermutations[i] = "" + letter +  threeLetterPermutations[i%6];
            
            // outer loop runs 156 iterations, but only 6 possible 3-letter permutations
            // so increment the first letter every 6 iterations
            if ((i + 1) % 6 == 0)
                letter++;
                
        } // end for
        
        // calculate number of valid 4-letter words from permutations
        int valid4 = wordSearch(valid4LetterWords, scrabbleWords4, fourLetterPermutations);
        
        // if there are none
        if (valid4 <= 0)
            System.out.println("\nThere are no valid 4-letter Scrabble words.");
        
        // if there is at least 1, print out with message
        else {
            System.out.println("\nThe permutations that are valid 4-letter Scrabble words are:");
            index = 0;
            while (valid4LetterWords[index] != null)
                System.out.println(valid4LetterWords[index++]);
            
        } // end else
        
        // show total valid 3-letter words and valid 4-letter words with given input
        System.out.printf("\nDepending on the letters on the board, you have %d 3-letter moves and %d 4-letter moves.\n", valid3, valid4);
             
    } // end main
} // end class
