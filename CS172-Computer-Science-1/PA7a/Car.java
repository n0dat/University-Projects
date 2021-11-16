//
// CS172
// Car.java
// PA7a
// Written by: James Cooper
// November 2nd, 2020
//
public class Car {

   private String make;
   private String model;
   private int year;

   // constructor
   public Car(String a, String b, int c) {
      make = a;
      model = b;
      year = c;
      a = "Ford";
      b = "Escape";
      c = 2019;
   } // end Car

   // accessor for make
   public String getMake() {
      return make;
   }

   // accessor for model
   public String getModel() {
      return model;
   }

   // accessor for year
   public int getYear() {
      return year;
   }

   // mutator for make
   public void setMake(String a) {
         make = a;
   } // end setMake

   // mutator for model
   public void setModel(String b) {
      model = b;
   } // end setModel

   // mutator for year
   public void setYear(int c) {
      year = c;
   } // end setYear

   // the toString method makes a one-line description of the Car
   public String toString() {
      return "Car: make = " + make + ", model = " + model + ", year = " + year;
   } // end toString

} // end class
