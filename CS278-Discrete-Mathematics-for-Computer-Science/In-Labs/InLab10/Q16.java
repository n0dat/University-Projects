// James Cooper
// CS278 - M01
// InLab10
// November 9, 2021

import java.util.Scanner;

public class Q16 {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // input for a, r, and n
        System.out.println("Enter value for a: ");
        int a = in.nextInt();
        System.out.println("Enter value for r: ");
        int r = in.nextInt();
        System.out.println("Enter value for n: ");
        int n = in.nextInt();
        
        // calculating the terms of sequence
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            a = a * r;
            
            // case if not on last term
            if (!(i + 1 == n))
                System.out.print(", ");
        } // end for
        
        System.out.println();
    } // end main
} // end class
