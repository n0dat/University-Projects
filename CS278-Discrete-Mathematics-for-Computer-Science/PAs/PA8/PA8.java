// James Cooper
// CS278 - M01
// PA 8
// October 26, 2021

import java.util.Scanner;

public class PA8 {

    // sum(2i) from i = 0 to k
    public static int sum1(int k) {
        // base case
        if (k == 0)
            return 0;
        
        // recursive (inductive) case
        return 2 * k + sum1(k-1);
    } // end sum1

    // sum(i(i+1)) from i = 1 to k
    public static int sum2(int k) {
        // base case
        if (k == 1)
            return 2;

        // recursive (inductive) case
        return k * (k + 1) + sum2(k-1);
    } // end sum2

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // get value of k
        System.out.print("Please enter the value of k: ");
        int k = in.nextInt();
        System.out.println("");
        // test sum1 and sum2 with input k value
        System.out.println("The value of the 1st summation is " + sum1(k) + ".\n");
        System.out.println("The value of the 2nd summation is " + sum2(k) + ".");
    } // end main
} // end class
