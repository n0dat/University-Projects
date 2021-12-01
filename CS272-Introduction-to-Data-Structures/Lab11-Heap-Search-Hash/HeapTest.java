// James Cooper
// CS272 - M01
// Lab11
// November 29, 2021

import java.util.*;

// class to test MinHeap
public class HeapTest {
    
    // prints out heap neatly
    private static void printArr(ArrayList<Integer> arr) {
    
        if (arr.isEmpty())
            return;
            
        System.out.print("[");
        
        for (int i = 0; i < arr.size() - 1; i++)
            System.out.print(arr.get(i) + ", ");
            
        System.out.println(arr.get(arr.size() - 1) + "]");
    }
    
	public static void main(String args[]) {
        
        // create new heap
		MinHeap big = new MinHeap();
        
        // testing isEmpty() top() remove()
        System.out.println("empty: " + big.isEmpty());
        System.out.println("remove: " + big.remove());
        System.out.println("top: " + big.top());
        
        // adding to heap
		big.add(1);
		big.add(2);
		big.add(3);
		big.add(4);
		big.add(5);
		big.add(6);
		big.add(7);
        System.out.println("add: 1, 2, 3, 4, 5, 6, 7");
        
        // printing heap
        printArr(big.getHeap());
        
        // testing isEmpty() top() remove()
        System.out.println("empty: " + big.isEmpty());
        System.out.println("top: " + big.top());
        System.out.println("remove: " + big.remove());
        System.out.println("remove: " + big.remove());
        System.out.println("top: " + big.top());
        
        // printing heap
        printArr(big.getHeap());
        
        // adding duplicate to heap and printing
        big.add(5);
        System.out.println("add: 5");
        printArr(big.getHeap());

        // testing findKNearest which find the kth nearest nodes to target        
        ArrayList<Integer> temp = new ArrayList<Integer>();

        temp = big.findKNearest(big.getHeap(), 2, 6);
        System.out.print("k = 2  target = 6 : ");
        printArr(temp);

        temp = big.findKNearest(big.getHeap(), 2, 2);
        System.out.print("k = 2  target = 2 : ");
        printArr(temp);

        temp = big.findKNearest(big.getHeap(), 1, 3);
        System.out.print("k = 1  target = 3 : ");
        printArr(temp);
        
        temp = big.findKNearest(big.getHeap(), 2, 9);
        System.out.print("k = 2  target = 9 : ");
        printArr(temp);
	}
}
