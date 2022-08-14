//Date
import java.util.Scanner;

public class SalesCommissionTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();
// display and obtain input for sales amount and advance needed 
        System.out.println("enter the value of product you sold :");
        double sales = keyboard.nextDouble();
        System.out.println("enter the amount of advance pay you would like : ");
        double advance = keyboard.nextDouble();

        SalesCommission exOne = new SalesCommission(sales, advance); // pass values to the class constructor
        

        double rate = 100*(exOne.getRate()); // turn the commission rate to percent form 
        switch (exOne.getError()) // use switch statement to test an error value from the classes getError 
        {
            case "blank":
                System.out.printf("\nSales: $%,.2f\n"+
                                    "Commission rate: %.0f%%\n"+
                                    "Commission pay: $%,.2f\n"+
                                    "Your advance: -$%,.2f\n"
                                    ,exOne.getSales(),rate,exOne.getCommission(),exOne.getAdvance());
                                    //display sales, rate, commission pay, advance pay
                
                if(exOne.getPay()>0) // if pay is positive display "your pay" 
                    {
                        System.out.printf("Your pay: $%,.2f\n",exOne.getPay());
                    }
                else if(exOne.getPay()<0) // if pay is negative display "you owe Joe"
                    {
                        System.out.printf("You owe Joe: $%,.2f\n",exOne.getPay());
                    }
                break;

            default:
                System.out.println("invalid sales amount");
                break;
        }

    }
}