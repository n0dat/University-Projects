// James Cooper
// CS278 - M01
// InLab10
// November 9, 2021

public class Q17 {

    public static void slant(String word, String spaces) {
        
        // base case 1
        if (word.isEmpty())
            return;
        
        // base case 2
        if (word.length() == 1 || word.length() == 2) {
            System.out.println(spaces + word);
            return;
        } // end if
        
        // printing spaces and part of word
        System.out.println(spaces + word.substring(0, 2));
        
        // recursive step
        slant(word.substring(1, word.length()), spaces + " ");
        
    } // end slant
    
    public static void main(String args[]) {
        slant("carbon", "");
    } // end main
} // end class
