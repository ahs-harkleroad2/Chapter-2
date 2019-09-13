/**
 * Alex Harkleroad
 * Sales Tax
 * Programming III
 * 9/10/19
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesTax {

    public static void main(String[] args) {
        
        //Declare Variables
        double purchase, stateTax, countyTax, totalTax, totalPurchase;
        
        //Intiliaze Utilities
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        //Inquire purchase amount
        System.out.print("Please enter the cost of your purchase: $");
        purchase = keyboard.nextDouble();
        
        //Calculate value
        stateTax = purchase*0.04;
        countyTax =  purchase*0.02;
        totalTax =  stateTax + countyTax;
        totalPurchase =  purchase + totalTax;
        
        //Display values
        System.out.println("Your initial purchase cost is: $" + 
                formatter.format(purchase));
        System.out.println("Your state tax is: $"+formatter.format(stateTax));
        System.out.println("Your county tax is: $"
                +formatter.format(countyTax));
        System.out.println("Your total purchase amount is: $" 
                + formatter.format(totalPurchase));
    }

}
