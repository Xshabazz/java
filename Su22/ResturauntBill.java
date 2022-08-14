//07/2022
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Boilerplate {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        
        float price = 0.0F,
                tax = 0.0F,
                tip = 0.0F,
                total = 0.0F;
        final float TAXRATE = .075F,
                    TIPRATE = .18F;

        
        price = Float.parseFloat(JOptionPane.showInputDialog(
            "Enter the price of your meal : "));

        
        tax = price * TAXRATE;
        tip = price * TIPRATE;
        total = price + tax + tip;

        System.out.printf("The price is : $%,.2f"
            +"\n",price);
        System.out.printf("The tax is : $%,.2f"
            +"\n",tax);
        System.out.printf("The tip is : $%,.2f"
            +"\n",tip);
        System.out.printf("The total is : $%,.2f"
            +"\n",total);
        
        System.exit(0);
            }
    }