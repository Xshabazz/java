
//import scanner utility

import java.util.Scanner;

public class ResturantBill

	{
		public static void main(String[] args)
		{
		// declare variable for meal cost
		// declare variable for tax ammount based on 7.5% tax
		// declare variable for tip after tax .18%
		// declare variable for total cost after tip and tax

		Scanner scanner = new Scanner( System.in );

		double meal;
		double tax;
		double tip;
		double total;

//display message and read imput with scanner class

		System.out.println("Enter the cost of the meal: ");

			meal = scanner.nextDouble();

//perform mathematical operations

		tip = meal * 0.18;
		tax = (meal + tip) * 0.075;
		total = meal + tip;
		total += tax;

//print results for each variable

		System.out.println("Meal cost: " + meal );
		System.out.println("Tax: " + tax );
		System.out.println("Tip: " + tip );
		System.out.println("Total bill: " + total );

		}

	}

