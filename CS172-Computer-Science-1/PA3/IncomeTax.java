//
// CS 172
// IncomeTax.java
// PA3
// Written by: James Cooper
// September 14th, 2020
// Calculate income tax based off of input from user as annual salary
//
import java.util.Scanner;

public class IncomeTax {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      double annualSalary = 0;
      double taxRate = 0.0;
      double taxToPay = 0;
      
      System.out.println("Enter annual salary: ");
      annualSalary = scan.nextInt();
      // if salary is less or equal to 0
      if (annualSalary <= 0) {
      // output error message
         System.out.println("Error, annual salary cannot be less than or equal to zero.");
      }
      else {
         // Determine the tax rate from the annual salary
         if (annualSalary <= 20000) {
               taxRate = 0.10;
         }
         else if (annualSalary <= 50000) {
            taxRate = 0.20;
         }
         else if (annualSalary <= 100000) {
            taxRate = 0.30;
         }
         else {
            taxRate = 0.40;
         }
         
         // Truncate tax to an integer amount
         taxToPay = annualSalary * taxRate;
         System.out.printf("Annual Salary: $%,8d\n", (int) annualSalary);
         System.out.printf("Tax rate:      %8d%%\n", (int) (taxRate * 100));
         System.out.printf("Tax to pay:    $%,8d\n", (int) taxToPay); 
      }
      
   } // end main
} // end class