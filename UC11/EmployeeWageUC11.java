public class EmployeeWageUC11{

	static int i=0;
	EmpWageBuilder[] empDetails=new EmpWageBuilder[4];
	public void empWageDetail(String company,int numOfWorkingDays,int empRatePerHr,int maxHoursPerMonth)
	{
		empDetails[i] = new EmpWageBuilder(company,numOfWorkingDays,empRatePerHr,maxHoursPerMonth);
		empDetails[i].companyWage();
		i++;
	}
	public static void main(String [] args)
	{
		EmployeeWageUC11 emp = new EmployeeWageUC11();
		emp.empWageDetail("Reliance",20,20,100);
		emp.empWageDetail("D-Mart",20,20,100);
		emp.empWageDetail("Baggit",20,20,100);
		emp.empWageDetail("Big-Bazar",20,20,100);
	}

}
