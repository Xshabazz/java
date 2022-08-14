// This program demonstrates the double data type.

public class Sale
{
   public static void main(String[] args)
   {
      double price, tax, total, rate;

      price = 29.75;
      tax = 1.76;
      total = 31.51;
      rate = 100 * (tax / price); //find the tax rate 


      System.out.println("\nThe price of the item "
                         + "is $" + price);
      System.out.println("The tax is $" + tax);
      System.out.println("The total is $" + total);
      
      System.out.printf("\nThe tax rate is : %.2f",rate); //display tax rate 
      System.out.print("%\n\n");
   }
}