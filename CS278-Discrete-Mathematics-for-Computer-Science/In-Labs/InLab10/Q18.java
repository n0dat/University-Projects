// James Cooper
// CS278 - M01
// InLab10
// November 9, 2021

public class Q18 {

    public static String sequenceType(int arr[]) {

        // 2 counters
        int inc = 0;
        int dec = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                inc++;
                
            if (arr[i - 1] > arr[i])
                dec++;
        } // end for
        
        // checking for the type of sequence
        // given the counter values
        if (inc == arr.length - 1)
            return "Increasing";
        else if (dec == arr.length - 1)
            return "Decreasing";
        else if (inc == 0)
            return "Non-increasing";
        else if (dec == 0)
            return "Non-decreasing";
        else
            return "None";
    } // end sequenceType
    
    public static void main(String args[]) {

        // 5 arrays to test the method
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int arr3[] = {1,2,2,3,3,4,4,5,5,6};
        int arr4[] = {-1,-2,-2,-3,-3,-4,-4,-5,-5,-6};
        int arr5[] = {1,3,2,4,6,5,8,7,9};
        
        // testing the method with the 5 arrays and printing array elements
        
        // increasing arr
        for (int i : arr1)
            System.out.print(i + "  ");
        System.out.println("\n" + sequenceType(arr1) + "\n");

        // decreasing arr
        for (int i : arr2)
            System.out.print(i + "  ");
        System.out.println("\n" + sequenceType(arr2) + "\n");

        // Non-decreasing arr
        for (int i : arr3)
            System.out.print(i + "  ");
        System.out.println("\n" + sequenceType(arr3) + "\n");

        // Non-increasing arr
        for (int i : arr4)
            System.out.print(i + "  ");
        System.out.println("\n" + sequenceType(arr4) + "\n");

        // None arr
        for (int i : arr5)
            System.out.print(i + "  ");
        System.out.println("\n" + sequenceType(arr5));
        
    } // end main
    
} // end class
