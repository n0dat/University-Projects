// James Cooper
// CS278 - M01
// PA6
// October 4, 2021

import java.util.*;
import java.io.*;

public class PA6 {

    public static void printSubset(String set[], boolean mask[]) {
        String subsetString = "{ ";
        for (int i = 0; i < set.length; i++) {
            if (mask[i])
                subsetString = subsetString + set[i] + ", ";
        } // end for
        if (subsetString.length() > 2) {
            subsetString = subsetString.substring(0, subsetString.length() - 2);
        } // end if
        subsetString += " }";
        System.out.println(subsetString);
    } // end printSubset

    public static void main(String args[]) throws IOException {
        
        // reading in input.txt file
        Scanner fs = new Scanner(new File("input.txt"));
        // will keep going until end of file is reached
        while (fs.hasNext()) {
            int elementCount = fs.nextInt();
            fs.nextLine();
            // creating new set based off length given in file
            String setOne[] = new String[elementCount];
    
            for (int i = 0; i < setOne.length; i++)
                setOne[i] = fs.nextLine();

            // sorting
            Arrays.sort(setOne);
            // geting length of set
            elementCount = fs.nextInt();
            fs.nextLine();
            // creating new set based off length given in file
            String setTwo[] = new String[elementCount];
            
            // inputting elemenets for setTwo 
            for (int i = 0; i < setTwo.length; i++)
                setTwo[i] = fs.nextLine();
    
            // sorting
            Arrays.sort(setTwo);
            int numTrue = 0;
            
            // subset check
            // if numTrue is equals to setTwo.length
            // that means that every element of setTwo
            // appeared in setOne
            for (int i = 0; i < setTwo.length; i++) {
                for (int n = 0; n < setOne.length; n++)
                    if (setOne[n].equals(setTwo[i]))
                        numTrue++;
            } // end for
            
            // subset results 
            if (numTrue == setTwo.length)
                System.out.println("All elements of set B are in set A.");
            else
                System.out.println("Not all elements of set B are in set A.");
            
            // create the initial mask with all true values
            boolean mask[] = new boolean[setOne.length];
            for (int i = 0; i < mask.length; i++)
                mask[i] = true;
            
            // checking where elements of setTwo appear
            // in setOne, if so set mask to false
            // to have that value not show in the set
            for (int i = 0; i < setTwo.length; i++) {
                for (int n = 0; n < setOne.length; n++)
                    if (setOne[n].equals(setTwo[i]))
                        mask[n] = false;
            } // end for
            
            // difference results
            System.out.print("Difference: ");
            printSubset(setOne, mask);
            
            // set mask to all false
            for (int i = 0; i < mask.length; i++)
                mask[i] = false;
            
            // checking where elements of setTwo appear
            // in setOne, if so set mask to true
            // to have that value show in the set
            for (int i = 0; i < setTwo.length; i++) {
                for (int n = 0; n < setOne.length; n++)
                    if (setOne[n].equals(setTwo[i]))
                        mask[n] = true;
            } // end for
            
            // intersect results
            System.out.print("Intersect: ");
            printSubset(setOne, mask);
            System.out.println();
        } // end while
    } // end main
} // end PA6
