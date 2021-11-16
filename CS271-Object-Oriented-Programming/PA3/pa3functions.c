// CS271 - PA3
// Program name: pa3functions.c
// James Cooper
// February 15th, 2021

#include <math.h>
#include "pa3functions.h"

// perfect function to determine if input number is a perfect number, if so return 1 else return 0
int perfect(int number) {
	// declaring variable to keep track of the sum of the factors
    int sum = 0;
	// for loop to run through all factors of input number and adding to the sum
    for (int i = 1; i < number; i++) {
        if (number % i == 0) {
            sum += i;
        } // end if
    } // end for
	// if the number is perfect, return 1
    if (sum == number) {
        return 1;
    } // end if
    
    return 0;
} // end perfect

// prime function to determine if input number is prime, if so return 1 else return 0
int prime(int number) {
	// for loop to run through all possible factors, if there are factors other
	// than 1 and the number iteself, return 0
    for (int i = 2; i < sqrt(number); i++) {
        if (number % i == 0) {
            return 0;
        } // end if
    } // end for
    return 1;
} // end prime

// function to reverse the digits of a input integer
int revDigits(int number) {
    // declaring variables to keep track of things
    int temp, reverse;
    reverse = 0;
    // while the input number is not 0 as you cant reverse that
    while (number != 0) {
        // finding out the next digit
        temp = number % 10;
		// adding the digit to reverse and moving over
        reverse = (reverse * 10) + temp;
		// dividing by 10 to get next digit
        number /= 10;
    } // end while
	// returning the reverse of the number
    return reverse;
} // end revDigits
