import java.util.Scanner;

public class SpeedSoundTest
	{

	public static void main (String [] args)
		{
		double feet = 0.0;
		int medium;
		double water = 0.0;
		double air = 0.0;
		double steel = 0.0;

		Scanner keyboard = new Scanner (System.in);
		SpeedSound This = new SpeedSound();
		System.out.println("Enter the distance travelled in feet ");
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
		air = This.getSpeedInAir();
		water = This.getSpeedInWater();
		steel = This.getSpeedInSteel();

	if (medium == 1){
		System.out.println("It will take " + String.format("%.2f", air) +
					" seconds for your sound to travel "
					+ feet + " feet through air " );
					}
	if (medium == 2){
		System.out.println("It will take " + String.format("%.2f", water) +
					" seconds for your sound to travel "
					+ feet + " feet through water" );
					}
	if (medium == 3)
			System.out.println("It will take " + String.format("%.2f", steel) +
					" seconds for your sound to travel "
					+ feet + " feet through steel" );


	}
}