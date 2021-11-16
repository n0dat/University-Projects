// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public class LinkStack<T> implements StackInterface<T>{
    private SNode<T> node;
    
    // default constructor
    public LinkStack() {
        node = new SNode<T>();
    }
    
    // popping or removing the top of the stack
    public T pop() {
        if (this.isEmpty() || node == null)
            return null;
        
        SNode<T> tempNode = node;
        
        // going to the end of the list except 2 behind
        while (tempNode.getLink().getLink() != null) {
            tempNode = tempNode.getLink();
        }
        
        // removing final node
        tempNode.setLink(null);
        
        // returning data in node that was removed
        return tempNode.getData();
    }
    
    // push or adding to top of stack
    public void push(T t) {
        SNode<T> nodeToAdd = new SNode<T> (t, null);
        SNode<T> tempNode = node;
        
        // getting to the end of the list or top of the stack
        for (; tempNode.getLink() != null; tempNode = tempNode.getLink());
        
        // adding to stop of stack
        tempNode.setLink(nodeToAdd);
    }
    
    public T top() {
        SNode<T> tempNode = node;
        // getting to the end of the list or top of the stack
        for (; tempNode.getLink() != null; tempNode = tempNode.getLink());
        
        // returning data in node at top of the stack
        return tempNode.getData();
    }

    // returns the size of the stack or how many nodes there are
    public int size() {
        int stackSize = -1;
        
        // counting the nodes in the last up until the end
        for (SNode<T> tempNode = node; tempNode != null; tempNode = tempNode.getLink())
            stackSize++;
        return stackSize;
    }
    
    // checking if the stack is empty, true if it is, else false
    public boolean isEmpty() {
        // if the current node is equal to null 
        if (node.getLink() == null) {
            return true;
        }
        return false;
    }
    
}
