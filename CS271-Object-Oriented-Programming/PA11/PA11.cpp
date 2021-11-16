// CS271 - PA11
// Program name: PA11.cpp
// James Cooper
// April 30th, 2021

#include <iostream>
#include <stdexcept>
#include "Date.h"
#include "LongDate.h"

// make things nice
using namespace std;

int main() {
	
	// creating 2 LongDate objects with preset dates
	LongDate date1(10, 28, 2022); // friday
	LongDate date2(4, 30, 2021); // friday
	
	// printing date then day of the week of both objects
	cout << date1 << " is a: " << date1.getDayOfTheWeek() << endl;
	cout << date2 << " is a: " << date2.getDayOfTheWeek() << endl;
	
	// using setDate to set new dates for both objects, one is on a leap year
	date1.setDate(2, 29, 1988);
	date2.setDate(12, 31, 2100);
	
	// setting new day of the week based on new set date
	date1.setDayOfTheWeek();
	date2.setDayOfTheWeek();
	
	cout << endl;
	
	// printing both date objects day of the week
	cout << date1 << " is a: " << date1.getDayOfTheWeek() << endl;
	cout << date2 << " is a: " << date2.getDayOfTheWeek() << endl;
	
	// try to get user input to set new date
	try {
		cout << "Enter Month, Day, Year: " << endl;
		cin >> date1;
		cout << endl;
	} // end try
	catch (invalid_argument &e) {
		cout << "ERROR: " << e.what() << endl;
	} // end catch
	
	// setting day of the week
	date1.setDayOfTheWeek();
	
	// printing new or unchanged date if error occured
	cout << date1 << " is a: " << date1.getDayOfTheWeek() << endl;
} // end main
