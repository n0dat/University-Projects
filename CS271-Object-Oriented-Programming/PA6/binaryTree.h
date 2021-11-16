// CS271 - PA6
// Program name:binaryTree.h
// James Cooper
// March 16th, 2021
//
// struct definition and prototypes for binary tree functions
// 
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#ifndef BINARY_TREE
#define BINARY_TREE

// node structure definition                            

struct treeNode {                                           
   struct treeNode *leftPtr; // pointer to left subtree 
   int data; // node value                               
   struct treeNode *rightPtr; // pointer to right subtree
}; // end treeNode 

// typedef statements to make it easier to declare node and tree
// variables

typedef struct treeNode TreeNode; // synonym for struct treeNode
typedef TreeNode *TreeNodePtr; // synonym for TreeNode*

// function prototypes
void insertNode(TreeNodePtr *, int);
void inOrder(TreeNodePtr);
void preOrder(TreeNodePtr);
void postOrder(TreeNodePtr);
int min(TreeNodePtr);
int max(TreeNodePtr);
int sum(TreeNodePtr);

#endif
