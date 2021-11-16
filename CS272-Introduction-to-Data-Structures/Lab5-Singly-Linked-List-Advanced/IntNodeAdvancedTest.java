// James Cooper
// CS272 - M01
// Lab 5
// October 2, 2021

public class IntNodeAdvancedTest {

	public static void main(String args[]) {
	
		// creating list
		IntNode head = new IntNode(11, null);
		head.addNodeAfterThis(60);
		head.addNodeAfterThis(55);
		head.addNodeAfterThis(40);
		head.addNodeAfterThis(33);
		head.addNodeAfterThis(20);
		// base list
		System.out.println("standard: " + head.toString());
		// testing rotate
		head = IntNode.rotate(head, 4);
		System.out.println("rotate 4: " + head.toString());
		head = IntNode.rotate(head, 2);
		System.out.println("rotate 2: " + head.toString());
		head = IntNode.rotate(head, 0);
		System.out.println("rotate 0: " + head.toString());
		head = IntNode.rotate(head, IntNode.listLength(head));
		System.out.println("rotate " + IntNode.listLength(head) + ": " + head.toString());
		// testing swap
		head.swap();
		System.out.println("swap: " + head.toString());
		head.swap();
		// testing reverse
		head = IntNode.reverse(head);
		System.out.println("reverse: " + head.toString());
		head = IntNode.reverse(head.getNode().getNode());
		System.out.println("reverse 2 ahead: " + head.toString());
		// testing segregate
		IntNode.segregate_even_odd(head);
		System.out.println("segregate: " + head.toString());
		// testing is cyclic
		System.out.println("is cyclic: " + IntNode.hasCycle(head));
		// testing swap
		head.getNode().swap();
		System.out.println("swap 1 ahead: " + head.toString());
		// testing changeElement
		IntNode.changeElement(head, 2, 51);
		System.out.println("change index 2 to 51: " + head.toString());
		// making list circular and testing cycylic
		head.getNode().getNode().getNode().setNode(head);
		System.out.println("is cyclic: " + IntNode.hasCycle(head));
		// undoing circle
		head.getNode().getNode().getNode().setNode(null);
		System.out.println("is cyclic: " + IntNode.hasCycle(head));
		// testing segregate
		IntNode.segregate_even_odd(head);
		System.out.println("segregate: " + head.toString());
		// testing changeElement
		IntNode.changeElement(head, 0, 0);
		System.out.println("change index 0 to 0: " + head.toString());
		
	}
}