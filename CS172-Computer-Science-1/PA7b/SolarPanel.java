//
// CS172
// SolarPanel.java
// PA7b
// Written by: James Cooper
//
public class SolarPanel {

   // declaring variable to be used locally in the class
   private double openCircuitVoltage;
   private int nominalVoltage;
   private String cellType;

   // method for data validation on openCircuitVoltage variable
   private void checkOpenVoltage(double voltage1) {
      if (voltage1 >= 0.0 && voltage1 <= 100.0) {
         openCircuitVoltage = voltage1;
      } // end if
      else {
         openCircuitVoltage = 40.0;
      } // end else
   } // end checkOpenVoltage

   // method for data validation on nominalVoltage variable
   private void checkNominalVoltage(int voltage2) {
      if (voltage2 == 12 || voltage2 == 24) {
         nominalVoltage = voltage2;
      } // end if
      else {
         nominalVoltage = 12;
      } // end else
   } // end checkNominalVoltage

   // method for data validation on cellType variable
   private void checkCellType(String type) {
      if (cellType == "Mono-crystalline" || cellType == "Poly-crystalline") {
         cellType = type;
      } // end if
      else {
         cellType = "Mono-crystalline";
      } // end else
   } // end checkCellType

   // constructor method for instancing with no input parameters
   public SolarPanel() {
      // assigns variables with default values determined by the constructor
      openCircuitVoltage = 40.0;
      nominalVoltage = 12;
      cellType = "Mono-crystalline";
   } // end SolarPanel

   // method to return openCircuitVoltage variable
   public double getOpenVoltage() {
      return openCircuitVoltage;
   } // end getOpenVoltage

   // method to return nominalVoltage variable
   public int getNominalVoltage() {
      return nominalVoltage;
   } // end getNominalVoltage

   // method to return cellType variable
   public String getCellType() {
      return cellType;
   } // end getCellType

   // mutator method to assing new openCircuitVoltage with input parameter after passing data validation
   public void setOpenVoltage(double inputOpenVoltage) {
      checkOpenVoltage(inputOpenVoltage);
   } // end setOpenVoltage

   // mutator method to assign new nominalVoltage with input parameter after passing data validation
   public void setNominalVoltage(int inputNominalVoltage) {
      checkNominalVoltage(inputNominalVoltage);
   } // end setNominalVoltage

   // mutator method to assign new value to cellType after passing data validation
   public void setCellType(String inputCellType) {
      checkCellType(inputCellType);
   } // end setCellType

   // constructor method for instancing with input parameters
   public SolarPanel(double a2, int b2, String c2) {
      checkOpenVoltage(a2);
      checkNominalVoltage(b2);
      checkCellType(c2);
   } // end SolarPanel

   // toString method to give an easy print out of the private variables values in the class
   public String toString() {
      return "Solar Panel: Voc = " + openCircuitVoltage + " V Nom = " + nominalVoltage + " V cellType = " + cellType;
   } // end toString

} // end class
