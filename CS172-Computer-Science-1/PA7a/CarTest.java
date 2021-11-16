//
// CS172
// CarTest.java
// PA7a
// Written by: James Cooper
// November 2nd, 2020
//
public class CarTest {

   public static void main(String[] args) {

	   // instantiate and modify several Car objects
      Car car1 = new Car("Toyota", "4runner", 1995);
      Car car2 = new Car("Honda", "Civic", 2005);
      Car car3 = new Car("Chevrolet", "Silverado", 2015);

      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);

      // test mutators for the 3 instances
      car1.setMake("Volkswagen");
      car2.setModel("944 Turbo");
      car3.setYear(2147);

      // printing out the modified instances
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);

      // test accessors
      System.out.println("A " + car1.getMake() + " " + car2.getModel() + " is a " + car3.getYear() + " model year.");

   } // end main
} // end class
