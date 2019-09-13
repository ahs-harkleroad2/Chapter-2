/**
 * Alex Harkleroad
 * Stock Transaction Program
 * Programming III
 * 9/12/2019
 */
import java.text.DecimalFormat;

public class StockTransactionProgram {

    public static void main(String[] args) {
        //Declare variables
        int stocks = 1000;
        double stockPrice1 = 32.97, stockPrice2 = 33.92, 
                commission = 0.02, joePaidStock, joePaidBroker1, joeSoldStock,
                joePaidBroker2, profit;
        //Intilize utlities
        DecimalFormat formatter = new DecimalFormat("#0.00");
        //Calculate data
        joePaidStock = (stockPrice1 * stocks);
        joePaidBroker1 = (joePaidStock * commission);
        joeSoldStock = (stockPrice2 * stocks);
        joePaidBroker2 = (joeSoldStock * commission);
        profit = ((joeSoldStock - joePaidStock)-
                (joePaidBroker1 + joePaidBroker2));
        //Display data
        System.out.println("Joe paid $"+formatter.format(joePaidStock)+" for "
                + "the stock.");
        System.out.println("Joe paid his broker $"
                +formatter.format(joePaidBroker1)+" when he bought it.");
        System.out.println("Joe sold his stock for $"
                +formatter.format(joeSoldStock)+".");
        System.out.println("Joe paid his broker $"
                +formatter.format(joePaidBroker2)+" when he sold it.");
        System.out.println("Joe made $"+formatter.format(profit));
    }

}
