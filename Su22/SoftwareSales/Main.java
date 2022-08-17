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

        SoftwareSales exOne = new SoftwareSales(
            Integer.parseInt(
                JOptionPane.showInputDialog("Enter the number of software units sold : ")));    
        String price = String.format("$%,.2f",exOne.getPrice());
        JOptionPane.showMessageDialog(null,price+" for "+exOne.getSales()+" sales. Thank you! ");

        System.exit(0);
    }
}