// James Cooper
// CS278 "M1A Tuesday"
// In Lab Assignment
// Auguest 24, 2021

// import Scanner class
import java.util.Scanner;

public class P1 {
    public static void main(String args[]) {
        // using Scanner to get user input
        Scanner in = new Scanner(System.in);
        int list[] = new int[20];
        System.out.println("Enter 20 integers: ");
        // loop to get user input and store into array
        for (int i = 0; i < list.length;i ++) {
            list[i] = in.nextInt();
        } // end for
        System.out.println("\nEven values: ");
        // loop to print out even values
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                System.out.print(list[i] + " ");
            } // end if
        } // end for
        System.out.println("\nOdd values: ");
        // loop to print out odd values
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                System.out.print(list[i] + " ");
            } // end if
        } // end for
    } // end main
} // end class P1