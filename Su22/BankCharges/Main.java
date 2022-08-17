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

        BankCharges exOne = new BankCharges(
            Integer.parseInt(
                JOptionPane.showInputDialog("How many checks were written ? ")
            ),
            Double.parseDouble(
                JOptionPane.showInputDialog("What is the ending balance of the account ? ")
            )
        );

        double balance = exOne.getBal();
        double fees = exOne.getFee();
        double total = balance - fees;

        String balanceF = String.format("Account balance before fees : $%,.2f",balance);
        String feesF = String.format("Bank fees : $%,.2f",fees);
        String totalF = String.format("The account balance after fees : $%,.2f",total);
        JOptionPane.showMessageDialog(null, balanceF);
        JOptionPane.showMessageDialog(null, feesF);
        JOptionPane.showMessageDialog(null, totalF);

        System.exit(0);
    }
}