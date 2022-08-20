import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args ) {


		Scanner scanner = new Scanner( System.in );
		double mealCost;
		double taxCost;
		double totalCost;
		double tipCost;

		System.out.println( "Please enter the cost of the meal: " );
		mealCost = scanner.nextDouble();

		tipCost = .18 * mealCost;
		taxCost = 0.075 * mealCost;
		totalCost = mealCost + tipCost;
		totalCost += taxCost;

		System.out.println( "Your meal cost: $" + mealCost );
		System.out.println( "Your tip is: $" + tipCost );
		System.out.println( "Your tax cost: $" + taxCost );
		System.out.println( "Your total cost: $" + totalCost );


	}
}