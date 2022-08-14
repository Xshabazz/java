//Date
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class CompoundInterest {

    public static void main(String[] args)  {
        double principal,
                intRate,
                compFreq,
                years,
                end,
                difference;
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();

        System.out.println("Enter the starting principal investment : \n");
        principal = keyboard.nextDouble();
        System.out.println("Enter the interest rate as a whole number percentage : \n");
        intRate= keyboard.nextDouble();
        System.out.println("How many times does the account compound interest per year?  :\n");
        compFreq = keyboard.nextDouble();
        System.out.println("How many years has/will the account build interest ? \n");
        years = keyboard.nextDouble();

        intRate /= 100.0;
        end = principal * Math.pow((1+(intRate/compFreq)),(compFreq*years));
        difference = end - principal;

        System.out.printf("There is $%,.2f in the account after %.0f years.\n",end,years);
        System.out.printf("The amount earned is $%,.2f",difference);

    }
}