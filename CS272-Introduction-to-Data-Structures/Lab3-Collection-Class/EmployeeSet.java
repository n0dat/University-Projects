// James Cooper
// CS272 - M01
// Lab 3
// September 14, 2021

import java.io.*;

public class EmployeeSet {

	private Employee data[];
	private int manyEmployees;
	
	/** @postcondition
	 * A no-argument constructor, which initializes
	 * an EmployeeSet instance, sets it capacity to 
	 * 10, and creates an array to store 10
	 * Employee objects
	 **/
	public EmployeeSet() {
		// setting an initial capacity for default
		// constructor
		final int INITIAL_CAPACITY = 10;
		manyEmployees = 0;
		data = new Employee[INITIAL_CAPACITY];
	}
	
	/** 
	 * @param obj Object to be referenced in copying
	 * @precondition
	 * obj should NOT be null and should be an instance
	 * of EmployeeSet
	 * @postcondition
	 * Creates new EmployeeSet instance and copies the
	 * content of the input object to the new instance
	 **/
	public EmployeeSet(Object obj) {
		// copying data to new Employee instance
		if (obj != null && (obj instanceof EmployeeSet)) {
			EmployeeSet empSet = (EmployeeSet) obj;
			manyEmployees = empSet.manyEmployees;
			data = new Employee[manyEmployees];
			for (int i = 0; i < manyEmployees; i++) {
				data[i] = empSet.data[i];
			}
		}
	}
	
	/** @precondition
	 * manyEmployees is not null
	 * @return
	 * Integer value representing the number
	 * of current Employee instances in the EmployeeSet
	 **/
	public int size() {
		return manyEmployees;
	}
	
	/** @precondition
	 * data is not null
	 * @return
	 * Integer value representing the length
	 * of the EmployeeSet
	 **/
	public int capacity() {
		return data.length;
	}
	
	/** 
	 * @param a Employee instance to be added to EmployeeSet
	 * @precondition
	 * The Employee object a should NOT be null
	 * @postcondition
	 * A new copy of the Employee object has been added to EmployeeSet
	 * @exception OutOfMemoryError
	 * Indicates insufficient memory for increasing the EmployeeSet's capacity
	 * @note An attempt to increase the capacity beyond
	 * Integer.MAX_VALUE will cause the bag to fail with an
	 * arithmetic overflow
	 **/
	public void add(Employee a) {
		if (manyEmployees == data.length) {
			ensureCapacity((manyEmployees + 1) * 2);
		}
		data[manyEmployees] = a;
		manyEmployees++;
	}
	
	/**
	 * @param eno Integer corresponding to an Employee instances
	 * employeeNo that searched for and removes that Employee
	 * from the EmployeeSet
	 * @postcondition
	 * If target was in the EmployeeSet, then one copy
	 * of the target has been removed from the
	 * EmployeeSet, and the return value is true; otherwise
	 * the EmployeeSet is unchanged and the return value is 
	 * false
	 * @return
	 * A boolean value that denotes whether eno was removed
	 * from the EmployeeSet or not
	 **/
	public boolean remove(int eno) {
		int index;
		// removing Employee
		for (index = 0; (index < manyEmployees) && (eno != data[index].getEmployeeNo()); index++);
		if (index == manyEmployees) {
			return false;
		}
		else {
			manyEmployees--;
			data[index] = data[manyEmployees];
			return true;
		}
	}
	
	/** 
	 * @param minimumCapacity Integer to set new data size that is needed to
	 * store enough Employee instances
	 * @postcondition
	 * Ensures the EmployeeSet has adequate capacity
	 * by doubling size and copying into new EmployeeSet
	 * for the old to point to it
	 * @exception OutOfMemoryError
	 * Indicates insufficient memory for increasing the EmployeeSet's capacity
	 * @note An attempt to increase the capacity beyond
	 * Integer.MAX_VALUE will cause the bag to fail with an
	 * arithmetic overflow
	 **/
	public void ensureCapacity(int minimumCapacity) {
		Employee evenBiggerData[];
		// expanding EmployeeSet capacity
		if (data.length < minimumCapacity) {
			evenBiggerData = new Employee[minimumCapacity];
			System.arraycopy(data, 0, evenBiggerData, 0, manyEmployees);
			data = evenBiggerData;
		}
	}
	
