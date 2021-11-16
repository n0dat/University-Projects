// CS271 - PA6
// Program name: binaryTree.c
// James Cooper
// March 18th, 2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "binaryTree.h"

void main() {

	TreeNodePtr rootPtr = NULL;

	srand(time(NULL));
	puts("The numbers being placed in the tree are: ");
	
	// filling example tree "rootPtr" with random values and printing them
	for (uint i = 0; i < 10; i++) {
		int item = rand() % 15;
		printf("%3d", item);
		insertNode(&rootPtr, item);
	} // end for
	
	// passing the example tree "rootPtr" into 3 traversal functions
	puts("\n\nThe preOrder traversal is: ");
	preOrder(rootPtr);
	
	puts("\n\nThe inOrder traversal is: ");
	inOrder(rootPtr);
	
	puts("\n\nThe postOrder traversal is: ");
	postOrder(rootPtr);
	printf("\n\n");

	// creating 3 new trees to test out the functions
	TreeNodePtr emptyPtr = NULL;
	TreeNodePtr singlePtr = NULL;
	TreeNodePtr multiplePtr = NULL;

	printf("-------------------------------\n");	
	printf("\nSingle Node Tree: \n");
	
	// filling up the single node tree with 1 random value and printing it
	for (uint i = 0; i < 1; i++) {
		int item = rand() % 15;
		printf("%3d", item);
		insertNode(&singlePtr, item);
	} // end for

	printf("\nMultiple Node Tree: \n");

	// filling up the multiple node tree with 5 random values and printing them
	for (uint i = 0; i < 6; i++) {
		int item = rand() % 15;
		printf("%3d", item);
		insertNode(&multiplePtr, item);
	} // end for

	printf("\n\n----------------------------\n");
	
	// printing out results of passing the 3 trees into min() function
	printf("\nMin of: Empty, Single, Multiple (trees) \n");	
	printf("Empty Min = %d\n", min(emptyPtr));
	printf("Single Node Min = %d\n", min(singlePtr));
	printf("Multiple Node Min = %d\n", min(multiplePtr));
	
	// printing out results of passing the 3 trees into the max() function
	printf("\nMax of: Empty, Single, Multiple (trees) \n");
	printf("Empty Max = %d\n", max(emptyPtr));
	printf("Single Node Max = %d\n", max(singlePtr));
	printf("Multiple Node Max = %d\n", max(multiplePtr));
	
	// printing out results of passing the 3 trees into the sum() function
	printf("\nSum of: Empty, Single, Multiple (trees) \n");
	printf("Empty Sum = %d\n", sum(emptyPtr));
	printf("Single Node Sum = %d\n", sum(singlePtr));
	printf("Multiple Node Sum = %d\n", sum(multiplePtr));
	
} // end main
