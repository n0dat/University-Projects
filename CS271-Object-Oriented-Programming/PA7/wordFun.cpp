// CS271 - PA7
// Program name: wordFun.cpp
// James Cooper
// March 30th, 2021

#include <string>
#include <iostream>

// so I don't have to do std:: on many functions
using namespace std;

int main() {
	
	// declaring string array with space for 25 elements
	string stringArray[25];

	// variable to help in printing characters
	string characterOut;

	// variable to keep track of things
	int i = 1, count;
	
	// asking for user input and putting it in first spot of array
	cout << "Type a word (press Ctrl-D to quit): ";
	cin >> stringArray[0];
	
	// getting input until Ctrl-D or array is full
	while (!(cin.eof()) && i < 24) {
		cout << "Type a word (press Ctrl-D to quit): ";
		cin >> stringArray[i];
		i++;
	} // end while

	// seeing how many elements were populated
	count = i;
	cout << endl;
	// printing out string elements in array
	for (i = 0; i < count; i++) {
		cout << stringArray[i] << endl;
		characterOut = stringArray[i];
		// printing out individual characters of each string element
		for (int k = 0; k < characterOut.length(); k++) {
			cout << characterOut[k] << endl;
		} // end for
		cout << endl;
	} // end for
} // end main


/*
	This code makes many assumptions on about
	what the user is going to  input.
	
	It's interesting, you can type a sentence
	and it will all count as seperate input,
	between the spaces. Therefore running the
	print statement many times all at once.
	Not pretty, but works.

	If getline was used you could substring the input
	up to the first space avoiding the spam, but
	getline was not allowed to be used. >:(
*/
