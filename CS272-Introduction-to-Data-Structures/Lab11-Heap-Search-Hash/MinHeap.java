// James Cooper
// CS272 - M01
// Lab11
// November 15, 2021

import java.util.Arrays;
import java.util.ArrayList;

public class MinHeap {

	// instance variable
	private ArrayList<Integer> heap;
	
	// constructor
	public MinHeap() {
		heap = new ArrayList<Integer>();
	}

	// returns heap as an Integer ArrayList
	public ArrayList<Integer> getHeap() {
		return heap;
	}

	// return true of heap is empty, otherwise return false
	public boolean isEmpty() {
		return heap.isEmpty();
	}

	// returns index of input parent value
	// pValue is parent data value
	public int parentPos(int pValue) {
		return heap.indexOf(pValue);
	}

	// returns parent data of input data
	// value is data of child element
	public int parent(int value) {
		return heap.get((heap.indexOf(value) - 1) / 2);
	}

	// returns position / index  of input value
	// value is data element
	public int pos(int value) {
		return heap.indexOf(value);
	}

	// moves node upwards so its in right spot
	// value is data to be moved
	public void reheapUpward(int value) {
		
		// base case
		if (value <= 0)
			return;
			
		// variables to keep track of who is who and where values are
		int par = parent(value);
		int pPos = parentPos(par);
		int pos = pos(value);
		
		// recursive case
		if (heap.get(pPos) < heap.get(pos)) {
		
			// swappage
			int a = heap.get(pPos);
			heap.set(pPos, heap.get(pos));
			heap.set(pos, a);
			
			// recursive call
			reheapUpward(pos);
		}
	}
	
	// moves node downards so its in right spot
	// value is data to be moved
	public void reheapDownward(int value) {
		
		// base case
		if (value <= 0)
			return;
			
		// variables to keep track of who is who and where values are
		int par = parent(value);
		int pPos = parentPos(par);
		int pos = pos(value);
		
		// recursive case
		if (heap.get(pos) > heap.get(pPos)) {
			
			// swappage
			int a = heap.get(pos);
			heap.set(pPos, a);
			heap.set(pos, heap.get(pPos));
			
			// recursive call
			reheapDownward(pPos);
		}
	}
	
	// adds e to heap and moves it to right spot
	public void add(int e) {
		heap.add(e);
		reheapUpward(e);
	}
	
	// removes rear of heap
	// returns value that was removed
	public int remove() {
		
		// making sure heap is not empty
		if (isEmpty())
			return -1;
		
		// removing front and moving rear to front
		int end = heap.get(heap.size() - 1);
		heap.set(0, heap.size() - 1);
		heap.remove(heap.size() - 1);
		reheapDownward(0);
		
		return end;
	}
	// returns top of heap
	public int top() {
		
		// making sure heap is not empty
		if (isEmpty())
			return -1;
			
		return heap.get(0);
	}
	
	// time complexity of this is O(n logn) where n is the size of the heap
	// returns an Integer ArrayList containing k values near the target
	// A is ArrayList to be searched
	// k is how far from target to search
	// target is the home
	public static ArrayList<Integer> findKNearest(ArrayList<Integer> A, int k, int target) {
	
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int arr[] = new int[A.size()];
		
		// coping elements of A to arr to utilize binarySearch
		for (int i = 0; i < A.size(); i++)
			arr[i] = A.get(i);
			
		// sorting arr
		Arrays.sort(arr);
		
		// inclusive search from target - k to target + k
		// storing value into return ArrayList if found
		for (int i = target - k; i <= target + k; i++) {
			if (search.binarySearch(arr, i) > -1)
				ret.add(i);
		}
		
		return ret;
	}
}
