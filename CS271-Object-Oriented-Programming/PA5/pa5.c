// CS271 - PA5
// Program name: pa5.c
// James Cooper
// March 11th, 2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "sortingfunctions.h"
#define ARRAYSIZE 10

void main() {
	srand(time(NULL));
	// dynamically allocate memory space for an array
	int *arrayPtr = (int *) malloc(sizeof(int) * ARRAYSIZE);
	
	// fill the array with random integers
	fillArray(arrayPtr, ARRAYSIZE, 1, 100);
	
	printf("Elements of array: \n");
	
	// print the array, 10 elements per line
	neatPrint(arrayPtr, ARRAYSIZE, 10, 4);
	
	// sort the array using selection sort and print the return value
	int returnSelect = selectionSort(arrayPtr, ARRAYSIZE);
	printf("Return of Selection Sort: %d\n", returnSelect);
		
	// print the array, 10 elements per line
	printf("Sorted array: \n");
	neatPrint(arrayPtr, ARRAYSIZE, 10, 4);

	// fill the array again with random integers
	fillArray(arrayPtr, ARRAYSIZE, 1, 100);
	
	printf("\nElements of array: \n");
		
	//	print the array
	neatPrint(arrayPtr, ARRAYSIZE, 10, 4);
	
	// sort with insertion sort and print the return value
	int returnInsert = insertionSort(arrayPtr, ARRAYSIZE);
	printf("Return of Insertion Sort: %d\n", returnInsert);
	
	// print the array
	printf("Sorted array: \n");
	neatPrint(arrayPtr, ARRAYSIZE, 10, 4);
	
	// free up memory where array was
	free(arrayPtr);
	
} // end main
