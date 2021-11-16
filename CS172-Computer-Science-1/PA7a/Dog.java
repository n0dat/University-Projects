//
// CS172
// Dog.java
// PA7a
// Written by: James Cooper
// November 2nd, 2020
//
public class Dog {

   private String name;
   private int age;

   //constructor
   public Dog(String n, int a) {
      name = n;
      age = a;
   } // end Dog

   // accessor for name
   public String getName() {
      return name;
   } // end getName

   // accessor for age
   public int getAge() {
      return age;
   }
   // mutator for name
   public void setName(String n) {
      name = n;
   } // end setName

   // mutator for age
   public void setAge(int a) {
      age = a;
   } // end setAge

   // calculate the age in person years
   public int personYears() {
      return age * 7;
   } // end personYears

   // the toString method makes printing easy
   public String toString() {
      return "Dog: name = " + name + " age = " + age;
   } // end toString

} // end class
