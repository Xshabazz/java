//Date: 8/19/2022
//Author: Darien Shabazz
import java.util.Scanner;


public class CheckTemperature {

    public static void main(String[] args)  {

        
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter the substance's Celsius temperature : ");
        double temperature = keyboard.nextDouble();

        while(temperature>102.5)
        {
            System.out.println("Too Hot. Turn down the thermostat and wait.  ");
            System.out.println("After 5 minutes, Enter the substances temperature : ");
            temperature = keyboard.nextDouble();
        }
        System.out.println("The temperature is acceptable. Check it again in 15 minutes ");


    }
}