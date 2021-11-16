// CS271 - PA7
// Program name: logTable.cpp
// James Cooper
// March 30th, 2021

#include <iostream>
#include <cmath>
#include <iomanip>

// so I don't have to type std:: for many things
using namespace std;

int main() {
	
	// printing out table header, I split it into two because
	// no one likes long lines
	cout << right << "Number" << setw(13) << "Log base 2";
	cout << right << setw(14) << "Log base 10" << setw(12) << "Log base e" << endl;
	
	// loop to calculate the log of 1 - 100 with different bases
	for (int i = 1; i <= 100; i++) {
		
		// printing the current integer
		cout << right << setw(4) << i;
		
		// printing the result of log2(i) with formatting
		cout << right << setw(13) << fixed << setprecision(3) << log2(i);
		
		// printing the result of log10(i) with formatting
		cout << right << setw(13) << fixed << setprecision(3) << log10(i);
		
		// printing the result of log(i) with formatting
		cout << right << setw(13) << fixed << setprecision(3) << log(i) << endl;
	} // end for
} // end main



// This one was easy, maybe too easy...
