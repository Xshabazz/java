import java.util.scanner;

public class SOSSS
	{ 

	public static void main (String [] args) 
		{ 
		double distance;
		char medium;


		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the distance travelled ");
		distance = keyboard.nextDouble();
		SOSS test = new SOS(distance);
		test.setDistance(int distance)
//output menu 
		System.out.println("Select a medium");
		System.out.println("Enter a letter A-C");
		System.out.println("A: Air ");
		System.out.println("B: Water ");
		System.out.println("C: Steel");
//scan it 
		medium = keyboard.nextChar();
		double air = test.getSpeedInAir();
		double water = test.getSpeedInWater();
		double steel = test.getSpeedInSteel();

	if (medium == A){
		System.out.println("It will take " + air + 
					" seconds for your sound to travel " 
					+ distance " feet" );
}
	if (medium == B){
		System.out.println("It will take " + water + 
					" seconds for your sound to travel " 
					+ distance " feet" );
}
	if (medium == C){
		System.out.println("It will take " + steel + 
					" seconds for your sound to travel " 
					+ distance " feet" );
}
	}
}