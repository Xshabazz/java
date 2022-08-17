//Date: 8/14/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();

        System.out.println("what is the weight of the shipment (in kilos) ? ");
        ShippingCharges exOne = new ShippingCharges(keyboard.nextDouble());

        double rate = exOne.getRate();

        System.out.println("How many miles that the shipment will travel ?");
        int miles = keyboard.nextInt();
        double fmiles = miles;
        miles /= 500;
        double price = miles * rate;  

        System.out.printf("\n$%,.2f for %.2f kilograms to travel %.2f miles. \n",price,exOne.getWeight(),fmiles);


    }
}