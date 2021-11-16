// CS271 - PA 2
// Program name: cargo.c
// James Cooper
// February 4th, 2021

#include <stdio.h>

void main() {

	// declaring and initialization of variables to keep track of the
	// amount of containers on the ship, ship weight capacity, container
	// weight, and current weight of the ship
    float totalCapacity, containerWeight;
    float loadedWeight = 0;
    int containers = 0;

	// input for the total capacity for the ship
    scanf("%f", &totalCapacity);

	// loop will run aslong as the next container will not
	// exceed the weight capacity of the ship
    while (loadedWeight + containerWeight <= totalCapacity) {
		// getting the input numbers
        scanf("%f", &containerWeight);
		// making sure the container weight is not negative or zero
        if (containerWeight <= 0) {
        } // end if
        else {
            if (loadedWeight + containerWeight > totalCapacity) {
				// outputting message for when the ship cannot accept the input container
			    printf("Ths ship is full.\n");
            } // end if
            else {
				// incresing the loaded weight with the weight of the container
                loadedWeight += containerWeight;
				// incrementing the number of containers to keep track of them
                containers++;
            } // end else
        } // end else
    } // end while

	// outputting the results
    printf("Ship's Weight Capacity: %.2f tons\n", totalCapacity);
    printf("%d containers were loaded\n", containers);
    printf("Total weight loaded: %.2f tons\n", loadedWeight);

} // end main
