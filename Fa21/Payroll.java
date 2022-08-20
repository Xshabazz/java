public class Payroll
	{
		private String employeeId ;
		private String employeeName ;
		private double employeeWage ;
		private double employeeHours ;

		public Payroll()
		{

			employeeId = "No ID";
			employeeName = "No Name";
			employeeWage = 0.0;
			employeeHours = 0.0;

		}
		public Payroll(String empID, String empNa, double empW, double empH)
			{
				employeeId = empID;
				employeeName = empNa;
				employeeWage = empW;
				employeeHours = empH;
			}

		public void setEmployeeId(String empID)
			{
			employeeId = empID;
			}

		public void setEmployeeName(String empNa)
			{
			employeeName = empNa;
			}

		public void setEmployeeWage(double empW)
			{
			employeeWage = empW;
			}

		public void setEmployeeHours(double empH)
			{
			employeeHours = empH;
			}

		public String getEmployeeId()

		{
		return employeeId;
		}

		public String getEmployeeName()
		{
		return employeeName;
		}

		public double getEmployeeWage()
		{
		return employeeWage;
		}

		public double getEmployeeHours()
		{
		return employeeHours;
		}

		public void printInfo()

			{
				System.out.println("Employee ID: " + employeeId);
				System.out.println("Employee Name: " + employeeName);
				System.out.println("Employee Wage: " + employeeWage);
				System.out.println("Hours Worked: " + employeeHours);
		}
	}
