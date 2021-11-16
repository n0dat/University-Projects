// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

// About a week ago I was messing around with regex constructs
// after finding it in the oracle java docs.

// This was a good use for it.

import java.util.Scanner;

public class Palindrome {
    
    // reverse the input string and put it into an ArrayListStack
    public static ArrayListStack<String> reverse(String n) {
        
        // removing everything except letters, numbers, and spaces
        // and storing words into an array
        String tempArray[] = n.toLowerCase().replaceAll("[^a-z0-9 ]","").split(" ");
        ArrayListStack<String> stringStack = new ArrayListStack<String>();
        
        // putting words of arary into Stack
        for (String i : tempArray) {
            stringStack.push(i);
        }
        
        // returns a stack
        return stringStack;
    }
    
    // takes a stack and a string input to compare
    public static boolean isPalin(String a, ArrayListStack<String> b) {
        
        // removing everything except leters, numbers, and spaces
        // and storing words into an array
        String tempArray[] = a.toLowerCase().replaceAll("[^a-z0-9 ]", "").split(" ");
        
        // comparing the words in the array to the stack
        for (String i : tempArray) {
            // if a single word does not match, then return false
            if (!i.equals(b.pop()))
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        
        // user intut of string to check if palindrome
        Scanner in = new Scanner(System.in);
        String inString = in.nextLine();
        System.out.println("Is palindrome: " + isPalin(inString, reverse(inString)));
    }
}
