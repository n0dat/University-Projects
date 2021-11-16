all: Calender

Calender: Date.o Time.o Calender.o
	g++ -std=c++11 Date.o Time.o Calender.o -o Calender

Calender.o: Calender.cpp Time.h Date.h
	g++ -std=c++11 -c Calender.cpp

Time.o: Time.cpp Time.h
	g++ -std=c++11 -c Time.cpp

Date.o: Date.cpp Date.h
	g++ -std=c++11 -c Date.cpp

clean:
	rm -rf *.o
