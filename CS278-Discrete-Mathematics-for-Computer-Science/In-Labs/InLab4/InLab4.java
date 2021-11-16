// James Cooper
// CS278 - M1A
// In Lab 4
// September 21, 2021

import java.util.Arrays;

public class InLab4 {
    
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
        // getting 100 perfect squares
        int pSquares[] = new int[100];
        for (int i = 0; i < pSquares.length; i++)
            pSquares[i] = i * i;
        // declaring n and a temp variable
        int n = 0, temp = 0;
        boolean flag = true;
        // loop to run first statement
        while (n <= 1000 && flag) {
            n+=2;
            flag = false;
            // putting statement into temp variable
            temp = (n * n) - n + 17;
            // checking if the result is prime
            if (isPrime(temp))
                flag = true;
        } // end while

        // checking if theorem holds
        if (!flag)
            System.out.println("A counterexample was found at n: " + n);

        else
            System.out.println("A counterexample was not found in range 1 - 1000.");

        flag = true;
        n = 0;
        // variables to store 4 consecutive numbers        
        int b = 0, c = 0, d = 0, product = 0;
        // loop to run second statement
        while (n <= 1000 && flag) {
            flag = false;
            n++;
            // storing consecutive numbers
            b = n + 1;
            c = b + 1;
            d = c + 1;
            // calculating statement two
            product = n * b * c * d;
            // checking if the the product + 1 appears in the pSquares array
            // which means its 1 less than a perfect square if true
            if (!(Arrays.binarySearch(pSquares, product + 1) == -1))
                flag = true;

        } // end while
		
        // printing whether theorem holds or not
        if (!flag) 
            System.out.println("A counterexample was found at first value: " + n + "  second value: "+ b + "  third value: " + c + "  fourth value: " + d);

        else
            System.out.println("A counter example was not found in range 1 - 1000");

    } // end main
    
} // end InLab4