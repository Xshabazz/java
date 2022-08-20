import java.util.Scanner;
import java.io.*;

public class depositFile
{
   public static void main(String[] args) throws IOException
   {

       double startBalance = 500;
     	double interest = 0.0;
        double withdrawAmount = 0.0;
        double depositAmount = 0.0;
        double annualInterestRate = 0.0;
		// not sure what interest rate to use
		//not sure how to use the method

    SavingsAccount test = new SavingsAccount(startBalance, annualInterestRate);

		// Open the file.
      File dep = new File("deposits.txt");
      Scanner inputFile = new Scanner(dep);

      // read deposit lines
      double line = inputFile.nextDouble();
      double linetwo = inputFile.nextDouble();
      double linethree = inputFile.nextDouble();
      double linefour = inputFile.nextDouble();
	  depositAmount = line + linetwo + linethree + linefour;
	  //not sure how to use this method
	  test.deposit(depositAmount);
	  startBalance = startBalance + line + linetwo + linethree + linefour;

      File withd = new File("withdrawals.txt");
      Scanner inputFiletwo = new Scanner(withd);

      // Read lines from second file
      double one = inputFiletwo.nextDouble();
      double two = inputFiletwo.nextDouble();
      double three = inputFiletwo.nextDouble();
      double four = inputFiletwo.nextDouble();
      double five = inputFiletwo.nextDouble();
      withdrawAmount = one + two + three + four + five ;
      startBalance = startBalance - one - two - three - four - five ;

      //not sure how  to use this method
      test.withdraw(withdrawAmount);
	//testing to see if the correct  value is displayed (it is not)
	System.out.println("Your total deposits : " + depositAmount);
	System.out.println("Your total withdraws : " + withdrawAmount);
	System.out.println("Your total interst accumulated : " + 0);
    System.out.println("Your current balance : " + startBalance);

      inputFile.close();

   }

}
