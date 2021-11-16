// James Cooper
// CS278 - M1A
// InLab6
// October 5, 2021

import java.util.*;
import java.io.*;

public class InLab6 {

   // print a subset containing elements
   // whose mask value is true
   
    public static void printSubset(String set[], boolean mask[]) {
   
        String subsetString = "{ ";
        for (int i = 0; i < set.length; i++) {
           if (mask[i]) 
              subsetString = subsetString + "\"" + set[i] + "\", ";
       
        } // end for   
        if (subsetString.length() > 2) {
           subsetString = subsetString.substring(0, subsetString.length() - 2);
        }
        subsetString = subsetString + " }";      
        System.out.println(subsetString);
      
    } // end method
   
    // Generate the next mask in the sequence
   
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
   
    public static boolean isSubset( String setOne[], String setTwo[], boolean setTwoMask[] ) {
   
      // Returns true if the subset of setTwo (as indicated by the mask)
      // is a subset or equal to setOne.  If not, it returns false.
     
        Arrays.sort(setOne);
        for (int i = 0; i < setTwo.length; i++)
           if (setTwoMask[i] && Arrays.binarySearch( setOne, setTwo[i] ) < 0)
              return false;
        return true;
      } // end method
   
    public static void main (String args[]) throws IOException {

        Scanner fileScan = new Scanner(new File("inputFile.txt"));

        while (fileScan.hasNext()) {
            String setA[];
            String setB[];
           
            // input the size and elements of set A
            setA = new String[ fileScan.nextInt() ];
            fileScan.nextLine();
            for (int i = 0; i < setA.length; i++)
                setA[i] = fileScan.nextLine();
        
            // input the size and elements of set B
            setB = new String[ fileScan.nextInt() ];
            fileScan.nextLine();

            for (int i = 0; i < setB.length; i++)
                setB[i] = fileScan.nextLine();

            // creating mask and setting all values to false
            boolean mask[] = new boolean[setA.length];
            for (int i = 0; i < mask.length; i++)
                mask[i] = false;
            System.out.println("Elements of P(A) that are also elements of P(B): ");
            printSubset(setA, mask);

            while (next(mask)) {
                if (isSubset(setB, setA, mask))
                    printSubset(setA, mask);
            } // end while        
        } // end while
    } // end main
} // end class