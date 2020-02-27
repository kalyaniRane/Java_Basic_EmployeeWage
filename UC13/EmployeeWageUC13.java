import java.util.*;

public class EmployeeWageUC13{

	ArrayList<EmpWageBuilder> empDetails= new ArrayList<EmpWageBuilder>();
	public void empWageDetail(String company,int numOfWorkingDays,int empRatePerHr,int maxHoursPerMonth)
	{
		empDetails.add(new EmpWageBuilder(company,numOfWorkingDays,empRatePerHr,maxHoursPerMonth));

		EmpWageBuilder e=empDetails.get(empDetails.size()-1);
		e.companyWage();
	}
	public static void main(String [] args)
	{
		EmployeeWageUC13 emp = new EmployeeWageUC13();
		emp.empWageDetail("Reliance",20,20,100);
		emp.empWageDetail("D-Mart",19,20,100);
		emp.empWageDetail("Baggit",22,20,100);
		emp.empWageDetail("Big-Bazar",30,20,100);
	}
}
