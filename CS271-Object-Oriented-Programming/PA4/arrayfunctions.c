// CS271 - PA 4
// Program name: arrayfunctions.c
// James Cooper
// February 25th, 2021

#include <stdlib.h>
#include <stdio.h>
#include "arrayfunctions.h"

// function to fill array with random integers in given range
void fillInteger(int a[], int length, int min, int max) {
	// loop to fill array with integers
	for (int i = 0; i < length; i++) {
		// generating random integers in range and putting them into array
		a[i] = (rand() % (max - min + 1)) + min;	
	} // end for
} // end fillInteger

// function to fill array with random lowercase letters in given range
void fillCharacter(char c[], int length, char start, char end) {
	// loop to fill array with characters in the lowercase alphabet and putting them into array
	for (int i = 0; i < length; i++) {
		// generating random leters in range
		c[i] = (rand() % (end - start + 1)) + start;
	} // end for
} // end fillCharacter

// function to find 2 consecutive integers in an array
void findConsecutive(int array[], int length) {
	// loop to search array for two numbers that are consecutive
	for (int i = 0; i < length; i++) {
		// if loop reached of the array to avoid errors
		if (i + 1 == length) {
		} // end if
		else{
			// printing the 2 consecutive integers
			if (array[i] == array[i + 1] - 1) {
				printf("Elements [%d] and [%d] are consecutive.\n", i, i + 1);
			} // end if
		} // end else
	} // end for
} // end findConsecutive

// function to find 3 elements that are consecutive in the alphabet in the array
void findTriples(char c[], int length) {
	// loop to search through array looking for consecutive letters
	for (int i = 0; i < length; i++) {
		// if loop reaches end of the array to avoid errors
		if (i + 1 == length) {
		} // end if
		else {
			// printing the string of letters that are consecutive
			if (c[i] == c[i + 1] - 1 && c[i + 1] == c[i + 2] - 1) {
				printf("%c%c%c\n", c[i], c[i + 1], c[i + 2]);
			} // end if
		} // end else
	} // end for
} // end findTriples

// function to calculate how many times a certian letter occurs in an array of characters
int countCharacter(char c[], int length, char searchChar) {
	int count = 0;
	// loop to search array for input character
	for (int i = 0; i < length; i++) {
		// incrementing count if input character is found in the array
		if (c[i] == searchChar) {
			count++;
		} // end if
	} // end for
	// returning the number of times input character was found in array
	return count;
} // end countCharacter

// function to fill array with random float values in given range
void fillFloat(float a[], int length, float min, float max) {
	min *= 10;
	max *= 10;
	// loop to fill array with random float values
	for (int i = 0; i < length; i++) {
		// if this was like the integer formula, it would result
		// in numbers in the thousands. After about rand() in my
		// book, I realized that I could divide it by the max value 
		// of rand(). This brings the values in the range given
		a[i] = ((float) rand() / (float) RAND_MAX) * max;
		// making sure that adding the min will not make element go over max
		if (a[i] + min > max) {
		} // end if
		else {
			// adding min when it will be less than max value
			a[i] += min;
		} // end else
		a[i] /= 10.0;
	} // end for
} // end fillFloat

// function to find the mean float value in an array
float floatMean(float array[], int length) {
	float mean = 0.0;
	// loop to add each element of the array to a sum
	for (int i = 0; i < length; i++) {
		mean += array[i];
	} // end for
	// calculating the mean
	mean /= length;
	//returning the mean value
	return mean;
} // end floatMean

// function to find minimum float value in an array
float floatMin(float array[], int length) {
	float min;
	// for loop to search array and compare its elements and store the min value
	for (int i = 0; i < length; i++) {
		// setting min equal to first element in array for first iteration
		if (i == 0) {
			min = array[i];
		} // end if
		// setting min equal to element in array that is less than current min value
		if (array[i] < min) {
			min = array[i];
		} // end if
	} // end for
	// returning the min value
	return min;
} // end floatMin

// function to find the maximum float value in an array
float floatMax(float array[], int length) {
	float max;
	// for loop to search array and compare its elements and store the max value
	for (int i = 0; i < length; i++) {
		// setting max equal to first element in array for first iteration
		if (i == 0) {
			max = array[i];
		} // end if
		// setting max equal to element in array that is greater than current max value
		if (array[i] > max) {
			max = array[i];
		} // end if
	} // end for
	//returning the max value
	return max;
} // end floatMax