	/** 
	 * @param eno Integer corresponding to employeeNo of an 
	 * Employee instance in the EmployeeSet
	 * @postcondition
	 * Searches EmployeeSet to find Employee instance with corresponding
	 * employeeNo with input eno
	 * @return
	 * True if found;
	 * otherwise false
	 **/
	public boolean contains(int eno) {
		// checking if the EmployeeSet contians matching employeeNo
		for (int i = 0; i < manyEmployees; i++) {
			if (data[i].getEmployeeNo() == eno) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param index Integer value to select specific
	 * index of array to print
	 * @postcondition Creates String with instance variables
	 * in good format
	 * @return A String containing instance variables in good format
	 */
	public String toString(int index) {
		// creating return statement
		String statement = ("Employee Name: " + data[index].getEmployeeName() + "\nEmployee No: " + data[index].getEmployeeNo() + "\nAge: " + data[index].getEmployeeAge() + "\nState: " + data[index].getEmployeeState() + "\nZip Code: " + data[index].getEmployeeZipCode() + "\nManager: " + data[index].getManager());
		return statement;
	}
	
	/**
	 * @param args Pass in arguments at runtime
	 * @postcondition Tests Employee methods and EmployeeSet methods, with reading 
	 * in Objects from a file and doing manual creation.
	 */
	public static void main(String args[]) {
		
		try {	
			EmployeeSet bigData = new EmployeeSet();
			FileReader in = new FileReader("core_dataset.csv");
			BufferedReader br = new BufferedReader(in);
			String line = br.readLine();
			int index = 0;
			// Employee Information Structure:
			// Employee Name,Employee Number,State,Zip,Age,Manager Name
			// reading file line by line and storing the line into an array
			// contians all the elements of an Employee
			while ((line = br.readLine()) != null) {
				String text[] = line.split(",");
				Employee employee = new Employee();
				bigData.add(employee);
				// reversing the name
				text[0] = text[0].substring(1, text[0].length());
				text[1] = text[1].substring(0, text[1].length() - 1);
				// adding the elements read to the Employee
				bigData.data[index].setEmployeeName(text[1].trim() + " " + text[0]);
				bigData.data[index].setEmployeeNo(Integer.parseInt(text[2]));
				bigData.data[index].setEmployeeState(text[3]);
				bigData.data[index].setEmployeeZipCode(Integer.parseInt(text[4]));
				bigData.data[index].setEmployeeAge(Integer.parseInt(text[5]));
				bigData.data[index].setManager(text[6]);
				// printing out current Employee to check
				// instance variables are correct
				System.out.println(bigData.toString(index) + "\n");
				index++;
			}
			br.close();
		}
		
		catch (FileNotFoundException error) {
				System.out.println("Unable to open file: 'core_dataset.csv'");
		}
		
		catch (IOException error) {
			System.out.println("Error reading file 'core_dataset.csv'");
		} 
		
		// creating a bunch of Employee instances and a EmployeeSet
		Employee Employee1 = new Employee();
		Employee Employee2 = new Employee();
		Employee Employee3 = new Employee();
		Employee Employee4 = new Employee();
		Employee Employee5 = new Employee();
		Employee Employee6 = new Employee();
		EmployeeSet data = new EmployeeSet();
		
		// adding Employees to EmployeeSet
		data.add(Employee1);
		data.add(Employee2);
		data.add(Employee3);
		data.add(Employee4);
		data.add(Employee5);
		data.add(Employee6);
		
		// setting Employee numbers
		Employee1.setEmployeeNo(1);
		Employee2.setEmployeeNo(2);
		Employee3.setEmployeeNo(3);
		Employee4.setEmployeeNo(4);
		Employee5.setEmployeeNo(5);
		Employee6.setEmployeeNo(6);
		
		// testing remove
		System.out.println("data contains 4: " + data.contains(4));
		data.remove(4);
		System.out.println("data contians 4 after remove: " + data.contains(4));
		
		//testing capacity and size
		System.out.println("data capacity: " + data.capacity());
		System.out.println("data size: " + data.size());
		
		// testng copy Constructor and making sure it didn't
		// copy just memory locations
		EmployeeSet moreData = new EmployeeSet(data);
		System.out.println("moreData contians 6: " + moreData.contains(6));
		
		// testing copied EmployeeSet
		data.remove(6);
		moreData.add(Employee4);
		System.out.println("moreData contians 6 after remove on data: " + moreData.contains(6));
		System.out.println("moreData capacity: " + moreData.capacity());
		System.out.println("moreData size: " + moreData.size());
	}
}
