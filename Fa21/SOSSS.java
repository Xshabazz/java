import java.util.Scanner;

public class SOSSS
	{

	public static void main (String [] args)
		{
		double distance;
		int medium;


		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the distance travelled ");
		distance = keyboard.nextDouble();
		SOSSS This = new SOS();
		This.setDistance( distance);
//output menu
		System.out.println("Select a medium");
		System.out.println("Enter a number 1-3");
		System.out.println("1: Air ");
		System.out.println("2: Water ");
		System.out.println("3: Steel");
//scan it
		medium = keyboard.nextInt();
		double air = This.getSpeedInAir();
		double water = This.getSpeedInWater();
		double steel = This.getSpeedInSteel();

	if (medium == 1){
		System.out.println("It will take " + air +
					" seconds for your sound to travel "
					+ distance + " feet" );
					}
	if (medium = 2){
		System.out.println("It will take " + water +
					" seconds for your sound to travel "
					+ distance + " feet" );
					}
	if (medium == 3){
		System.out.println("It will take " + steel +
					" seconds for your sound to travel "
					+ distance + " feet" );
					}

	}
}