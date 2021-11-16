all: pa9

pa9: WindTurbine.o PA9Test.o
	g++ -std=c++11 WindTurbine.o PA9Test.o -o pa9

PA9Test.o: PA9Test.cpp WindTurbine.h
	g++ -std=c++11 -c PA9Test.cpp

WindTurbeine.o: WindTurbine.cpp WindTurbine.h
	g++ -std=c++11 -c WindTurbine.cpp

clean:
	rm -rf *.o
