// CS271 - PA8
// Program name: Date.h
// James Cooper
// April 6th, 2021

#ifndef DATE_H
#define DATE_H

#include <iostream>

// make things cleaner
using namespace std;

class Date {
	
	// private class only variables
	private:
		unsigned int month;
		unsigned int day;
		unsigned int year;
	
	// public functions to be used elsewhere
	public:
		
		// default constructor
		Date() {
			month = 1;
			day = 1;
			year = 1980;
		} // end Date
		
		// other constructor
		Date(int, int, int);
	
		// mutator functions
		void setMonth(int);
		void setDay(int);
		void setYear(int);
		
		// accessor functoins
		int getMonth();
		int getDay();
		int getYear();
		
		// print function
		void print();
}; // end class Date
#endif
