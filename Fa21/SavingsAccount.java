public class SavingsAccount
{
    private double balance;
    private double totalWithdraws;
    private double totalInterest;
    private double totalDeposits;
    private double annualInterestRate;




    public SavingsAccount(double startBalance, double annualInterestRate)
    {
        balance = startBalance;
        this.annualInterestRate = annualInterestRate;
    }

 	//method set the  annual interest rate


    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

	//method will calculate total deposit

    public void deposit(double amount)
    {
        balance = balance + amount;
        totalDeposits = totalDeposits + amount;
    }

	//calculate total withdrawal

    public void withdraw(double amount)
    {
        balance = balance - amount;
        totalWithdraws = totalWithdraws + amount;
    }

	// add monthly interest to the balance

    public void accrueMonthlyInterest()
    {
        double monthlyInterest = balance * getMonthlyInterestRate();
        totalInterest = totalInterest + monthlyInterest;
        balance = balance + monthlyInterest;
    }


    public double getBalance()

    {
        return balance;
    }


    public double getAnnualInterestRate()

    {
        return annualInterestRate;
    }


    public double getMonthlyInterestRate()

    {
        return annualInterestRate / 12;
    }

    public double getTotalDeposits()

    {
        return totalDeposits;
    }


    public double getTotalWithdraws()

    {
        return totalWithdraws;
    }


    public double getTotalInterest()

    {
        return totalInterest;
    }

}