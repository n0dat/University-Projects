// James Cooper
// CS22 - M01
// Lab 9
// October 27, 2021

public class RecursiveQuestion {

    public static int convert(String conv) {
        // base cases
        if (conv.length() == 1 && conv.charAt(0) != '-')
            return conv.charAt(0) - '0';
        if (conv.length() == 1 && conv.charAt(0) == '-')
            return 0;

        // checking if input has a '-' at the start, indicating the result should be a negative integer
        if (conv.charAt(0) == '-') {
            return -((conv.charAt(conv.length() - 1) - '0') - 10 * convert(conv.substring(0, conv.length() - 1)));
        }
        else {
            return conv.charAt(conv.length() - 1) - '0' +  10 * convert(conv.substring(0,  conv.length() - 1));
        }
    }
    
    public static int FibBinaryRecursive(int k) {
        // error case
        if (k < 0)
            return 0;
        
        // base case
        if (k == 0 || k == 1)
            return k;

        return FibBinaryRecursive(k - 1) + FibBinaryRecursive(k - 2);
    }

    public static void Hanoi(int n, int start, int target, int spare) {
        // error case
        if (n < 1) {
            System.out.println("Invalid value of n: " + n);
            return;
        }

        // base case
        if (n == 1) {
            System.out.println("d1 from " + start + " to " + target);
            return;
        }
        Hanoi(n - 1, start, spare, target);
        System.out.println("d" + n + " from " + start + " to " + target);
        Hanoi(n - 1, spare, target, start);
    }
    
    // helper method
    // swaps elements of int[] at index a and index b
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    // helper method
    // prints out all elements of input int[]
    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // helper method
    // prints out all elements of input char[]
    public static void printCharArr(char arr[]) {
        for (char i : arr)
            System.out.print(i + " ");
        
        System.out.println();
    }
    
    // prints all permutations of input array and given length
    public static void permutate(int arr[], int length) {
        // base case
        if (length == arr.length) {
            return;
        }
        // recursive case
        if (length < arr.length) {
            for (int i = length; i < arr.length; i++) {
                swap(arr, i, length);
                if (length == arr.length - 1)
                    printArr(arr);
                permutate(arr, length + 1);
                swap(arr, length, i);
            }
        }
    }
   
    // reverses input char[] from index a to index b 
    public static void reverse(char arr[], int a, int b) {
        // base case
        if (a >= b)
            return;

        // swapping elements
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        reverse(arr, a + 1, b - 1);        
    }
    
    // calculates x to the n power with O(logn) complexity
    public static int pow(int x, int n) {
        // case cases
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        
        // recursive step
        if (n % 2 == 0) {
            int k = pow(x, n / 2);  
            return k * k;
        }
        else {
            int k = pow(x, n / 2);
            return x * k * k;
        }
    }

    // testing everything
    public static void main(String args[]) {
        
        // Convert
        System.out.println("Convert:");
        System.out.println("\"1234\" = " + convert("1234"));
        System.out.println("\"0\" = " + convert("0"));
        System.out.println("\"-1337\" = " + convert("-1337"));
        System.out.println("\"102030405\" = " + convert("102030405") + "\n");


        // FibBinaryRecursive
        System.out.println("\nFibBinaryRecursive:");
        System.out.println("9th: " + FibBinaryRecursive(9));
        System.out.println("0th: " + FibBinaryRecursive(0));
        System.out.println("-3rd: " + FibBinaryRecursive(-3));
        System.out.println("18th: " + FibBinaryRecursive(18) + "\n");
        
        
        // towers of hanoi
        System.out.println("\nTowers of Hanoi: \n3 Towers and 3 Discs");
        Hanoi(3, 1, 3, 2);
        System.out.println("\n3 Towers and 4 Discs");
        Hanoi(4, 1, 3, 2);
        System.out.println("\n3 Towers and 1 Disc");
        Hanoi(1, 1, 3, 2);
        System.out.println("\n3 Towers and 0 Discs");
        Hanoi(0, 1, 3, 2);
        System.out.println();
        

        // reverse
        System.out.println("\nReverse:");

        char arr[] = {'A', 'B', 'C', 'D', 'E'};
        
        // printing original array
        printCharArr(arr);
        System.out.println();
        
        // printing out reverse array from index 2 - 4 
        reverse(arr, 2, 4);
        System.out.print("2 - 4: ");
        printCharArr(arr);
        
        // revert
        reverse(arr, 2, 4);
        
        // printing out reverse array from 0 - 4
        System.out.print("0 - 4: ");
        reverse(arr, 0, 4);
        printCharArr(arr);
    
        // revert
        reverse(arr, 0, 4);
        
        // reversing out reverse array from 3 - 3
        System.out.print("3 - 3: ");
        reverse(arr, 3, 3);
        printCharArr(arr);

        // permutation
        System.out.println("\n\nPermutation:");

        // length 1
        int A[] = {19};
        permutate(A, 0);

        System.out.println();

        // length 2
        int B[] = {0, 1};
        permutate(B, 0);
        
        System.out.println();
        
        // length 5
        int C[] = {4, 2, 0, 9, 15};
        permutate(C, 0);
        
        System.out.println();
        
        // this one will take a while
        // length 10
        int D[] = {92, 80, 79, 43, 55, 70, 19, 85, 50, 56};
        permutate(D, 0);
        

        // pow
        System.out.println("\nPow:");
        System.out.print("5 ^ 2: " );
        System.out.println(pow(5, 2));
        System.out.print("3 ^ 3: ");
        System.out.println(pow(3, 3));
        System.out.print("2 ^ 16: ");
        System.out.println(pow(2, 16));
        System.out.print("9 ^ 0: ");
        System.out.println(pow(5,0));
        
    }
}
