
import java.util.Scanner;

public class Payday 

	{
	public static void main(String[] args)
		{ 
		Scanner scanner = new Scanner(System.in);
		
		//variables 
		
		double payRate; 
		double hours;
		double grossPay;

		System.out.println("Enter your payrate : ");
		payRate = scanner.nextDouble();
		System.out.println("Enter the number of hours you worked : ");
		hours = scanner.nextDouble();
		grossPay = payRate * hours;
		System.out.println("Your gross pay is : $" + grossPay);
		}
	}