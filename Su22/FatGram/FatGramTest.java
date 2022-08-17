//Date: 8/16/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FatGramTest {

    public static void main(String[] args)  {
        double cal, fat; // test scores 
        
        Scanner keyboard = new Scanner(System.in);
        
        cal = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the number of calories in the food. ")
        );
        fat = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the number of grams of fat in the food. ")
        );
        FatGramClass chips = new FatGramClass(cal, fat);
        double fatPercent = 100*chips.getFatCal();
        System.out.println(fatPercent);
        
        if(fatPercent<30)
            System.out.println("The food is low in fat. ");
        else if (fat>(cal/9.0))
            System.out.println("Input error.");
        else 
            System.out.println("The food is high in fat");


        System.exit(0);
    }
}