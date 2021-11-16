// James Cooper
// CS272 - M01
// Lab 7
// October 11, 2021

public class DoublyLinkedListDummy {

	// dummy nodes
	DIntNode dummyHead;
	DIntNode dummyTail;
	
	// default constructor
	public DoublyLinkedListDummy() {
		dummyHead = new DIntNode();
		dummyTail = new DIntNode();
		dummyHead.setNext(dummyTail);
		dummyTail.setPrev(dummyHead);
	}
	
	// getter for head
	public DIntNode getHead() {
		return this.dummyHead;
	}
	
	// getter for tail
	public DIntNode getTail() {
		return this.dummyTail;
	}
	
	// setter for head
	public void setHead(DIntNode node) {
		DIntNode temp = this.dummyHead.getNext();
		temp.setPrev(node);
		node.setNext(temp);
	}
	
	// setter for tail
	public void setTail(DIntNode node) {
		DIntNode temp = this.dummyTail.getPrev();
		temp.setNext(node);
		node.setPrev(temp);
	}
	
	// add an element to end of the list
	// this will take 5 operations or O(5)
	public void addEnd(int element) {
		DIntNode current = dummyTail.getPrev();
		DIntNode newNode = new DIntNode(element, current, dummyTail);
		current.setNext(newNode);
		dummyTail.setPrev(newNode);
	}
	
	// remove actual head from the list
	// this will take 5 oeprations or O(5)
	public void removeFromHead() {
		DIntNode head = dummyHead.getNext();
		dummyHead.setNext(head.getNext());
		dummyHead.getNext().setPrev(dummyHead);
	}
	
	// toString to return string that contains the data in each of the
	// nodes in a neat way
	public String toString() {
		DIntNode head = this.dummyHead.getNext();
		DIntNode tail = this.dummyTail.getPrev();
		if (head == null || head == this.dummyTail) {
			return "empty list";
		}
		String returnString = "(Forward) " + head.getData();
		head = head.getNext();
		// storing node data from head to tail
		for (;head != this.dummyTail; head = head.getNext()) {
			returnString += "<->" + head.getData();
		}
		head = this.dummyHead.getNext();
		returnString += "\n(Backward) " + tail.getData();
		tail = tail.getPrev();
		// storing node data from tail to head
		for (; tail != this.dummyHead; tail = tail.getPrev()) {
			returnString += "<->" + tail.getData();
		}
		return returnString;
	}
	
	// count occurrences of how many times e appears in the nodes
	// time complexity of this is n = how long list is
	// therefore O(n) worst case
	public int countOccurrence(int e) {
		int occurs = 0;
		for (DIntNode head = dummyHead.getNext(); head != dummyTail.getPrev(); head = head.getNext()) {
			if (head.getData() == e)
				occurs++;
		}
		return occurs;
	}
	// remove all
	// removes nodes from list that contian data matching input, e
	// n = length of list therefore O(n)
	public boolean removeAll(int e) {
		
		DIntNode prev;
		DIntNode current = this.dummyHead.getNext();
		int removed = 0;
		
		// go through each node checking data
		// if data match input, e, remove node
		while (current != this.dummyTail) {
			if (current.getData() == e) {
				prev = current.getPrev();
				current = current.getNext();
				prev.setNext(current);
				current.setPrev(prev);
				// this is needed incase the node after skip
				// contians the data e
				// if not it will skip this going to next node
				current = current.getPrev();
				removed++;
			}
			current = current.getNext();
		}
		
		if (removed > 0) {
			return true;
		}
		return false;
	}
	
	// truncate
	// will return list that contains nodes up to the index of (i - 1)
	// n is length of list therefore O(n)
	public DoublyLinkedListDummy truncate(int i) {
		// making sure that is no less than 0
		if (i <= 0) {
			System.out.println("i less than or equal to 0, stopping");
			return null;
		}
		DIntNode current = this.dummyHead.getNext();
		int index = 0;
		// counting up to i and storing that last current node
		for (; index < i - 1 && current != this.dummyTail.getPrev(); index++) {
			current = current.getNext();
		}
		// setting next to dummy tail
		current.setNext(this.dummyTail);
		this.dummyTail.setPrev(current);
		return this;
	}
	
	// absorb
	// will add input list from head to tail
	// to list that called method
	// n is length fo list therefore O(n)
	public void absorb(DoublyLinkedListDummy add) {
		DIntNode current = add.getHead().getNext();
		for (; current != add.getTail(); current = current.getNext()) {
			this.addEnd(current.getData());
		}
		add.dummyHead.setNext(add.dummyTail);
		add.dummyTail.setPrev(add.dummyHead);
	}
	
	// main to test methods in DoublyLinkedListDummy
	public static void main(String args[]) {
		
		// test 1 to test
		DoublyLinkedListDummy test1 = new DoublyLinkedListDummy();
		test1.addEnd(12);
		test1.addEnd(28);
		test1.addEnd(12);
		test1.addEnd(34);
		System.out.println("test1: \n" + test1.toString() + "\n");
		System.out.println("occurrences (5): " + test1.countOccurrence(5) + "\n");
		test1.removeFromHead();
		System.out.println("test1 post head removal: \n" + test1.toString() + "\n");
		
		// list 2 to test
		DoublyLinkedListDummy test2 = new DoublyLinkedListDummy();
		test2.addEnd(1);
		test2.addEnd(3);
		test2.addEnd(7);
		test2.addEnd(1);
		System.out.println("test2: \n" + test2.toString() + "\n");
		System.out.println("occurrences (1): " + test2.countOccurrence(1) + "\n");
		test1.absorb(test2);
		System.out.println("test1 post absorb (test2): \n" + test1.toString() + "\n");
		System.out.println("test2 post absorb: \n" + test2.toString() + "\n");
		
		// list 3 to test
		DoublyLinkedListDummy test3 = new DoublyLinkedListDummy();
		test3.addEnd(4);
		test3.addEnd(2);
		test3.addEnd(4);
		test3.addEnd(1);
		System.out.println("test3 pre remove (4): \n" + test3.toString() + "\n");
		test3.removeAll(4);
		System.out.println("test3 post remove (4): \n" + test3.toString() + "\n");
		System.out.println("test1 pre truncate (4): \n" + test1.toString() + "\n");
		test1.truncate(4);
		System.out.println("test1 truncate at (4)");
		System.out.println(test1.toString() + "\n");
		
		// list 4 to test
		DoublyLinkedListDummy test4 = new DoublyLinkedListDummy();
		test4.addEnd(9);
		test4.addEnd(9);
		test4.addEnd(1);
		test4.addEnd(7);
		test4.addEnd(9);
		System.out.println("test4: \n" + test4.toString() + "\n");
		test2.absorb(test4);
		System.out.println("test2 post absorb (test4): \n" + test2.toString() + "\n");
		System.out.println("test4 post absorb: \n" + test4.toString() + "\n");
		test2.removeAll(9);
		System.out.println("test2 post remove all (9): \n" + test2.toString() + "\n");
		
		// :)
	}
		
}