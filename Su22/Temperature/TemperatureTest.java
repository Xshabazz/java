//Date
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Boilerplate {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        Temperature ex;
        double temperature;
        System.out.println("What is the temperature in fahrenheit?");
        ex = new Temperature(keyboard.nextDouble());

        System.out.printf("The temperature : %,.2f degrees F.\n"+
                            "The temperature : %,.2f degrees C.\n"+
                            "The temperature : %,.2f degrees K.\n"
                            ,ex.getFahrenheit(),ex.getCelsius(),ex.getKelvin());
            }
    }