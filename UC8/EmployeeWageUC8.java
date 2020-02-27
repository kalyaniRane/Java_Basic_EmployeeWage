public class EmployeeWageUC8{
	//constatnts
	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;

	public static String company;
	public static int empRatePerHr;
	public static int numOfWorkingDays;
	public static int maxHoursPerMonth;

	public static void companyWage(String company,int numOfWorkingDays,int empRatePerHr,int maxHoursPerMonth)
	{
		//variables
		int totalWage=0;
		int totalHrs=0;
		int totalDays=0;
		//Computation
		System.out.println("Employee Details of "+company);
		while(totalHrs<=maxHoursPerMonth && totalDays<numOfWorkingDays)
		{
			int empHrs=0;
			int empWage=0;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			totalDays++;
			switch(empCheck){
					case IS_FULL_TIME:
								empHrs=8;
								break;
					case IS_PART_TIME:
								empHrs=4;
								break;
					default:
								empHrs=0;
								break;
			}
			totalHrs=totalHrs+empHrs;
			empWage=empHrs*empRatePerHr;
			totalWage=totalWage+empWage;
			System.out.println("Day: "+totalDays+" \nEmployee Wage: "+empWage+" \nHrs: "+totalHrs);
		}
		System.out.println("Total Hours: "+totalHrs);
		System.out.println("Total Wage: "+totalWage);
	}

	public static void main(String [] args)
	{
		companyWage("D-Mart",20,20,100);
		companyWage("Baggit",20,20,100);
		companyWage("Reliance",20,20,100);
	}
}
