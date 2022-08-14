import java.util.Scanner;
import javax.swing.JOptionPane;
public class SalesTax {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        char letter;
        //select gui or terminal 
        System.out.println("\nThis program will calculate the tax of your purchase\n");
        System.out.println("Would you rather interact with a GUI ? \n");
        System.out.println("Y : Yes ");
        System.out.println("N : No \n\nEnter your answer:\n");

        answer = keyboard.nextLine();
        answer = answer.toUpperCase();
        letter = answer.charAt(0);

        final float SALESTAX = .055F, COUNTYTAX = .02F;
        float input, sTax, cTax, output;
        
        
        if (letter=='Y'){
                input = Float.parseFloat(
                    JOptionPane.showInputDialog("Enter the purchase price : "));
                sTax = input * SALESTAX;
                cTax = input * COUNTYTAX;
                output = cTax + sTax + input;
                JOptionPane.showMessageDialog(null,
                                        String.format("The purchase price is : $%,.2f",input));
                JOptionPane.showMessageDialog(null,
                                        String.format("The Sales tax price is : $%,.2f",sTax));
                JOptionPane.showMessageDialog(null,
                                        String.format("The County tax price is : $%,.2f",cTax));
                JOptionPane.showMessageDialog(null,
                                        String.format("The total price is : $%,.2f",output));
        }
        else if (letter=='N'){
                System.out.println("Enter the purchase price : ");
                input = keyboard.nextFloat();
                sTax = input * SALESTAX;
                cTax = input * COUNTYTAX;
                output = cTax + sTax + input;
                System.out.printf("The purchase price is : $%,.2f\n",input);
                System.out.printf("The sales tax price is : $%,.2f\n",sTax);
                System.out.printf("The county tax price is : $%,.2f\n",cTax);
                System.out.printf("The total price is : $%,.2f\n",output);
        }
        else {
                System.out.println("Input Error! - Continuing program in Terminal");
                System.out.println("Enter the purchase price : ");
                input = keyboard.nextFloat();
                sTax = input * SALESTAX;
                cTax = input * COUNTYTAX;
                output = cTax + sTax + input;
                System.out.printf("The purchase price is : $%,.2f\n",input);
                System.out.printf("The sales tax price is : $%,.2f\n",sTax);
                System.out.printf("The county tax price is : $%,.2f\n",cTax);
                System.out.printf("The total price is : $%,.2f\n",output);
        }
        System.exit(0);
            }
    }