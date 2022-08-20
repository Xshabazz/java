import java.util.Scanner;
	public class PersonalInformationTest

	{
		public static void main(String []args)
		{
			Scanner keyboard = new Scanner(System.in);

			String Name;
			String Address;
			int Age;
			long PhoneNumber;

			{

				System.out.println("What is  your name? ");

				Name = keyboard.nextLine();

				System.out.println("What is your full address? ");

				Address = keyboard.nextLine();

				System.out.println("What is your age? ");

				Age = keyboard.nextInt();

				System.out.println("What is your phone number? ");

				PhoneNumber = keyboard.nextLong();
			}

			{
				System.out.println("Your name is " + Name);
				System.out.println("Your address is " + Address);
				System.out.println("Your age is " + Age);
				System.out.println("Your phone number is " + PhoneNumber);
			}
		}
}