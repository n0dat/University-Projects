// James Cooper
// CS278 - M01
// PA5
// September 22, 2021

import java.util.Scanner;

public class PA5 {
    public static void printSubset(int set[], boolean mask[],int n) {
        String subsetString = "{ ";
        for (int i = 0; i < set.length; i++) {
            if (mask[i])
                subsetString = subsetString + set[i] + ", ";
        } // end for
        if (subsetString.length() > 2) {
            subsetString = subsetString.substring(0, subsetString.length() - 2);
        } // end if
        subsetString += " }";

        // total variable and temp string to be parsable
        int total = 0;
        // removing spaces and braces
        String tempString = subsetString.replace("{", "").replace("}", "").replace(" ", "");
        // storing integers into string array with element separated by a ','
        String strIntegers[] = tempString.split(",");
        for (String i : strIntegers)
            // adding integer to total
            total += Integer.parseInt(i);

        // if total is equal to n, print the subset
        if (total == n)
            System.out.println(subsetString);
    } // end printSubset

    public static boolean next(boolean mask[]) {
        int i = 0;
        for (; i < mask.length && mask[i]; i++)
            mask[i] = false;
        if (i < mask.length) {
            mask[i] = true;
            return true;
        } // end if
        return false;
    } // end next

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        // input the size of the set
        System.out.println("How many elements does your set have?");
        int S = in.nextInt();

        // input the elements of the set
        System.out.println("Enter " + S + " integers for the elemenets of the set."
                            + "\nNo Duplicates.");
        int mySet[] = new int[S];
        for (int i = 0; i < mySet.length; i++)
            mySet[i] = in.nextInt();

        // input value of n
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        // create the initial mask with all false values
        boolean mask[] = new boolean[S];
        for (int i = 0; i < mask.length; i++)
            mask[i] = false;

        // results
        System.out.println("Here are the subsets of your set with sum of " + n + ": ");
        while (next(mask)) {
            printSubset(mySet, mask, n);
        } // end while

    } // end main
} // end PA5

