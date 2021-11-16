// CS271 - PA10
// Program name: PA10.cpp
// James Cooper
// April 27th, 2021

#include <iostream>
#include "Date.h"
#include <iomanip>
#include <string>
#include <stdexcept>

// make things nice
using namespace std;

int main() {

	// creating Date objects
	Date date1;
	Date date2;
	Date date3(10, 5, 1983);
	Date date4(9, 15, 1995);
	Date date5;

	// testing overloaded << operator with objects
	cout << "date1" << endl << date1 << endl;
	cout << endl << "date2" << endl << date2 << endl;
	cout << endl << "date3" << endl << date3 << endl;

	// try and catch to get user input to change date1 object data members
	try {
		cout << endl << "date1 input: " << endl;
		cin >> date1;
	} // end try
	// if input data is out of range
	catch (invalid_argument &e) {
		cout << "ERROR: " << e.what() << endl;
	} // end catch

	// using << to print date1
	cout << "date1 after input" << endl << date1 << endl;

	// updating date2 with new data then printing it
	date2.setDate(12, 28, 2001);
	cout << endl << "date2 after setDate" << endl << date2 << endl;

	// printing data of date3 using accessor functions
	cout << endl << "date3" << endl << "Month: " << setw(2) << setfill('0') << date3.getMonth();
	cout << "  Day: " << setfill('0') << setw(2) << date3.getDay() << "  Year: ";
	cout << setfill('0') << setw(4) << date3.getYear() << endl;
	
	// printing dta of date4 using accessor functions
	cout << endl << "date4" << endl << "Month: " << setw(2) << setfill('0') << date4.getMonth();
	cout << "  Day: " << setfill('0') << setw(2) << date4.getDay() << "  Year: ";
	cout << setfill('0') << setw(4) << date4.getYear() << endl;
	
	// try and catch to get user input to change date4 object data members
	try {
		cout << endl << "date4 input: " << endl;
		cin >> date4;
	} // end try
	// if input is out of range
	catch (invalid_argument &e) {
		cout << "ERROR: " << e.what() << endl;
	} // end catch
	
	// using << to print date4
	cout << "date4 after input" << endl << date4 << endl << endl;
	
	// incrementing date4 by a day and printing it
	date4++;
	cout << "date4 ++" << endl << date4 << endl << endl;
	
	// adding 396 day to date4 and printing it
	date4 += 396;
	cout << "date4 += 396" << endl << date4 << endl << endl;
	
	// incrementing date5 by a day and printing it
	date5++;
	cout << "date5 ++" << endl << date5 << endl << endl;
	
	// adding 2301 day to date5 and printing it
	date5 += 2301;
	cout << "date5 += 2301" << endl << date5 << endl;
	
	// try and catch to change date of date5 with setDate
	try {
		date5.setDate(1, 1, 1979);
	} // end try
	// if parameters are out of range
	catch (invalid_argument &e) {
		cout << "ERROR: " << e.what() << endl;
	} // end catch
} // end main
