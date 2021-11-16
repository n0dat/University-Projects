// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public class SNode<T> {
    private T data;
    private SNode<T> link;
    
    // default constructor
    public SNode() {
        data = null;
        link = null;
    }
    
    // constructor with parameters to set instance variables
    public SNode(T _data, SNode<T> _link) {
        this.data = _data;
        this.link = _link;
    }
    
    // data accessor
    public T getData() {
        return this.data;
    }
    
    // data mutator
    public void setData(T _data) {
        this.data = _data;
    }
    
    // link accessor
    public SNode<T> getLink() {
        return this.link;
    }

    // link mutator
    public void setLink(SNode<T> _link) {
        this.link = _link;
    }
}
