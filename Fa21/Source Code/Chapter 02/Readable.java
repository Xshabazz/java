// This example is much more readable than Compact.java.
import javax.swing.JOptionPane;
public class Readable
{
   public static void main(String[] args)
   {
      short shares = 220;
      float averagePrice = 14.67F;
      float totalPrice = shares * averagePrice;

      System.out.println("There were " + shares +
                         " shares sold at $" +
                         averagePrice + " per share.");
      System.out.printf("The total is : $%,.2f",totalPrice);

      JOptionPane.showMessageDialog(null,
                              String.format("The total is $%,.2f",totalPrice));
      System.exit(0);
   }
}
