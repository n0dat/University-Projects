// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public interface QueueInterface<E> {

    // interface methods
    public E dequeue();
    
    public void enqueue(E e);
    
    public E front();
    
    public int size();
    
    public boolean isEmpty();

}
