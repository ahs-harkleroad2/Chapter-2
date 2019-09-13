/**
 * Alex Harkleroad
 * Energy Drink Consumption
 * Programming III
 * Nining Leven
 */
public class EnergyDrinkConsumption {

    public static void main(String[] args) {
        //Declare variables
        double surveyed = 12467, citrus, perWeek;
        
        //Calculate data
        perWeek = (0.14 * surveyed);
        citrus = (0.64 * surveyed);
        
        //Display values
        System.out.println("The approximate number of customers from the "
                + "survey that purchase one or more energy drinks per week is " 
                + (int) perWeek + ".");
        
        System.out.println("The approximate number of customers from the "
                + "survey that prefer citrus is " + (int) citrus + ".");
    }

}
