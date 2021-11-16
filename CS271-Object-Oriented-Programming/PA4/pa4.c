// CS271 - PA4
// Program name: pa4.c
// James Cooper
// February 25th, 2021

#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <ctype.h>
#include "arrayfunctions.h"

void main() {
	
	// Problem 1
		
	srand(time(NULL));
	printf("Problem 1\n");
	
	// declaring integer array with size of 20
	int intArray[20];
	
	// calling fillInteger to fill the array with integers from -20 to 20
	fillInteger(intArray, 20, -20, 20);
	printf("Elements in Problem 1 array: \n");
	
	// for loop to print the elements of the array with 10 elements on each line
	for (int i = 0; i < 20; i++) {
		printf("%d ", intArray[i]);
		// printing a new line if 10 elements have been printed
		if (i % 10 == 9) {
			printf("\n");
		} // end if
	} // end for
	
	// calling findConsecutive to see if there are any consecutive numbers
	// in the array
	findConsecutive(intArray, 20);

	// Problem 2

	printf("\nProblem 2\n");
	
	// declaring character array with size of 50
	char charArray[50];
	
	// calling fillCharacter
	fillCharacter(charArray, 50, 'a', 'z');
	printf("Elements in Problem 2 array: \n");

	// printing out the elements of the character array with a space inbetween
	for (int i = 0; i < 50; i++) {
		printf("%c ", charArray[i]);
	} // end for
	
	// calling findTriples to see if there are any 3 consecutive letters in the character array
	findTriples(charArray, 50);
	printf("\n");
	
	// Problem 3

	printf("\nProblem 3\nEnter a letter: ");
	
	// declaring variable and putting user input into it
	char input = getchar();
	
	// sentinel loop that will consinously ask for user input to be a letter, when it is it will break
	while (!(isalpha(input))) {
		printf("Please enter a letter: ");
		input = getchar();
		printf("\n");
		input = getchar();
	} // end while

	// converting the input to lowercase
	input = tolower(input);
	// declaring and intializing charCount to call countCharacter to see how many times
	// input character appears in the character array
	int charCount = countCharacter(charArray, 50, input);

	// printing message if the character does not appear in the array
	if (charCount == 0) {
		printf("I could not find your letter, %c, in the array\n", input);
	} // end if
	// printing message if the character only appears in the array once
	else if (charCount == 1) {
		printf("Your letter, %c, appeared once\n", input);
	} // end else if
	// pringint message if the chracter appears more than once
	else {
		printf("Your letter, %c, appeared %d times\n", input, charCount);
	} // end else

	// Problem 4
	
	printf("\nProblem 4\n");
	
	// declaring float array with size of 10
	// declaring variable to help print out 
	float floatArray[10];

	fillFloat(floatArray, 10,  1.0, 50.0);
	printf("Elements of Problem 4 array: \n");

	// printing every element of floatArray with 2 spaces inbetween
	for (int i = 0; i < 10; i++) {
		printf("%.1f  ", floatArray[i]);
	} // end for
	
	// declaring and initializing variable and calling floatMean to find the mean of the float array
	float fMean = floatMean(floatArray, 10);
	printf("\nMean of the array: %.1f", fMean);

	// declaring and initializing variable and calling floatMin to find the minimum of the float array
	float fMin = floatMin(floatArray, 10);
	printf("\nMin of the array: %.1f", fMin);

	// declaring and initializing variable and calling floatMax to find the maximum of the float array
	float fMax = floatMax(floatArray, 10);
	printf("\nMax of the array: %.1f\n", fMax);	

} // end main



/*
As an interesting note, when using the NMSU computers, the mean of my 
float array is 32 digits long with a .0 at the end. But on my own 
linux computer it returns a normal value. I do not know what causes this
and hope it does not impact grading.
*/
