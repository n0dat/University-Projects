// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public class LinkedQueue<T> implements QueueInterface<T>{
    private SNode<T> queueFront;
    private SNode<T> queueRear;
    private int numElements;

    // default constructor
    public LinkedQueue() {
        queueFront = null;
        queueRear = null;
        numElements = 0;
    }

    // removing item from front of queue
    public T dequeue() {
        
        // storing data at front of queue
        T data = queueFront.getData();
        queueFront = queueFront.getLink();
        
        // if queue is now empty, set rear to null
        if (this.isEmpty())
            queueRear = null;
        numElements--;
        // return dequeued data
        return data;
    }
    
    // add item to the end of the queue
    public void enqueue(T t) {
        SNode<T> tempNode = queueRear;
        queueRear = new SNode<T>(t, null);
        
        // checking if queue is empty
        if (this.isEmpty()) 
            queueFront = queueRear;
        // if not add node and set new rear
        else
            tempNode.setLink(queueRear);
        numElements++;
    }
    
    // returns the data at the front of the queue
    public T front() {
        return ((this.isEmpty()) ? null : queueFront.getData());
    }
    
    // returns the size of the queue or how many nodes are in it
    public int size() {
        return numElements;
    }
    
    // checks if there are 0 elements or the front of the queue is equal to null
    public boolean isEmpty() {
        return ((numElements == 0 || queueFront == null) ? true : false);
    }
}
