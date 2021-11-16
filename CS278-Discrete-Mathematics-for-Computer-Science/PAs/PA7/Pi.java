// James Cooper
// CS78 - M01
// PA7
// October 22, 2021

// You will run into the StackOverflow error when the
// JVM runs out of space in its default memory allocation.
// Swapping out my memory from 8-32GB did not effect how
// many iterations I could achieve.

public class Pi {

    // recursive method to calculate pi and return that value
    public static double valueOfPi(int n) {

        // base case
        if (n == 0)
            return 0;

        // getting value of (-1)^(n-1)
        int one = ((n - 1) % 2 == 0) ? 1 : -1;
        // recursive call and main calculation
        return ((4.0 / (2 * n - 1)) * one) + valueOfPi(n - 1);
    } // end valueOfPi

    // method to return number of matching digits to Math.PI
    public static int correctDigits(double number) {

        // converting input pi value and Math.PI to string
        // to better compare digits
        String nString = Double.toString(number);
        String pi = Double.toString(Math.PI);
        // counter for number of matching digits
        int matchingDigits = 0;
        // making sure it starts with 3 with a decimal right afterwards
        if (nString.charAt(1) != '.' || nString.charAt(0) != '3')
            return matchingDigits;
        
        // loop that goes over the lenght of the input double
        for (int i = 0; i < nString.length(); i++) {

            // if the digits match at corresponding indexes
            if (nString.charAt(i) == pi.charAt(i) && nString.charAt(i) != '.')
                matchingDigits++;
            // if the digit does not match, return
            if (nString.charAt(i) != pi.charAt(i))
                return matchingDigits;
        } // end for
        return 0;
    } // end correctDigits
    
    public static void main(String args[]) {
        // loop to go through values of n until
        for (int n = 10000; n < 17000; n++) {
            double pi = valueOfPi(n);
            System.out.printf("%5d terms: pi = %.15f  %d correct digits\n", n, pi, correctDigits(pi));
        } // end for
    } // end main
} // end class
