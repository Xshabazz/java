import java.util.Scanner;

public class SpeedSoundTest
	{

	public static void main (String [] args)
		{
		double feet = 0.0;
		int medium;

		Scanner keyboard = new Scanner (System.in);
		SpeedSound This = new SpeedSound();
		System.out.println("Enter the distance traveled in feet ");
		feet = keyboard.nextDouble();
		This.setDistance(feet);
//output menu
		System.out.println("Select a medium");
		System.out.println("Enter a number 1-3");
		System.out.println("1: Air ");
		System.out.println("2: Water ");
		System.out.println("3: Steel");
//scan it
		medium = keyboard.nextInt();
//test the value of the medium variable, which holds the input choice of medium.
	switch(medium)
	{
	case 1:
		double air = This.getSpeedInAir();
		System.out.println("It will take " + String.format("%.2f", air) +
					" seconds for your sound to travel "
					+ feet + " feet through air." );
		break;
	case 2:
		double water = This.getSpeedInWater();
		System.out.println("It will take " + String.format("%.2f", water) +
					" seconds for your sound to travel "
					+ feet + " feet through water." );
					
		break;
	case 3:
		double steel = This.getSpeedInSteel();
		System.out.println("It will take " + String.format("%.2f", steel) +
					" seconds for your sound to travel "
					+ feet + " feet through steel." );
		break;
	default:
		System.out.println("Input error. Try again. ");
	}

	}
}