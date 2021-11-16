// CS271 - PA5
// Program name: sortingfunctions.c
// James Cooper
// March 11th, 2021

#include <stdio.h>
#include <stdlib.h>
#include "sortingfunctions.h"

int selectionSort(int *const data, int size) {
	int comparisons = 0, min;
	for (int index = 0; index < size - 1; index++) {
		min = index;
		// looping through array checking if next element is smaller
		for (int scan = index + 1; scan < size; scan++) {
			// what to do if current element is smaller
			if (*(data + scan) < *(data + min)) {
				min = scan;
				comparisons++; // keeping track of number of comparisons
			} // end if
		} // end for
		// swapping values when a switch is needed between 2 elements
		swap((data + index), (data + min));
		comparisons++; // keeping track of number of comparisons
	} // end for
	return comparisons;
} // end selectionSort

int insertionSort(int *const data, int size) {
	int comparisons = 0, move;
	int insert;
	for (int index = 1; index < size; index++) {
		move = index;
		insert = *(data + index);
		// comparing values if previous element is less than current
		while (move > 0 && *(data + (move - 1)) >= insert) {
			// it will loop through all elements all the way to 0
			// switching values when needed
			*(data + move) = *(data + (move - 1));
			move--;
			comparisons++; // keeping track of number of comparisons
		} // end while
		*(data + move) = insert;
	} // end for
	return comparisons;
} // end insertionSort

void swap(int *num1, int *num2) {
	// swapping the values from pointer to other pointer
	int temp = *num1;
	*num1 = *num2;
	*num2 = temp;
} // end swap

void fillArray(int *const data, int size, int min, int max) {
	for (int index = 0; index < size; index++) {
		// filling array with random numbers in range (inclusive)
		*(data + index) = (rand() % (max - min - 1)) + min;
	} // end for
} // end fillArray

void neatPrint(int *const data, int size, int numPerLine, int fieldSize) {
	for (int index = 0; index < size; index++) {
		// printing out elements of array with set fieldwidth from input
		printf("%*d", fieldSize, *(data + index));
		
		// print newline if input number of elements per line is reached
		if (index % numPerLine == numPerLine - 1) {
			printf("\n");
		} // end if
	} // end for
} // end neatPrint
