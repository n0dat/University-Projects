// CS271 - PA11
// Program name: LongDate.cpp
// James Cooper
// April 30th, 2021

#include <iostream>
#include <string>
#include "LongDate.h"
#include "Date.h"

// make things nice
using namespace std;

// global data
string dayOfTheWeek;

// constructor to set Date and dayOfTheWeek values
LongDate::LongDate(int m, int d, int y) : Date(m, d, y) {
	setDate(m, d, y);
	setDayOfTheWeek();
} // end LongDate

// mutator for dayOfTheWeek
void LongDate::setDayOfTheWeek() {
	
	// array holding the days of the week
	static const string weekDays[7] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	// this function uses an algorithm made by Tomohiko Sakamoto which was
	// posted in 1992
	
	// local variabels to use in algorithm
	int day = Date::getDay();
	int month = Date::getMonth();
	int year = Date::getYear();

	// table of values that are day offsets for each month based on year
	int tableValues[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

	// manupulate year to help with algorithm
	if (month < 3) {
		year--;
	} // end if
		
	// algorithm to find the day of the week given any date
	int W = ((year + year / 4 - year / 100 + year / 400 + tableValues[month -1 ] + day) % 7);
	dayOfTheWeek = weekDays[W];
	
	
} // end setDayOfTheWeek

// accessor to get dayOfTheWeek value
string LongDate::getDayOfTheWeek() const {
	return dayOfTheWeek;
} // end getDayOfTheWeek

// mutator to set the date using setDate from Date class
void LongDate::setDate(int m, int d, int y) {
	Date::setDate(m, d, y);
} // end setDate
