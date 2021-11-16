//
// CS172
// SolarPanelTest.java
// PA7b
// Written by: James Cooper
//
public class SolarPanelTest {

   public static void main(String[] args) {

      // creating instance of SolarPanel
      SolarPanel panelOne = new SolarPanel();

      // utilizing mutator methods from SolarPanel class
      panelOne.setOpenVoltage(20.0);
      panelOne.setNominalVoltage(12);
      panelOne.setCellType("Mono-crystalline");

      System.out.println("Output for panelOne:\n");
      // printing set values from panelOne object that will automatically call toString method
      System.out.println(panelOne + "\n");

      // utilizing the mutator method setOpenVoltage from SolarPanel class
      panelOne.setOpenVoltage(150.0);
      // printing new value of openCircuitVoltage for panelOne
      System.out.println("New Voc = " + panelOne.getOpenVoltage() + " V");
      // utilizing the mutator method setNominalVoltage from SolarPanel class
      panelOne.setNominalVoltage(-10);
      //printing new value of nominalVoltage for panelOne
      System.out.println("New Nom = " + panelOne.getNominalVoltage() + " V\n");

      // creating a second instance of SolarPanel
      SolarPanel panelTwo = new SolarPanel(40.0, 24, "Mono-crystalline");

      System.out.println("Output for panelTwo:\n");
      // utilizing accessor methods from SolarPanel class
      System.out.println("Voc = " + panelTwo.getOpenVoltage() + " V");
      System.out.println("Nom = " + panelTwo.getNominalVoltage() + " V");
      System.out.println("cellType = " + panelTwo.getCellType() + "\n");

      // uzilizing accessor and mutator methods from SolarPanel class
      panelTwo.setOpenVoltage(0);
      System.out.println("New Voc = " + panelTwo.getOpenVoltage() + " V");
      panelTwo.setCellType("Vinyl Polymer");
      System.out.println("New cellType = " + panelTwo.getCellType() + "\n");

      // final prinout of panelTwo object to test everything worked
      System.out.println(panelTwo);


   } // end main
} // end class
