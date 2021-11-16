// James Cooper
// CS278 - M1A
// InLab 5
// September 28, 2021

import java.util.Scanner;

public class InLab5 {

    public static void printSubset(String set[], boolean mask[]) {
    
        String subsetString = "{ ";
        for (int i = 0; i < set.length; i++) {
            if (mask[i]) 
                subsetString = subsetString + set[i] + ", ";
      
        } // end for    
        if (subsetString.length() > 2) {
            subsetString = subsetString.substring(0, subsetString.length() - 2);
        }
        subsetString = subsetString + " }";       
        System.out.println(subsetString);
       
    } // end method
           
    public static boolean next( boolean mask[] ) {
        int i;  
        for (i = 0; i < mask.length && mask[i]; i++)
             mask[i] = false;
        if (i < mask.length) {
            mask[i] = true;
            return true;
        }
        return false;
    } // end method
       
    public static int totalCharacters(String set[], boolean mask[]) {
        int sum = 0;
        // adding amount of characters in every String element to sum
        for (int i = 0; i < set.length; i++) {
            if (mask[i])
                // adding length to sum
                sum += set[i].length();        
        } // end for
        return sum;
    } // end totalCharacters
    
     public static void main ( String args[] ) {
       
        int count = 0; 
        Scanner scan = new Scanner(System.in);
       
        // input the size of the set
        System.out.println("How many elements does your set have?");
        int n = scan.nextInt();
        scan.nextLine();

        // input the elements of the set       
        System.out.println("Enter " + n + " integers for the elements of the set."
                                + "\nNo duplicates.");
        String[] mySet = new String[n];
        for (int i = 0; i < mySet.length; i++)
            mySet[i] = scan.nextLine();

        // input charlimit
        System.out.println("Enter the limit of characters: " );
        int charLimit = scan.nextInt();

        // create the initial mask with all false values
        boolean mask[] = new boolean[n];
        for (int index = 0; index < mask.length; index++ )
            mask[index] = false;
 
        System.out.println("Here are the subsets of your set:");
        // print the first subset set (note that the first set
        // that is printed will be the empty set)
        if (totalCharacters(mySet, mask) == charLimit)
            printSubset( mySet, mask );

       
        // Repeat until there are no more possible masks
        while (next( mask )) {
            // checking if total characters is equal to input
            if (totalCharacters(mySet, mask) == charLimit)
                printSubset( mySet, mask );
        } // end while
       
    } // end main
} // end class
       