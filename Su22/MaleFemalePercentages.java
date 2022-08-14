import java.util.Scanner;
import javax.swing.JOptionPane;
public class MaleFemalePercentages {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        
        float total = 0.0F,
                male = 0.0F,
                female = 0.0F;

        male = Float.parseFloat(
            JOptionPane.showInputDialog("Enter the number of males :"));

        female = Float.parseFloat(
            JOptionPane.showInputDialog("Enter the number of females :"));

        total = male + female;

        male /= total;
        male *= 100;
        female /= total;
        female *= 100;

        JOptionPane.showMessageDialog(null,
                String.format("The percentage of the class that are male is %.2f%%",male));
        JOptionPane.showMessageDialog(null,
                String.format("The percentage of the class that are female is %.2f%%",female));

        System.exit(0);
            }
    }