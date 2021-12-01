// James Cooper
// CS272 - M01
// Lab11
// November 26, 2021

public class search {

	// O(log n) runtime worst case
	// returns index of e if found in arr[]
	// otherwise return -1
	public static int binarySearch(int arr[], int e) {
	
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
		
			int mid = low + (high - low) / 2;
			
			if (arr[mid] == e)
				return mid;
				
			if (arr[mid] < e)
				low = mid + 1;
			
			else
				high = mid - 1;
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
	
		int arr[] = {1, 2, 3, 4};
		
		// testing
		System.out.println("1, 2, 3, 4");
		System.out.println(binarySearch(arr, 2));
		System.out.println(binarySearch(arr, 0));
		System.out.println(binarySearch(arr, 5));
	}
}
