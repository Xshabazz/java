//Date: 8/19/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MobileServiceProviderTest {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        boolean pack = false;
        Scanner keyboard = new Scanner(System.in);

        MobileServiceProvider test = new MobileServiceProvider();
//select package - [prompt]
        System.out.println("\nWhat Cell Package do you use ? ");

        System.out.println("\nA:");
        System.out.println("B:");
        System.out.println("C:\n");
        System.out.print("-");
//store the first character of input string as an uppercase char 
        String stringChoice = keyboard.nextLine();//store input
        stringChoice = stringChoice.toUpperCase();//force uppercase
        char charChoice = stringChoice.charAt(0);//store first letter 
        if(charChoice=='A'||charChoice=='B'||charChoice=='C')//
        {
            test.setPackage(charChoice);//pass first letter

            System.out.println("How many minutes did you use ? ");//ask user to input minutes
            test.setMinutes(keyboard.nextDouble());//pass minutes used to setMinutes()

            if(test.getCharges()<=0.0){
                    System.out.println("Error. Try Again. ");
            }
            else {
                    System.out.printf("The monthly bill: $%,.2f\n",test.getCharges());
            }
               
        }
        else {
            System.out.println("Package Error Selection. Try again.");
        }
    }
}