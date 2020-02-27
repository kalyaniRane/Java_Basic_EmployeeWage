import java.util.*;

public class EmployeeWageUC14{

	ArrayList<EmpWageBuilder> empDetails= new ArrayList<EmpWageBuilder>();
	public void empWageDetail(String company,int numOfWorkingDays,int empRatePerHr,int maxHoursPerMonth)
	{
		empDetails.add(new EmpWageBuilder(company,numOfWorkingDays,empRatePerHr,maxHoursPerMonth));

		EmpWageBuilder e=empDetails.get(empDetails.size()-1);
		e.companyWage();
		e.printDailyWage();
	}
	public static void main(String [] args)
	{
		EmployeeWageUC14 emp = new EmployeeWageUC14();
		emp.empWageDetail("Reliance",20,20,100);
		emp.empWageDetail("D-Mart",20,20,100);
		emp.empWageDetail("Baggit",20,20,100);
		emp.empWageDetail("Big-Bazar",20,20,100);
	}
}
