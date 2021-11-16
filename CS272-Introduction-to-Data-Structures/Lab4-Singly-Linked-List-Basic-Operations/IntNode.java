// James Cooper
// CS272 - M01
// Lab 4
// September 20, 2021

public class IntNode {
	
	// instance variables
	private int data;
	private IntNode link;
	
	// default constructor
	public IntNode() {
		data = 0;
		link = null;
	}
	
	// constructor to set instance variables
	// to given input
	public IntNode(int _data, IntNode _node) {
		data = _data;
		link = _node;
	}
	
	// get data method
	public int getData() {
		return this.data;
	}
	
	// get node method
	public IntNode getNode() {
		return this.link;
	}
	
	// set data method
	public void setData(int in) {
		this.data = in;
	}
	
	// set node method
	public void setNode(IntNode _node) {
		this.link = _node;
	}
	
	// toString output method
	public String toString() {
		IntNode pointer = new IntNode(data, link);
		String output = "" + data;
		pointer = pointer.link;
		for (;pointer != null; pointer = pointer.link) {
			output += "->" + pointer.getData();
		}
		return output;
	}
	
	// adds input node after current node
	public void addNodeAfterThis(int newData) {
		// adding node in, which points to what link was
		// pointing to and link points to new node
		link = new IntNode(newData, link);
	}
	
	// removes node after current node
	public void removeNodeAfterThis() {
		this.link = link.link;
	}
	
	// returns length of list
	public static int listLength(IntNode head) {
		int counter = 0;
		// going through every node and counting the nodes
		for (IntNode pointer = head; pointer != null; pointer = pointer.link) {
			counter++;
		}
		return counter;
	}
	
	// returns true if data exists starting at head,
	// returns false otherwise
	// precondition is that head is not NULL
	public static boolean search(IntNode head, int data) {
		// going through every node to find data at specific node
		for (IntNode pointer = head; pointer != null; pointer = pointer.link) {
			if (pointer.data == data) return true;
		}
		return false;
	}
	
	// finds Mth-to-last element of the list
	public static IntNode findMthToLast(IntNode head, int m) {
		IntNode current, mBehind;
		current = head;
		// setting the current link to be m ahead
		for (int i = 0; i < m; i++) {
			if (current.link != null) {
				current = current.link;
			}
			else {
				// if current is last in list
				return null;
			}
		}
		
		mBehind = head;
		// running the behind link to be m behind
		// the current link
		while (current.link != null) {
			current = current.link;
			mBehind = mBehind.link;
		}
		return mBehind;	
	}
}