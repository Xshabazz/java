public class testPayroll
{
	public static void main (String [] args)
	{

		double regularPay = 0.0;
		double overtimePay = 0.0;
		double totalPay = 0.0;
		Payroll Bennett = new Payroll();

		Bennett.setEmployeeId("012310");
		Bennett.setEmployeeName("Bennett");
		Bennett.setEmployeeWage(20.0);
		Bennett.setEmployeeHours(40.0);
		Bennett.printInfo();

		//Do all of the testing in the testPayroll class
		if(Bennett.getEmployeeHours() > 40)
			{
				regularPay = 40 * Bennett.getEmployeeWage();
				overtimePay = (Bennett.getEmployeeHours() - 40)
							* (Bennett.getEmployeeWage() * 1.5);

	}
	else
		{
		regularPay = Bennett.getEmployeeWage() * Bennett.getEmployeeHours();
	totalPay = regularPay + overtimePay;
	}

	System.out.println("Regular Pay: " + regularPay);
	System.out.println("Overtime Pay: " + overtimePay);
	System.out.println("Total Pay: " + totalPay);

}

}