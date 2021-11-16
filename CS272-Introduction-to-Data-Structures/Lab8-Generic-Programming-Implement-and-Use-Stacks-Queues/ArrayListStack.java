// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

import java.util.ArrayList;

public class ArrayListStack<E> implements StackInterface<E> {
    private ArrayList<E> arrayList;
    
    // default constructor
    public ArrayListStack() {
        arrayList = new ArrayList<E>();
    }
    
    // popping or removing item from the top of the stack
    public E pop() {
        
        // making sure the stack is not empty
        if (this.isEmpty() || this.size() - 1 < 0)
            return null;
        // storing popped data
        E data = arrayList.get(arrayList.size() - 1);
        
        // removing that item from the stack
        arrayList.remove(arrayList.size() - 1);
        return data;
    }
    
    // push or add item to the top of the stack
    public void push(E t) {
        arrayList.add(t);
    }
    
    // return item that is at the top of the stack
    public E top() {
        
        // if the stack is empty return null else return item
        if (this.isEmpty() || this.size() - 1 < 0)
            return null;
        return arrayList.get(arrayList.size() - 1);
    }
    
    // return the size of the stack or how many items are in it
    public int size() {
        return arrayList.size();
    }
    
    // return whether or not the stack is empty
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
        
}
