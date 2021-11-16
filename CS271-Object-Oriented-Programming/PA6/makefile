all: pa6

pa6: binaryTree.o pa6.o
	gcc binaryTree.o pa6.o -o pa6

pa6.o: pa6.c binaryTree.h
	gcc -c pa6.c

binaryTree.o: binaryTree.c binaryTree.o
	gcc -c binaryTree.c

clean:
	rm -rf *.o
