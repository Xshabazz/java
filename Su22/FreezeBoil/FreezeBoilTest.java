//Date: 8/18/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class FreezeBoilTest {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();

        System.out.println("What is the temperature? ");
        FreezeBoil test = new FreezeBoil(keyboard.nextDouble());

        System.out.println("These substances will freeze at that temperature. - ");

        if(test.isEthylFreezing()){
            System.out.println("Ethyl");
        }
        if(test.isOxygenFreezing()){
            System.out.println("Oxygen");
        }
        if(test.isWaterFreezing()){
            System.out.println("Water");
        }
        
        System.out.println("These Substances will boil at that temp. - ");

        if(test.isEthylBoiling()){
            System.out.println("Ethyl");
        }
        if(test.isOxygenBoiling()){
            System.out.println("Oxygen");
        }
        if(test.isWaterBoiling()){
            System.out.println("Water");
        }


    }
}