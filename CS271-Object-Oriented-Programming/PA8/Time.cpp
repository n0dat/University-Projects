// CS271 - PA8
// Program name: Time.cpp
// James Cooper
// April 6th, 2021

#include <iostream>
#include <iomanip>
#include <string>
#include "Time.h"

// make things cleaner
using namespace std;

// global variables
unsigned int hour;
unsigned int minute;
unsigned int second;

// default constructor
Time::Time() {
} // end Time

// main constructor setting input to global variables
Time::Time(int h, int m, int s) {
	setHour(h);
	setMinute(m);
	setSecond(s);
} // end Time

// mutator to set hour viarbale
void Time::setHour(int h) {
	if (h >= 0 && h <= 23) {
		hour = h;
	} // end if
} // end setHour

// mutator to set minute variable
void Time::setMinute(int m) {
	if (m >= 0 && m <= 59) {
		minute = m;
	} // end if
} // end setMinute

// mutator to set second variable
void Time::setSecond(int s) {
	if (s >= 0 && s <= 59) {
		second = s;
	} // end if
} // end setSecond

// accessor to get hour variable
int Time::getHour() {
	return hour;
} // end getHour

// accessor to get minute variable
int Time::getMinute() {
	return minute;
} // end getMinute

// accessor to get second variable
int Time::getSecond() {
	return second;
} // end getSecond

// print function to print out global variables with formatting and setting blanks to 0's
void Time::print() {
	cout << setfill('0') << setw(2) << getHour() << ":" << setw(2) << getMinute();
	cout << ":" << setw(2) << getSecond() << endl;
} // end print

// print function to print out global variables with formatting and setting blacks to 0's
void Time::print12() {

	// cheking if current time is in 24 hour if so converting to 12 hour
	if (hour > 12) {
		hour -= 12;
		cout << setfill('0') << setw(2) << getHour() << ":" << setw(2) << getMinute();
		cout << ":" << setw(2) << getSecond() << "PM" << endl;
	} // end if
	else {
		cout << setfill('0') << setw(2) << getHour() << ":" << setw(2) << getMinute();
		cout << ":" << setw(2) << getSecond() << "AM" << endl;
	} // end else
} // end print12

