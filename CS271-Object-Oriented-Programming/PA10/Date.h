// CS271 - PA10
// Program name: Date.h
// James Cooper
// April 27th, 2021

#include <stdexcept>

#ifndef DATE_H
#define DATE_H

// make things nice
using namespace std;

class Date {
	
	// private data members and help functions
	private:
		unsigned int month;
		unsigned int day;
		unsigned int year;
		void helpIncrement();
		bool endOfMonth();
		bool leapYear();
	
	// public functions
	public:
		// defualt constructor
		Date();
		
		// other constructor
		Date(unsigned int, unsigned int, unsigned int);
		
		// mutator
		void setDate(unsigned int, unsigned int, unsigned int);
		
		// accessors
		int getMonth() const;
		unsigned int getDay() const;
		unsigned int getYear() const;
		
		// operator overloading to manipulate day value with ++ and +=
		Date operator++(int);
		Date &operator++();
		Date &operator+=(unsigned int);
		
		// friend operator overloading for << and >>
		friend ostream &operator<<(ostream &output, const Date &d);
		friend istream &operator>>(istream &input, Date &d);

}; // end class

#endif
