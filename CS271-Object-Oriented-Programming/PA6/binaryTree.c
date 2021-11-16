// CS271 - PA6
// Program name: binaryTree.c
// James Cooper
// March 16th, 2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "binaryTree.h"

// inserting nodes into tree in numerical order
void insertNode(TreeNodePtr *treePtr, int value) {
	
	// if tree is empty
	if (*treePtr == NULL) {
		*treePtr = (TreeNodePtr) malloc(sizeof(TreeNode));

		// if memory was allocated, then assign data
		if (*treePtr != NULL) {
			(*treePtr) -> data = value;
			(*treePtr) -> leftPtr = NULL;
			(*treePtr) -> rightPtr = NULL;
		} // end if
		else {
			printf("%d unable to be inserted. No memory available.\n", value);
		} // end else
	} // end if

	// tree is not empty
	else {
		
		// if data to insert is less than data in current node
		if (value < (*treePtr) -> data) {
			insertNode(&((*treePtr) -> leftPtr), value);
		} // end if
		
		// if data to insert is greater than data in current node
		else if (value > (*treePtr) -> data) {
			insertNode(&((*treePtr) -> rightPtr), value);
		} // end else if
		
		// duplicate data value ignored
		else {
			printf("%s", "dup");
		} // end else
	} // end else
} // end insertNode


// function to printout inorder traversal of input tree
void inOrder(TreeNodePtr treePtr) {
	
	// if tree is not empty
	if (treePtr != NULL) {
		inOrder(treePtr -> leftPtr);
		printf("%3d", treePtr -> data);
		inOrder(treePtr -> rightPtr);
	} // end if
} // end inOrder

// function to printout preorder traversal of input tree
void preOrder(TreeNodePtr treePtr) {
	
	// if tree is not empty
	if (treePtr != NULL) {
		printf("%3d", treePtr -> data);
		preOrder(treePtr -> leftPtr);
		preOrder(treePtr -> rightPtr);
	} // end if
} // end preOrder


// function to printout postorder traversal of input tree
void postOrder(TreeNodePtr treePtr) {
	
	// if tree is not empty
	if (treePtr != NULL) {
		postOrder(treePtr -> leftPtr);
		postOrder(treePtr -> rightPtr);
		printf("%3d", treePtr -> data);
	} // end if
} // end postOrder


// function to add all nodes of input tree
int sum(TreeNodePtr treePtr) {
	
	// if tree is empty return 0
	if (treePtr == NULL) {
		return 0;
	} // end if
	
	// else return the sum of all nodes in the tree by recursion
	return ((treePtr -> data) + sum(treePtr -> leftPtr) + sum(treePtr -> rightPtr));
} // end sum

// function to find the minimum node value in input tree
int min(TreeNodePtr treePtr) {
	
	// creating temporary struct to keep track of things
	TreeNodePtr tempNode = treePtr;
	
	// if tree is not empty
	if (treePtr != NULL) {
		
		// incrementing over the left nodes of the tree to find smallest value without hitting NULL
		while ((tempNode -> leftPtr) != NULL) {
			tempNode = tempNode -> leftPtr;
		} // end while
		
		// returning the smallest node found
		return (tempNode -> data);
	} // end if
	free(tempNode);
	return 0;
	
} // end min

// function to find the maximum node value in input tree
int max(TreeNodePtr treePtr) {
	
	// creating a temporary struct to keep track of things
	TreeNodePtr tempNode = treePtr;
	
	// if the tree is not empty
	if (treePtr != NULL) {
		
		// incremnting over the right nodes of the tree to find largest value without hitting NULL
		while ((tempNode -> rightPtr) != NULL) {
			tempNode = tempNode -> rightPtr;
		} // end while
		
		// returning the largest node found
		return (tempNode -> data);
	} // end if
	free(tempNode);
	return 0;
} // end max
