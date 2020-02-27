public class EmployeeWageUC9{

	public static void main(String [] args)
	{
		EmpWageBuilder dmart = new EmpWageBuilder("D-Mart",20,20,100);
		EmpWageBuilder baggit = new EmpWageBuilder("Baggit",20,20,100);
		EmpWageBuilder reliance = new EmpWageBuilder("Reliance",20,20,100);
		dmart.companyWage();
		baggit.companyWage();
		reliance.companyWage();
	}
}
