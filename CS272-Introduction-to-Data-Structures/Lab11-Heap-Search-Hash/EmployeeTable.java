// James Cooper
// CS272 - M01
// Lab11
// November 26, 2021

import java.util.*;
import java.io.*;

// Employee Class
class Employee implements Cloneable{
	
	// declaring instance variables
	String employeeName;
	String employeeState;
	int employeeNo;
	int employeeAge;
	int employeeZipCode;
	int advisors[];
	
	// defualt constructor to initialize instance variables
	// to defualt values
	public Employee() {
		employeeName = null;
		employeeState = null;
		employeeNo = 0;
		employeeAge = 0;
		employeeZipCode = 0;
		advisors = null;
	}
	
	// copy constructor
	// copies input object to destination object
	// with all the same values for instance variables
	// also checks if input is instance of Employee
	public Employee(Object obj) {
		if (obj != null && (obj instanceof Employee)) {
			// creates new instance of Employee object
			Employee emp = (Employee) obj;
			this.employeeName = new String(emp.employeeName);
			this.employeeState = new String(emp.employeeState);
			this.employeeNo = emp.employeeNo;
			this.employeeAge = emp.employeeAge;
			this.employeeZipCode = emp.employeeZipCode;
			this.advisors = emp.advisors;
		}
	}
	
	// clone function
	// clones data of object and returns object
	// assumes object is instance of Employee
	public Employee clone() {
		Employee value;
		try {
			value = (Employee) super.clone();
			value.employeeName = new String(this.employeeName);
			value.employeeState = new String(this.employeeState);
			value.employeeNo = this.employeeNo;
			value.employeeAge = this.employeeAge;
			value.employeeZipCode = this.employeeZipCode;
			value.advisors = this.advisors;
		}
		// catch on error
		catch (CloneNotSupportedException error) {
			System.out.println(error.getMessage());
			throw new RuntimeException("This class does not implement Cloneable.");
		}
		return value;
	}
	
	// accessor for employeeName
	// return object employeeName value
	public String getEmployeeName() {
		return employeeName;
	}
	
	// mutator for employeeName
	// set object employeeName variable to input parameter
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// accessor for employeeState
	// return object employeeState value
	public String getEmployeeState() {
		return employeeState;
	}

	// mutator for employeeState
	// set object employeeState variable to input parameter
	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	// accessor for employeeNo
	// return object employeeNo value
	public int getEmployeeNo() {
		return employeeNo;
	}

	// mutator for employeeNo
	// set object employeeNo variable to input parameter
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	// accessor for employeeAge
	// return object employeeAge value
	public int getEmployeeAge() {
		return employeeAge;
	}

	// mutator for employeeAge
	// set object employeeAge variable to input parameter
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	// accessor for employeeZipCode
	// return object employeeZipCode value
	public int getEmployeeZipCode() {
		return employeeZipCode;
	}

	// mutator for employeeZipCode
	// set object employeeZipCode variable to input parameter
	public void setEmployeeZipCode(int employeeZipCode) {
		this.employeeZipCode = employeeZipCode;
	}

	// accessor for advisors
	// return object advisors array
	public int[] getAdvisors() {
		return this.advisors;
	}

	// mutator for advisors
	// set object advisors array to input array parameter
	// assumes they are of the same length and is not empty
	public void setAdvisors(int adv[]) {
		this.advisors = adv;
	}
	
	// toString function to present instance
	// variables in a easily readable array
	// assumes that advisors array only has 3 elements
	// that are non-zero
	public String toString() {
		// printing everything neat
		// also makes sure accessors work
		return ("Employee Name: " + getEmployeeName() + "\nEmployee No: " + getEmployeeNo() + "\nAge: " + getEmployeeAge() + "\nState: " + getEmployeeState() + "\nZip Code: " + getEmployeeZipCode() + "\nAdvisors: " + this.advisors[0] + ", " + this.advisors[1] + ", " + this.advisors[2]);
	}
	
	// override equals function with obj input
	public boolean equals(Object obj) {
		
		//makes sure that obj is instance of Employee class
		if (!(obj instanceof Employee))
			return false;
			
		Employee in = (Employee) obj;
		
		// checks if employeeNo is same as input employeeNo
		if (this.employeeNo == in.employeeNo)
			return true;
			
		return false;
	}
	
