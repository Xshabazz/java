//Date
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class BillTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        //Create a bill object for this receipt
        Bill ex = new Bill();
        //display for the user to enter the charge of the meal 
        System.out.println("Enter the charge of the meal");
        //store the charge of the meal 
        ex.setCharge(keyboard.nextDouble());
        ex.sumTotal();

        //display results 
        System.out.printf("Meal price : $%,.2f\n",ex.getCharge());//display charge 
        System.out.printf("Tax price : $%,.2f\n",ex.getTax());//display tax 
        System.out.printf("Tip price : $%,.2f\n",ex.getTip());//display tip
        System.out.printf("Total price : $%,.2f\n",ex.getTotal());//display total 


            }
    }