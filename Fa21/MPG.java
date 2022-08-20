//import scanner util

import java.util.Scanner;

public class MPG

{
	public static void main(String[] args)

	{
//scan miles traveled

	Scanner scan = new Scanner(System.in);

		System.out.println("Enter miles travelled : ");

		double miles = scan.nextDouble();

//scan gallons used

		System.out.println("Enter gallons used : ");
		double gallons= scan.nextDouble();

//use math to calculate Miles-per-gallon

	double mpg=miles/gallons;

//print result

	System.out.println("miles per gallons = "+mpg);
	}
}

