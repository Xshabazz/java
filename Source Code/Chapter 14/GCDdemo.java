import java.util.Scanner;

/**
 *  This program demonstrates the recursive gcd method.
 */

public class GCDdemo
{
   /**
    *  main method
    */
   
   public static void main(String[] args)
   {
      int num1, num2;  // Two numbers
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get two numbers from the user.
      System.out.print("Enter an integer: ");
      num1 = keyboard.nextInt();
      System.out.print("Enter another integer: ");
      num2 = keyboard.nextInt();
      
      // Display the GCD.
      System.out.println("The greatest common divisor " +
                         "of these two numbers is " + 
                         gcd(num1, num2));
   }

   /**
    *  The gcd method returns the greatest common divisor
    *  of the arguments passed into x and y.
    */
   
   public static int gcd(int x, int y)
   {
      if (x % y == 0)
         return y;
      else
         return gcd(y, x % y);
   }
}