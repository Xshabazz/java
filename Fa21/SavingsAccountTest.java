import java.util.Scanner;

public class SavingsAccountTest
{
    public static void main(String[] args)
    {
        double startBalance;
        double annualInterestRate;
        double withdrawAmount;
        double depositAmount;
        int months;

        Scanner input = new Scanner(System.in);

        //Get the starting balance from the user
        System.out.print("Enter your starting balance: $");
        startBalance = input.nextDouble();


        //Get the annual interest rate from the user
        System.out.print("Enter annual interest rate: ");
        annualInterestRate = input.nextDouble();


        //Get months count
        System.out.print("Enter the number of months: ");
        months = input.nextInt();


        SavingsAccount test = new SavingsAccount(startBalance, annualInterestRate);

        for (int i = 1; i <= months; i++)
        {
            // Prompt user for deposit amount
            System.out.print("Enter amount to deposit for the month " + i + ":$");
            depositAmount = input.nextDouble();

            test.deposit(depositAmount);

            // Prompt user for amount to withdraw
            System.out.print("Enter amount to withdraw for the month " + i + ":$");
            withdrawAmount = input.nextDouble();

            test.withdraw(withdrawAmount);

            test.accrueMonthlyInterest();

        }

        displayData(test);
    }



    public static void displayData(SavingsAccount test)
    {
        double balance = Math.round(test.getBalance() * 100.0) / 100.0;
        double totalInterest = Math.round(test.getTotalInterest() * 100.0) / 100.0;
        System.out.println();
        System.out.println("The ending balance is: $" + balance);
        System.out.println("Total amount of deposits: $" + test.getTotalDeposits());
        System.out.println("Total amount of withdraws: $" + test.getTotalWithdraws());
        System.out.println("Total interest earned: $" + totalInterest);
    }
}