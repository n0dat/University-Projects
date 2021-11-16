// CS271 - PA9
// Program name: PA9Test.cpp
// James Cooper
// April 10th, 2021

#include <string>
#include <iostream>
#include "WindTurbine.h"

// make things clean
using namespace std;

int main() {
	
	// variables to store user input
	double powerOutput;
	int bladeSpeed;
	string orientation;
	
	// asking for and storing input into powerOutput
	cout << "Enter the power output in kW: ";
	cin >> powerOutput;
	
	// asking for and storing input into bladeSpeed
	cout << endl << "Enter the blade speed in RPM: ";
	cin >> bladeSpeed;
	
	// asking for and storing input into orientation
	cout << endl << "Enter either 'horizontal' or 'vertical': ";
	cin >> orientation;
	cout << endl;

	// creating WindTurbine object with input
	WindTurbine Turbine1(powerOutput, bladeSpeed, orientation);

	// creating WindTurbine object with manual values
	WindTurbine Turbine2(500.9, 243, "vertical");

	// creating WindTurbine object with out of range values
	WindTurbine Turbine3(-5, 0, "not really");

	// printing Turbine object values
	cout << "Turbine 1: " << endl;
	Turbine1.toString();
	cout << endl;

	//printing Turbine2 object values
	cout << "Turbine 2: " << endl;
	Turbine2.toString();
	cout << endl;

	// Modifying Turbine2 with random values
	Turbine2.setPowerOutput(rand() % 10000 + 1);
	Turbine2.setBladeSpeed(rand() % 300);
	Turbine2.setOrientation("horizontal");

	// printing Turbine2 modified object values
	cout << "Turbine 2 modified: " << endl;
	Turbine2.toString();
	cout << endl;

	// printing Turbine3 object values
	cout << "Turbine 3: " << endl << "powerOutput: " << Turbine3.getPowerOutput();
	cout << " kW  bladeSpeed: " << Turbine3.getBladeSpeed() << "  orientation: ";
	cout << Turbine3.getOrientation() << endl;;
		
} // end main
