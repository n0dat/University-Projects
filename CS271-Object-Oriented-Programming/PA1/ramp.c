// CS271 - PA 1
// Program name: ramp.c
// James Cooper
// January 29th, 2021

#include <stdio.h>
#include <math.h>

void main() {
	
    // declaring variables for the dimensions of a trianagle
    double rise, length, horizontal;
	
    // print prompt to get the height of the triangle
    printf("Enter the rise of the ramp in inches: \n");
    scanf("%lf", &rise);
    
    // checking if the ramp needs landing if the rise is large enough
    if (rise * 12 > 30) {
      printf("\nThe ramp requires a landing.\n");
    } // end if
    
    // calculate the length of the triangle and converting to feet
    length = (rise * 12) / 12;
    rise = rise / 12;
    // calculate the hypotenuse of the triangle and converting from inches to feet
    horizontal = (sqrt(pow(rise, 2) + pow(length, 2)));
    
    // printing out the hypotenuse and length of the trinagle
    printf("\nThe horizontal length of the ramp in feet: %.1lf\n", horizontal);
    printf("\nThe length of the ramp in feet: %.1lf\n", length);

} // end main
