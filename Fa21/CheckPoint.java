import java.util.Scanner;
public class CheckPoint
{
	public static void main(String [] args)
	{
		int userNum;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter one of three numbers " +
							" 1, 2, or 3: ");
		userNum = keyboard.nextInt();

		switch (userNum)
		{
			case 1:
				System.out.println("You entered number " + userNum);
				break;
			case 2:
				System.out.println("You entered number " + userNum);
				break;
			case 3:
				System.out.println("You entered number " + userNum);
				break;
			default:
				System.out.println("You entered an invalid number");

		}
	}
}
