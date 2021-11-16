// CS271 - PA8
// Program name: Time.h
// James Cooper
// April 6th, 2021

#ifndef TIME_H
#define TIME_H

#include <iostream>

// make things cleaner
using namespace std;

class Time {
	
	// private class only variables
	private:
		unsigned int hour;
	 	unsigned int minute;
		unsigned int second;
	
	// public functions to be used elsewhere
	public:
		
		// default constructor
		Time();
		
		// other constructor
		Time(int, int, int);
		
		// mutator functions
		void setHour(int h);
		void setMinute(int m);
		void setSecond(int s);
		
		// accessor functions
		int getHour();
		int getMinute();
		int getSecond();
		
		// print functions
		void print ();
		void print12();
}; // end class Time
#endif
