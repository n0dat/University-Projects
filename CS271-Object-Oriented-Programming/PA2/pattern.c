// CS271 - PA 2
// Program name: pattern.c
// James Cooper
// February 11th, 2021

#include <stdio.h>

void main() {

	// declaring variables to keep track of number of lines, midpoint of pattern
	// and a variable to start a loop in different points based on if the
	// input is even or odd
	int lines, midpoint, n;
	// prompt for user input and storing it in lines
	printf("Enter a number of lines to create a pattern: \n");
	scanf("%d", &lines);
	printf("\n");
	
	// if user input less than 2, then it will let the user know
	if (lines < 2) {
		printf("Not enough lines to create a pattern.");
	} // end if
	// main pattern drawing statements
	else {
		// finding midpoint to print first half then second based on number of lines
		midpoint = lines / 2;
		
		// for loop to print the top half of the pattern
		for (int i = 1; i <= midpoint; i++) {
			// for loop to print out the spaces before the stars
			for (int j = midpoint + 1; j > i; j--) {
			    printf(" ");
			} // end for
			// for loop to print out 2 stars then fill space inbewteen
			for (int k = 0; k != 2 * i - 1; k++) {
				if (k == 2 * i - 2 || k == 0) {
				    printf("*");
				} // end if
				else {
				    printf(" ");
				} // end else
			} // end for
			printf("\n");
		} // end for
		
		// chaning midpoint variable and start of for loop if number of lines is even
		if (lines % 2 == 0) {
		    midpoint -= 1;
		    n = 0;
		} // end if
		else {
		    n = 1;
		} // end else
		
		// for loop to print out bottom half of pattern
		for (int i = midpoint; i >= 0; i--) {
			// for loop to print spaces before the stars
			for (int j = n; j <= midpoint - i; j++) {
				printf(" ");
			} // end for
			// checking if the pattern will be small enough to print just one star
			if (i == 0) {
				printf("*");
			} // end if
			// printing the rest of te pattern when one star can't complete it
			else {
				printf("*");
				// for loop to fill the gaps between stars with spaces
				for (int k = i * 2; k > 1; k--) {
					printf(" ");
				} // end for
				printf("*");
			} // end else
			printf("\n");
		} // end for
	} // end else
} // end main
