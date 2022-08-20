import java.util.Scanner;

public class convertToMetricTest

{

	public static void main(String [] args)

	{
		Scanner keyboard = new Scanner(System.in);
		
			double standard = 0.0;

		System.out.println("How many feet ?");
		//pass the length to the constructor

		convertToMetric test = new convertToMetric(keyboard.nextDouble());

		System.out.println("Length in feet : " + String.format("%,.2f",test.getStandard()) );
		System.out.println("Length in Miles : " + String.format("%,.2f",test.getMiles()) );
		System.out.println("Length in Kilometers : " + String.format("%,.2f",test.getKilometers()) );
		System.out.println("Length in Meters : " + String.format("%,.2f",test.getMeters()) );
		System.out.println("Length in centimeters : " + String.format("%,.2f",test.getCentimeters()) );

	}

}