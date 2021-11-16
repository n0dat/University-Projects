// CS271 - PA 1
// Program name: ball.c
// James Cooper
// January 29th, 2021

#include <stdio.h>
#include <math.h>

void main() {
    
    // declaring variables 
    double outerDiameter, innerDiameter, rubberVolume;
    
    // input prompt and getting outerDiameter of sphere
    printf("Enter the exterior diameter in inches:\n");
    scanf("%lf", &outerDiameter);
    
    // input prompt and getting innerDiameter of sphere
    printf("\nEnter the interior diameter in inches:\n");
    scanf("%lf", &innerDiameter);
	
	// making sure either input diameter is greater than 0
    if (innerDiameter < 0 || outerDiameter < 0) {

        printf("The diameter cannot be less than zero.\n");

    } // end if

    else {
        
        if (innerDiameter > outerDiameter) {
        
            // printing error if the inner diameter is larger than the outer diameter
            printf("\nExterior diameter must be larger than interior diameter.\n");

        } // end if

        else {
        
            // calculate the required value by subtracting the volume of the inner sphere from the outer sphere
            rubberVolume = ((4.0 / 3.0) * M_PI * pow(outerDiameter / 2.0, 3)) - ((4.0 / 3.0) * M_PI * pow(innerDiameter / 2.0, 3));
        
            // printing the value of rubberVolume which is the amount of rubber needed to produce a rubber ball
            printf("\nYou need %.2lf cubic inches of rubber to make a ball with given dimensions.\n", rubberVolume);

        } // end else

    } // end else

} // end main

