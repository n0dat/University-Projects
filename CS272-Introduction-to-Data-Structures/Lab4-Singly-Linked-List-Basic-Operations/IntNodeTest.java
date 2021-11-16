// James Cooper
// CS272 - M01
// Lab 4
// September 20, 2021

// seperate class to test IntNode
public class IntNodeTest {
	public static void main(String args[]) {
	
		System.out.println("First list");
		IntNode head = new IntNode();
		IntNode realTail = new IntNode(34, null);
		IntNode body = new IntNode(51, realTail);
		IntNode secondToLast = IntNode.findMthToLast(head, 0);
		///secondToLast = IntNode.findMthToLast(head, 0);
		head.setData(12);
		head.setNode(body);
		head.addNodeAfterThis(28);
		

		System.out.println("From head: " + head.toString());
		//System.out.println("From two: " + two.toString());
		System.out.println("List length: " + IntNode.listLength(head));
		System.out.println("Searching for 28: " + IntNode.search(head, 51));
		//System.out.println("2nd to last: " + secondToLast.getNode());
		body.removeNodeAfterThis();
		System.out.println("Node after body removal: " + head.toString());
		realTail.addNodeAfterThis(91);
		realTail.getNode().addNodeAfterThis(1);
		System.out.println("List length after 2 node add: " + IntNode.listLength(head));
		System.out.println("Searching for 1: " + IntNode.search(head, 11));
		
		System.out.println("\nSecond list");		
		IntNode twoHead = new IntNode();
		twoHead.addNodeAfterThis(5);
		twoHead.addNodeAfterThis(4);
		twoHead.addNodeAfterThis(3);
		twoHead.addNodeAfterThis(2);
		twoHead.addNodeAfterThis(1);
		System.out.println("From twoHead: " + twoHead.toString());
		System.out.println("List length: " + IntNode.listLength(twoHead));
		System.out.println("Searching for 3: " + IntNode.search(twoHead, 3));
		twoHead.getNode().getNode().removeNodeAfterThis();
		System.out.println("Node after 2 nodes ahead removal: " + twoHead.toString());
		System.out.println("List length: " + IntNode.listLength(twoHead));
		System.out.println("Searching for 3: " + IntNode.search(twoHead, 3));

	}
}