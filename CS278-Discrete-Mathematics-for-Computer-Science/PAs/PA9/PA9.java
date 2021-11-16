// James Cooper
// CS278 - M01
// PA 9
// November 6, 2021

public class PA9 {
    
    // returns greatest common divisor between 2 input integers
    public static int gcd(int num1, int num2) {
        
        // base case
        if (num2 == 0)
            return num1;
        
        // recursive step / call
        return gcd(num2, num1 % num2);
        
    } // end gcd
    
    // prints out all factors of input integer
    public static void factors(int number, int possibleFactor) {
        
        // error case
        if (number < 1) {
            System.out.println("Number is not positive.");
            return;
        } // end if

        // base case
        if (possibleFactor == 1) {
            System.out.print(possibleFactor);
            return;
        } // end if

        // recursive steps
        factors(number, possibleFactor - 1);
        if (number % possibleFactor == 0)
            System.out.print(", " + possibleFactor);
        
        // recursive call
        //factors(number, possibleFactor - 1);
        
    } // end factors
    
    // prints out all lowercase characters in input string on one line
    public static void lowercase(String sentence) {
        
        // base case
        if (sentence.length() < 1) {
            System.out.println();
            return;
        } // end if
        
        // recursive steps
        if (Character.isLowerCase(sentence.charAt(0)))
            System.out.print(sentence.charAt(0));

        // recursive call
        lowercase(sentence.substring(1, sentence.length()));

    } // end lowercase
    
    public static void main(String args[]) {
        

        System.out.println("lowercase():\n");
        
        System.out.println("Lowercase characters of \"tEsTiNg\"");
        lowercase("tEsTiNg");
        System.out.println("Lowercase letters of \"one two THREE four FIVE 6!\"");
        lowercase("one two THREE four FIVE 6!");
        System.out.println("\"12342  4213 52134 f ASDk!@#$ p\"");
        lowercase("12342  4213 52134 f ASDk!@#$ p");
        System.out.println("Lowercase letters of \" \"");
        lowercase(" ");
        

        System.out.println("\ngcd():\n");

        System.out.println("GCD of 57 and 19\n" + gcd(57, 19));
        System.out.println("GCD of 0 and 23\n" + gcd(0, 23));
        System.out.println("GCD of 7 and 2\n" + gcd(7, 2));
        System.out.println("GCD of -5 and 25\n" + gcd(-5, 25));
        

        System.out.println("\nfactors():\n");
        
        System.out.println("Factors of 12");
        factors(12, 12);
        
        System.out.println("\nFactors of 9");
        factors(9, 9);

        System.out.println("\nFactors of 13");
        factors(13, 13);

        System.out.println("\nFactors of 0");
        factors(0, 0);
    } // end main
} // end class
