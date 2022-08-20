import java.util.Scanner;

public class pennies
{
	public static void main (String [] args)
	{

	double pay = 0.02;
	double fpay = 0.0;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter how many days you will work");
	double days = keyboard.nextDouble();
	days -= 1;

	System.out.println("You earned $");
	System.out.print(Math.pow(pay, days));
	}
}