// CS271 - PA9
// Program name: WindTurbine.h
// James Cooper
// April 10th, 2021

#include <string>

#ifndef WINDTURBINE_H
#define WINDTURBINE_H

// make things clean
using namespace std;

class WindTurbine {
	
	// private data
	private:
	
		// class only data
		double powerOutput;
		unsigned int bladeSpeed;
		string orientation;
	
	// public functions to be used elsewhere
	public:
		
		// constructor
		WindTurbine(double, int, string);
		
		// mutator functions
		void setPowerOutput(double);
		void setBladeSpeed(int);
		void setOrientation(string);

		// accessor functions
		double getPowerOutput();
		int getBladeSpeed();
		string getOrientation();
		
		// print function
		void toString();
}; // end class WindTurbine

#endif
