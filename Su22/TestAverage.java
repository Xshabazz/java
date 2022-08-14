import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestAverage {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        float one, two, three, result;
        final float div = 3.0F;

        one = Float.parseFloat(JOptionPane.showInputDialog("Enter the score of test 1 :"));
        two = Float.parseFloat(JOptionPane.showInputDialog("Enter the score of test 2 :"));
        three = Float.parseFloat(JOptionPane.showInputDialog("Enter the score of test 3 :"));
 
        result = (one+two+three) / div;

        JOptionPane.showMessageDialog(null,
                                String.format("Your average score is : %.2f",result));
            }
    }