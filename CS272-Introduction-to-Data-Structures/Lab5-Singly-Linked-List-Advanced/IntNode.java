// James Cooper
// CS272 - M01
// Lab 5
// September 30, 2021

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
		for (IntNode pointer = head; pointer != null; pointer = pointer.link, counter++);
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
	
	public static boolean hasCycle(IntNode head) {
		IntNode current = head;
		for (current = head.link; current != null; current = current.link) {
			//System.out.println(current.data + "  ");
			if (current == head)
				return true;
		}
		return false;
	}
	
	public static void changeElement(IntNode head, int i, int newValue) {
		IntNode current = head;
		for (int n = 0; current != null; current = current.link, n++) {
			if (n == i)
				current.setData(newValue);
		}
	}
	
	public int compareTo(IntNode head) {
		if (this.data < head.data) {
			return head.data;
		}
		return this.data;
	}
	
	public static void segregate_even_odd(IntNode head) {
		int dataArray[] = new int[listLength(head)];
		IntNode current;
		if (head == null) {
			return;
		}
		int index = 0;
		for (current = head; current != null; current = current.link) {
			if (current.data % 2 == 0) {
				dataArray[index++] = current.data;
			}
		}
		for (current = head; current != null; current = current.link) {
			if (current.data %2 != 0) {
				dataArray[index++] = current.data;
			}
		}
		index = 0;
		for (current = head; current != null; current = current.link) {
			current.setData(dataArray[index++]);
			//System.out.println(dataArray[index++]);
		}
	}
	
	public static IntNode reverse(IntNode head) {
		// making a mini list with nodes that point
		// behind and forward
		IntNode behind = null;
		IntNode current = head;
		IntNode next = null;
		// going through list making node ahead equal node behind
		while (current != null) {
			next = current.link;
			current.link = behind;
			behind = current;
			current = next;
		}
		head = behind;
		return head;
	}
	
	// swaps data at index 0 of list with end of list
	public void swap() {
		// inorder to go from the node that called this method
		IntNode current = new IntNode(this.data, this.link);
		int tempData = 0;
		// going to end of list
		for (;current.link != null; current = current.link);
		// swapping end with head
		tempData = this.data;
		this.data = current.data;
		current.data = tempData;
	}
	
	public static IntNode rotate(IntNode head, int k) {
		IntNode current = head;
		
		// if 0 return input IntNode
		if (k == 0)
			return head;
		// getting node all the way up to k
		for (int i = 1; i < k && current != null; current = current.link, i++);
		
		// this is k node
		IntNode tempNode = current;
		
		// getting nodes after k node
		for (; current.link != null; current = current.link);
		
		// store end node into head
		current.link = head;
		// set head to point to k node
		head = tempNode.link;
		// marking end of list
		tempNode.link = null;
		
		return head;
	}
}