	// this is an extra helper method that will return true if 
	// the input key value is found in the input array
	// otherwise returning false
	// this assumes the array is not null and key is not null
	public static boolean contains(int array[], int key) {
		int n = 0;
		while (n < array.length) {
			if (array[n++] == key)
				return true;
		}
		return false;
	}
	
	// method will take in two objects and compare their advisors values
	// checking for duplicates and ignoring them to only return
	// distinct values in an array with no extra space
	// assumes both input objects advisors arrays are not empty
	// this should work no matter the size (unless no more memory available)
	public static int[] getAllAdvisors(Employee e1, Employee e2) {
	
		int n = 0;
		int temp[] = new int[e1.advisors.length + e2.advisors.length];
		
		// take e1 and e2 advisors
		// check if current e1 or e2 is already in temp
		// if it is do nothing / skip to next iteration
		// if not store it at the next available index
		
		Arrays.sort(e1.advisors);
		Arrays.sort(e2.advisors);
		
		// inputting e1.advisors into array
		for (int i = 0; i < e1.advisors.length; i++) {
			// if duplicate do not store
			if (contains(temp, e1.advisors[i]))
				continue;
			temp[n++] = e1.advisors[i];
		}
		
		// inputting e2.advisors into array
		for (int i = 0; i < e2.advisors.length; i++) {
			// if duplicate do not store
			if (contains(temp, e2.advisors[i]))
				continue;
			temp[n++] = e2.advisors[i];
		}
		
		// new array to return
		int total[] = new int[n];
		
		// storing array into correctly sized array
		for (int i = 0; i < n; i++) {
			total[i] = temp[i];
		}
		
		Arrays.sort(total);
		
		return total;
	}
	
}

// EmployeeTable class
public class EmployeeTable {

	// instance variables
	private int manyItems;
	private Object keys[];
	private Employee data[];;
	private boolean used[];
	
	// default constructor with default size of 10
	public EmployeeTable() {
	
		final int CAPACITY = 10;
		
		manyItems = 0;
		keys = new Object[CAPACITY];
		data = new Employee[CAPACITY];
		used = new boolean[CAPACITY];
	}
	
	// constructor with an input size
	public EmployeeTable(int capacity) {
	
		if (capacity <= 0)
			throw new IllegalArgumentException("Capacity is negative");
			
		manyItems = 0;
		keys = new Object[capacity];
		data = new Employee[capacity];
		used = new boolean[capacity];
	}
	
	// hash function
	// return input Employee object to hash value using length of data
	private int hash(Employee e) {
	
		return Math.abs(e.getEmployeeNo()) % data.length;
		
	}
	
	// move to next available index
	// return 0 of no more available, otherwise return 1
	// a is current index using nextIndex()
	private int nextIndex(int a) {
	
		if ((a + 1) == data.length)
			return 0;
			
		return 1;
		
	}
	
	// find index of Employee e input
	// return index if found
	// otherwise return -1
	private int findIndex(Employee e) {
	
		int idx = hash(e);
		int key = e.getEmployeeNo();
		int counter = 0;
		
		while (counter < data.length && used[idx]) {
			if (keys[idx].equals(key))
				return idx;
			idx = nextIndex(idx);
			counter++;
		}
		
		return -1;
	}
	
	// gets Employee e object from table
	// return if found, otherwise return null
	public Object get(Employee e) {
	
		int idx = findIndex(e);
		
		if (idx == -1)
			return null;
		else
			return data[idx];
	}
	
	// add a input Employee e into the hash table
	public void put(Employee e) {
	
		int idx = findIndex(e);
		
		if (idx != -1) {
			return;
		}
		
		else if (manyItems < data.length) {
			idx = hash(e);
			int key = e.getEmployeeNo();
			while (keys[idx] != null)
				idx = nextIndex(idx);

			keys[idx] = key;
			data[idx] = e;
			used[idx] = true;
			manyItems++;
		}
		
		else
			throw new IllegalStateException("Table has no more space");
	}
	
