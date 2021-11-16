// CS271 - PA8
// Program name: Calender.cpp
// James Cooper
// April 6th, 2021

#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <ctime>
#include "Time.h"
#include "Date.h"

// make things cleaner
using namespace std;

int main() {
	// seeding random with time
	srand(time(NULL));
	
	// creating an array of 5 Time objects
	Time timeArray[5];
	
	// loop to fill the 5 objects with random values then print them out in correct format
	for (int i = 0; i < 5; i++) {
		
		// putting random date in object variables
		timeArray[i].Time::setHour(rand() % 23);
		timeArray[i].Time::setMinute(rand() % 59);
		timeArray[i].Time::setSecond(rand() % 59);
		
		// printing out the time in current format utilizing the print functions
		cout << "24 Hour Format: ";
		timeArray[i].Time::print();
		cout << "12 Hour Format: ";
		timeArray[i].Time::print12();
		cout << endl;
	} // end for

	// creating an array of 5 Date objects
	Date dateArray[5];
	int d, m, y;
	for (int i = 0; i < 5; i++) {
		
		// getting user input for the day
		cout << "Enter the month: ";
		cin >> m;
		cout << endl << "Enter the year: ";
		cin >> y;
		cout << endl << "Enter the day: ";
		cin >> d;
		cout << endl;
		
		// setting object variables with user input
		dateArray[i].Date::setMonth(m);
		dateArray[i].Date::setYear(y);
		dateArray[i].Date::setDay(d);
		
		// printing out the date uzilizing print function
		cout << "Date: ";
		dateArray[i].Date::print();
		cout << endl;
	} // end for
} // end main
