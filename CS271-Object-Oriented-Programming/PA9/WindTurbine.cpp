// CS271 - PA9
// Program name: WindTurbine.cpp
// James Cooper
// April 10th, 2021

#include <string>
#include <iostream>
#include "WindTurbine.h"

// make things clean
using namespace std;

// declaration of global variables
double powerOutput;
unsigned int bladeSpeed;
string orientation;

// main constructor to set values of powerOutput, bladeSpeed, orientation
WindTurbine::WindTurbine(double p, int b, string o) {

	// this is done because if the input is out of range
	// it will use the default values
		
	// default object variable values
	powerOutput = 100.0;
	bladeSpeed = 0;
	orientation = "horizontal";
	
	// setting the object variable values
	setPowerOutput(p);
	setBladeSpeed(b);
	setOrientation(o);

} // end WindTurbine

// mutator to set powerOutput value with data validation
void WindTurbine::setPowerOutput(double p) {
	if (p >= 1.0 && p <= 10000.0) {
		powerOutput = p;
	} // end if
} // end setPowerOutput

// mutator to set bladeSpeed value with data validation
void WindTurbine::setBladeSpeed(int b) {
	if (b >= 0 && b <= 300) {
		bladeSpeed = b;
	} // end if
} // end setBladeSpeed

// mutator to set orientation value with data validation
void WindTurbine::setOrientation(string o) {
	if (o == "vertical" || o == "horizontal") {
		orientation = o;
	} // end if
} // end setOrientation

// accessor to get powerOutput value
double WindTurbine::getPowerOutput() {
	return powerOutput;
} // end getPowerOutput

// accessor to get bladeSpeed value
int WindTurbine::getBladeSpeed() {
	return bladeSpeed;
} // end getBladeSpeed

// accessor to get orientation value
string WindTurbine::getOrientation() {
	return orientation;
} // end getOrientation

// function to print value of global variables
void WindTurbine::toString() {
	cout << "WindTurbine: powerOutput = " << to_string(getPowerOutput()) << " kW  bladeSpeed = " << to_string(getBladeSpeed());
	cout << "  orientation = " << getOrientation() << endl;
} // end toString
