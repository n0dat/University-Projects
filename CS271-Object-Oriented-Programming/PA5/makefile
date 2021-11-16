all: pa5

pa5: sortingfunctions.o pa5.o
	gcc sortingfunctions.o pa5.o -o pa5

pa5.o: pa5.c sortingfunctions.h
	gcc -c pa5.c

sortingfunctions.o: sortingfunctions.c sortingfunctions.o
	gcc -c sortingfunctions.c

clean:
	rm -rf *.o
