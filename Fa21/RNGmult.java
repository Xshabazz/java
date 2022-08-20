import java.util.Scanner;

public class RNGmult
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Do you want the RNG or Calculator" );
		System.out.println("Enter  1 for  RNG ");
		System.out.println("Enter 2 for calculator ");
		int option = keyboard.nextInt();
		double randomNumber = 0.0;


		if (option == 1 )
		{
			randomNumber = Math.random();
			System.out.println("A random number is " + randomNumber );

		}
		if (option == 2 )
		{

			System.out.println("Enter the first number");
			double int1 = keyboard.nextDouble();

			System.out.println("Enter the second number");
			double int2 = keyboard.nextDouble();

			System.out.println("Enter the third number");
			double int3 = keyboard.nextDouble();

			System.out.println("Enter the fourth number");
			double int4 = keyboard.nextDouble();

			double res = (int1 * int2 * int3 * int4);
			System.out.println(int1 + " x " + int2 + " x " + int3 + " x " + int4 + " = " + res);
		}


	}

}