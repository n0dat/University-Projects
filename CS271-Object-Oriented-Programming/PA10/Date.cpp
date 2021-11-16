// CS271 - PA10
// Program name: Date.cpp
// James Cooper
// April 27th, 2021

#include <stdexcept>
#include <iostream>
#include "Date.h"
#include <string>
#include <iomanip>

// global data
unsigned int month;
unsigned int day;
unsigned int year;
static int days[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};


// make things nice
using namespace std;

// default constructor to set default values for objects
Date::Date() {
	setDate(1, 1, 1980);
} // end Date

// constructor to set data members based off input
Date::Date(unsigned int m, unsigned int d, unsigned int y) {
	setDate(m, d, y);
} // end Date

// helper function to check if year is a leap year
bool Date::leapYear() {
	
	// return true if year is a leap year
	if (year % 4 == 0) 
		return true;

	return false;
} // end leapYear

// helper function to find if day as at the end of a month
bool Date::endOfMonth() {
	
	// checking with february
	if (month == 2) {
		if (leapYear() && day == 29)
			return true;

		if (day == 28)
			return true;
	} // end if
	
	// all other months
	else if (day == days[month]) {
		return true;
	} // end else if
	
	return false;
} // end endOfMonth

// helper function to increment day values, and increase month and year
// if appropriate
void Date::helpIncrement() {
	
	// if its not end of month increment day by 1
	if (!endOfMonth()) {
		++day;
	} // end if
	else {
		
		// if it is the end of the month check if its not end of year
		// and add 1 to month and reset day to 1
		if (month < 12) {
			++month;
			day = 1;
		} // end if
		
		// when it is end of year reset day and month to 1 and increment year by 1
		else {
			++year;
			month = 1;
			day = 1;
		} // end else
	} // end else
} // end helpIncrement

// mutator to set month, day, and year values and throw exception if data
// is out of range
void Date::setDate(unsigned int m, unsigned int d, unsigned int y) {
	
	static string dayError;
	// making sure month is 1-12
	if (m > 0 && m <= 12)
		month = m;
	else 
		throw invalid_argument("month must be 1 - 12");
	
	// making sure year 1980 - 2100
	if (y >= 1980 && y <= 2100) 
		year = y;
	else
		throw invalid_argument("year must be 1980 - 2100");
	
	dayError = "day must be 1 - " + to_string(days[month]);
	
	// checking if month is february and leapyear
	if (month == 2) {
		// when february is on a leap year
		if (leapYear()) {
			if (d > 0 && d < 30)
				day = d;
			else
				throw invalid_argument("day must be 1 - 29");

		} // end if
		// when february is not on a leap year
		else {
			if (d > 0 && d < 29)
				day = d;
			else
				throw invalid_argument("day must be 1 - 28");

		} // end else
	} // end if
	
	// all months but february will end days corresponding to the array days
	else {
		if (d > 0 && d < days[month])
			day = d;
		else
			throw invalid_argument(dayError);
	} // end else
	
} // end setDate

// accessor to return month value
int Date::getMonth() const{
	return month;
} // end getMonth

// accessor to return day value
unsigned int Date::getDay() const{
	return day;
} // end getDay

// accessor to return year value
unsigned int Date::getYear() const{
	return year;
} // end getYear

// ++ operator
Date Date::operator++(int) {
	Date temp = *this;
	helpIncrement();
	return temp;
} // end operator++

// ++ overload
Date &Date::operator++() {
	helpIncrement();
	return *this;
} // end operator++

// += overload
Date &Date::operator+=(unsigned int nd) {
	
	// use helpIncrement() on Date object nd amount of times
	for (int i = 0; i < nd; i++) {
		helpIncrement();
	} // end for
	return *this;
} // end operator+=

// output stream overload
ostream &operator<<(ostream &output, const Date &d) {
	static string months[13] = {"", "January", "February", "March", "April", "May", "June"        , "July", "August", "September", "October", "November", "December"};
	output << months[d.month] << setfill('0') <<  " " << setw(2) << d.day << ", " << setw(4) << d.year;
	return output;
} // end operator<<

// input stream overload
istream &operator>>(istream &input, Date &d) {
	
	// declaring 3 int variables
	unsigned int a, b, c;
	
	// getting input and storing into variables
	cout << "Enter month: ";
	input >> a;
	cout << endl << "Enter day: ";
	input >> b;
	cout << endl << "Enter year: ";
	input >> c;
	cout << endl;
	
	// calling setDate to see if I can use the input
	d.setDate(a, b, c);
	return input;
} // end operator>>
