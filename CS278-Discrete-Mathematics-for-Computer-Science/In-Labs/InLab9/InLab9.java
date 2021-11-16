// James Cooper
// CS278 - M1A
// InLab9
// November 2, 2021

public class InLab9 {
    public static long sumRecursive(int k) {
        // error case
        if (k < 1)
            return 0;

        // base case
        if (k == 1)
            return 2;

        // recursive call for sum
        return k * (k + 1) + sumRecursive(k - 1);
    } // end sumRecursive
    

    public static long sumIterative(int k) {
        long sum = 0;
        // calculating the sum
        for (int i = 1; i <= k; i++)
            sum += (i * (i + 1));
        
        return sum;
    } // end sumIterative
    
    public static void main(String args[]) {
        
        // term count
        int k = 1000;

        // calculating recursive sum and time
        long startTime = System.nanoTime();
        long sum = sumRecursive(k);
        long endTime = System.nanoTime();
        
        // results of recursive sum and time
        System.out.printf("Recursive method: %,13d terms\n", k);
        System.out.printf("Time: %,25d nanoseconds\n", endTime - startTime);
        System.out.printf("Summation: %,20d\n", sum);
        
        // calculating iterative sum and time
        startTime = System.nanoTime();
        sum = sumIterative(k);
        endTime = System.nanoTime();
        
        // results of iterative sum and time
        System.out.printf("Iterative method: %,13d terms\n", k);
        System.out.printf("Time: %,25d nanoseconds\n", endTime - startTime);
        System.out.printf("Summation: %,20d\n", sum);
        
    } // end main
} // end class
