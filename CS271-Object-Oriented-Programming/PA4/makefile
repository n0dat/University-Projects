all: pa4

pa4: arrayfunctions.o pa4.o
	gcc arrayfunctions.o pa4.o -o pa4

pa4.o: pa4.c arrayfunctions.h
	gcc -c pa4.c

arrayfunctions.o: arrayfunctions.c arrayfunctions.h
	gcc -c arrayfunctions.c

clean:
	rm -rf *.o	
