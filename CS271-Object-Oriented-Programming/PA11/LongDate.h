// CS271 - PA11
// Program name: LongDate.h
// James Cooper
// April 30th, 2021

#include <iostream>
#include <string>
#include "Date.h"

#ifndef LONGDATE_H
#define LONGDATE_H

// make things nice
using namespace std;

class LongDate : public Date {
	
	// private data member
	private:
		string dayOfTheWeek;
	
	// public functions	
	public:
		
		// constructor
		LongDate(int, int, int);
		
		// mutator to set dayOfTheWeek
		void setDayOfTheWeek();
		
		// accessor to get dayOfTheWeek
		string getDayOfTheWeek() const;
		
		// mutator to set Date
		void setDate(int, int, int);	

}; // end LongDate class

#endif
