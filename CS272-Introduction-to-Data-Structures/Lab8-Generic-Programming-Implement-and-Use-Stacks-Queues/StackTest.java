// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public class StackTest {
    public static void main(String args[]) {
        
        // testing array list stack
        System.out.println("ArrayListStack:");
        ArrayListStack<Integer> arrayList = new ArrayListStack<Integer>();
        arrayList.push(10);
        arrayList.push(20);
        arrayList.push(30);
        System.out.println(arrayList.size());
        System.out.println(arrayList.top());
        arrayList.pop();
        System.out.println(arrayList.size());
        System.out.println(arrayList.top());
        arrayList.pop();
        System.out.println(arrayList.size());
        System.out.println(arrayList.top());
        arrayList.pop();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        // testing link stack
        System.out.println("\nLinkStack:");
        LinkStack<Integer> ls = new LinkStack<Integer>();
        System.out.println(ls.size());
        ls.push(10);
        ls.push(20);
        ls.push(30);
        System.out.println(ls.isEmpty());
        System.out.println(ls.size());
        System.out.println(ls.top());
        ls.pop();
        System.out.println(ls.size());
        System.out.println(ls.pop());
        System.out.println(ls.size());
        System.out.println(ls.pop());
        System.out.println(ls.size());
        
    }
}
