//07/2022
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Mpg {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        byte gallons;
        short miles; 
        float mpg = 0.0F;

        System.out.println("Enter the miles travelled : ");
        miles = keyboard.nextShort();
        System.out.println("Enter the gallons consumed : ");
        gallons = keyboard.nextByte();

        System.out.println((float)miles/gallons+" Mpg");

            }
    }