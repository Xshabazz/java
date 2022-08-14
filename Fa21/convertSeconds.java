import java.util.Scanner;

public class convertSeconds
{
public static void main(String[] args)

{
	//constants
	final double SECONDS_PER_MINUTE = 60.0;
	final double SECONDS_PER_HOUR = 3600.0;
	final double SECONDS_PER_DAY = 86400.0;


	//variable for the number of seconds
	double seconds;

	//scanner objects for keyboard input
	Scanner keyboard = new Scanner(System.in);

	//Get the number of seconds
	System.out.println("How many seconds ? ");
	seconds = keyboard.nextDouble();

	//Display the number of minutes

	if (seconds >= SECONDS_PER_MINUTE)
		{
		double minutes = seconds / SECONDS_PER_MINUTE;

		System.out.println( seconds + " seconds is "
					+ minutes  + " minutes ");
		}
	if (seconds >= SECONDS_PER_HOUR)
		{
		double hours = seconds / SECONDS_PER_HOUR;

		System.out.println("There are " + hours + " hours in " +
					seconds + " seconds. ");
		}
	if (seconds >= SECONDS_PER_DAY)
		{
		double days = seconds / SECONDS_PER_DAY;

		System.out.println("There are " + days +  " days in " +
					seconds + " seconds. " );
		}
	}
}