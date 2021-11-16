// James Cooper
// CS272 - M01
// Lab 2
// September 9, 2021

// Apologies for my complete lack of comments on the last Lab.
// I completely forgot them and didn't realize until after 
// I had submitted.

import java.util.*;

// Employee Class
public class Employee implements Cloneable{
	
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
	
	// main method to test methods in Employee class
	public static void main(String args[]) {
		
		// testing things
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		int adv[] = {2, 7, 3};
		int adv2[] = {9, 5, 6};
		
		// test mutators
		emp1.setAdvisors(adv);
		emp2.setAdvisors(adv2);
		emp2.setEmployeeNo(5);
		emp2.setEmployeeZipCode(87109);
		
		// checking output
		System.out.println("emp1\n" + emp1.toString());
		System.out.println("\nemp2\n" + emp2.toString() + "\n");
		
		// using getAllAdvisors() to find distinct advisors
		int allAdv[] = getAllAdvisors(emp1, emp2);		
		System.out.println("\ndistinct advisors; ");
		for (int i : allAdv)
			System.out.print(i + ", ");
		
		System.out.println("\n\n" + emp1.equals(emp2) + "\n");
		
		emp2.setEmployeeState("Utah");
		emp2.setEmployeeName("Boid Gathers");
		
		// checking clone and copy contructors
		Employee emp3 = emp2.clone();
		Employee emp4 = new Employee(emp2);
		
		// making sure it didn't just copy or clone the memory location
		emp2.setEmployeeNo(59120914);
		System.out.println("emp3 no: " + emp3.getEmployeeNo());
		System.out.println("emp4 no: " + emp4.getEmployeeNo());
		// it did not
		
	}
}