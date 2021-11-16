// James Cooper
// CS278 - M1A
// InLab8
// October 26, 2021

public class InLab8 {
    
    // prints a pyramid from top to bottom with given upper and lower bound of integers
    public static void pyramidUp(int start, int end, int spaces) {
        
        // error case, checkinf parity and input start and end are positive
        if (!((start + end) % 2 == 0) && start > 0 && end > 0) {
            System.out.println("Input values have mismatch parity.");
            return;
        }
        
        // base case
        if (start == end) {
            // final print of spaces and top of pyramid integer
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            System.out.printf("%3d\n", start);
            return;
        }
        
        // recursive call
        pyramidUp(start + 1, end - 1, spaces + 3);
        
        // printing out lines
        // spaces
        for (int i = 0; i < spaces; i++)
            System.out.print(" ");
        // integers
        for (int i = start; i <= end; i++)
            System.out.printf("%3d", i);
        // helpful formatting
        System.out.println();
    } // end pyramid
    
    // calculate the summation of equation with given upper bound
    public static double fractionSum(int k) {
        if (k < 1)
            return 0;
        // main calculation
        return (1.0 / ((2 * k - 1) * (2 * k + 1))) + fractionSum(k - 1);
    } // end fractionSum
    
    // reverses an input string with given upper and lower index valuse
    public static String reverse(String s, int a, int b) {
        // error cases
        if (a >= s.length() || a < 0)
            return "";
        if (b >= s.length() || b < 0)
            return "";
        if (b < a)
            return "";
        
        // base case
        if ((b - a + 1) < 2)
            return s.substring(a, b + 1);
        
        // revursive step
        // if the substring has an odd number of characters
        if ((b - a + 1) % 2 != 0) {
            int middle = (a + b) / 2;
            return reverse(s, middle + 1, b) + s.charAt(middle) + reverse(s, a, middle - 1);
        } // end if
        // if the substring has an even number of characters
        else {
            int middle = (a + b) / 2;
            return reverse(s, middle + 1, b) + reverse(s, a, middle);
        } // end else
    } // end reverse
    
    public static void main(String args[]) {
        pyramidUp(1, 9, 0);
        System.out.println();
        // do not do something like 200 for the upper bound
        // interesting shapes happen when ran
        pyramidUp(2, 40, 0);
        System.out.println();
        System.out.println(fractionSum(1));
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(3));
        System.out.println(fractionSum(4));
        System.out.println();
        String myWord = "book";
        System.out.println("The reverse of " + myWord + " = " + reverse(myWord, 0, myWord.length() - 1) + ".");
        myWord = "yob";
        System.out.println("The reverse of " + myWord + " = " + reverse(myWord, 0, myWord.length() - 1) + ".");
        myWord = "xo";
        System.out.println("The reverse of " + myWord + " = " + reverse(myWord, 0, myWord.length() - 1) + ".");
        myWord = "clock";
        System.out.println("The reverse of " + myWord + " = " + reverse(myWord, 0, myWord.length() - 1) + ".");
    } // end main
} // end class
