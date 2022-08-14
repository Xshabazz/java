import java.util.Scanner;

public class convertToMetricTest

{

public static void main(String [] args)

	{
		Scanner keyboard = new Scanner(System.in);
		convertToMetric This = new convertToMetric();

			double meter;
			double centimeter;




		System.out.println("How many feet ?");
		double length = keyboard.nextDouble();

		This.setStandard(length);
		double standard = length;

		centimeter = This.getCentimeters();
		meter = This.getMeters();


		System.out.println("Length in feet : " + standard );
		System.out.println("Length in meters : " + meter );
		System.out.println("Length in centimeters " + centimeter );




	}

}