	// find index of employee with emp_no
	// return index of employee in array with given employee number
	// otherwise return -1
	public int search(int emp_no) {
	
		for (int i = 0;i < keys.length; i++) {
			if (data[i] == null)
				break;
			if (data[i].getEmployeeNo() == emp_no)
				return i;
		}
		
		return -1;
	}
	
	// return false if a employee with emp_no does not exist
	// otherwise remove it and return true
	public boolean remove(int emp_no) {
	
		int idx = search(emp_no);
		
		if (idx != -1) {
			keys[idx] = null;
			data[idx] = null;
			manyItems--;
			return true;
		}
		
		return false;
	}
	
	// toString method for the table
	// prints out the index of the data, emp no, and used value in a table
	public void toScreen() {
	
		System.out.println("idx   Emp no    used");
		System.out.println("--------------------");
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == null)
				System.out.printf("%3d  %9s  %s\n", i, "null", used[i]);
			else
				System.out.printf("%3d  %9d  %s\n", i, data[i].getEmployeeNo(), used[i]);
		}
		
	}
	
	public static void main(String args[]) {
	
		// create Employee HashTable
		EmployeeTable table = new EmployeeTable(10);
		
		// Employee Objects
		Employee emp0 = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();
		
		// setting random information to each employee
		// this will be long
		
		// setting employee numbers
		emp1.setEmployeeNo(1); // 484121563
		emp2.setEmployeeNo(2); // 462472486
		emp3.setEmployeeNo(3); // 107493030
		emp4.setEmployeeNo(4); // 290224139
		emp5.setEmployeeNo(5); // 232356424
		
		// setting names
		emp1.setEmployeeName("Clement Benton");
		emp2.setEmployeeName("Igor Ireland");
		emp3.setEmployeeName("Alima Estes");
		emp4.setEmployeeName("Garrett Sweeney");
		emp5.setEmployeeName("Alishba Carney");
		
		// setting states
		emp1.setEmployeeState("Alaska");
		emp2.setEmployeeState("Nebraska");
		emp3.setEmployeeState("New Jersey");
		emp4.setEmployeeState("California");
		emp5.setEmployeeState("Montana");

		
		// should be enough to be able to distinguish between employees
		
		// testing put
		table.put(emp0);
		table.put(emp1);
		table.put(emp2);
		table.put(emp3);
		table.put(emp4);
		table.put(emp5);
		
		// making sure they were added
		// counting non-null elements in keys[] and data[]
		int dsize = 0;
		int ksize = 0;
		
		for (int i = 0; i < table.data.length; i++) {
			if (table.data[i] != null)
				dsize++;
		}
		
		for (int i = 0; i < table.keys.length; i++) {
			if (table.keys[i] != null)
				ksize++;
		}
		
		// printing size and manyItems
		System.out.println("data size: " + dsize);
		System.out.println("keys size: " + ksize);
		System.out.println("manyitems: " + table.manyItems);
		
		// testing "toString"
		// it said I could not override the Object toString
		// hence to toScreen name
		table.toScreen();
		
		// testing search
		System.out.println("seach emp1 no: " + table.search(emp1.getEmployeeNo()));
		System.out.println("seach emp2 no: " + table.search(emp2.getEmployeeNo()));
		System.out.println("seach emp0 no: " + table.search(emp0.getEmployeeNo()));
		System.out.println("seach emp3 no + 5: " + table.search(emp3.getEmployeeNo() + 5));
		
		// testing remove
		System.out.println("remove emp4 no: " + table.remove(emp4.getEmployeeNo()));
		System.out.println("remove emp3 no: " + table.remove(emp3.getEmployeeNo()));
		System.out.println("remove emp0 no: " + table.remove(emp0.getEmployeeNo()));
		System.out.println("remove emp5 no - 5: " + table.remove(emp5.getEmployeeNo() - 5));
		
		// searching for a removed employee no
		System.out.println("search emp3 no: " + table.search(emp3.getEmployeeNo()));
		
		
		// I found if the employee no s are not sequential, there are null
		// gaps in the keys and data array causing things to break.
		// I do not know how to fix that, I tried but ran out of time.
	}
}
