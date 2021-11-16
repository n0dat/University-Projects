// James Cooper
// CS278 "M1A Tuesday"
// In Lab Assignment
// Auguest 24, 2021

// import Scanner class
import java.util.Scanner;

public class P2 {
    public static void main(String args[]) {
        // using Scanner to get user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int size = in.nextInt();
        // using user input to create set array size
        int list[] = new int[size];
        // filling array with random values from -1000 to 1000
        for (int i = 0; i < list.length;i ++) {
            list[i] = (int) (Math.random() * (2001) + (-1000));
        } // end for
        System.out.println("\nEven values: ");
        // printing out even values
        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                System.out.printf("%6d ", list[i]);
                if (temp % 10 == 9) {
                    System.out.println();
                }
                temp++;
            } // end if
        } // end for
        System.out.println("\nOdd values: ");
        // printing out odd values
        temp = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                System.out.printf("%6d ", list[i]);
                if (temp % 10 == 9) {
                    System.out.println();
                }
                temp++;
            } // end if
        } // end for
    } //end main
} // end class P2