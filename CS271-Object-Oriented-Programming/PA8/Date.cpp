// CS271 - PA8
// Program name: Date.cpp
// James Cooper
// April 6th, 2021

#include <iostream>
#include <iomanip>
#include "Date.h"

// make things cleaner
using namespace std;

unsigned int month;
unsigned int day;
unsigned int year;

// constructor
Date::Date(int m, int d, int y) {
	month = m;
	day = d;
	year = y;
} // end Date

// mutator to set month variable in range
void Date::setMonth(int m) {
	if (m > 0 && m <= 12) {
		month = m;
	} // end if
} // end setMonth

// mutator to set year variable in range
void Date::setYear(int y) {
	if (y >= 1980 && y <= 2100) {
		year = y;
	} // end if
} // end setYear

// mutator to set day variable in range with month, and year checking
void Date::setDay(int d) {
	
	// if the month is february
	if (month == 2) {
		
		// checking if it is a leap year
		if (year % 4 == 0) {
			
			// february has 29 days if it is
			if (d > 0 && d < 30) {
				day = d;
			} // end if
		} // end if
		else {
			
			// otherwise it only has 28
			if (d > 0 && d < 29) {
				day = d;
			} // end if
		} // end else
	} // end if
	// if the month is even, only has 30 days
	else if (month % 2 == 0) {
		if (d > 0 && d < 31) {
			day = d;
		} // end if
	} // end else if
	
	// all other months have 31 days
	else {
		if (d > 0 && d < 32) {
			day = d;
		} // end if
	} // end else
} // end setDay

// mutator to get current value in month
int Date::getMonth() {
	return month;
} // end getMonth

// mutator to get current value in year
int Date::getYear() {
	return year;
} // end getYear

// mutator to get current value in day
int Date::getDay() {
	return day;
} // end getDay

// print function to printout all variables neatly and formatted
void Date::print() {
	
	// these will backfill spaces with 0's
	cout << setw(2) << setfill('0') << getMonth() << "/";
	cout << setw(2) << setfill('0') << getDay() << "/";
	cout << getYear() << endl;
} // end print
