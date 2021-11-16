// James Cooper
// CS278 - M01
// PA4
// September 20, 2021

// changed tabs to spaces :)

public class PA4 {
    
    public static void buildSquareArray(int array[]) {

        // loop to set array elements with perfect squares
        // until its full
        for (int i = 0; i < array.length; i++)
            array[i] = i * i;

    } // end buildSquareArray
    
    public static boolean isPrime(int input) {

        // checking if less than or equal to 1
        if (input <= 1)
            return false;
        
        // checking it 2
        if (input == 2)
            return true;

        // check if input is divisible by anything up to 
        // its square root
        for (int i = 2; i <= Math.sqrt(input) + 1; i++)
            if (input % i == 0)
                return false;

        return true;
    } // end isPrime
    
    public static void main(String args[]) {

        // array to hold first 100 squares
        int perfectSquares[] = new int[100];

        // filling with squares
        buildSquareArray(perfectSquares);

        // flag variable and variables to do calculations
        boolean theoremHolds = true;
        int x = 1, p = 0, s = 0;

        // run values of x incrementing by 2'every iteration
        // and checking if theoremHolds
        while (x <= 9999 && theoremHolds) {

            // setting default to false incase exit is needed
            theoremHolds = false;
            x += 2;

            // loop checks each value of x and all 100 perfect squares checking if
            // calculation is prime, if not loop exits
            for (int i = 0; ((perfectSquares[i] < x / 2) && !theoremHolds); i++) {
                s = perfectSquares[i];
                p = x - (2 * s);
                if (isPrime(p))
                    theoremHolds = true;

            } // end for
        } // end while
        
        // printout whether counterexample was found and its corresponding x value
        if (!theoremHolds)
            System.out.println("\nA counterexample was found at x = " + (x));
        else
            System.out.println("\nNo counterexample was found in range 3 - 10000.");
    } // end main
} // end PA4