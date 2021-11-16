all: pa3

pa3: pa3functions.o pa3.o
	gcc pa3functions.o pa3.o -o pa3 -lm

pa3.o: pa3.c pa3functions.h
	gcc -c pa3.c -lm

pa3functions.o: pa3functions.c pa3functions.h
	gcc -c pa3functions.c -lm

clean:
	rm -rf *.o
