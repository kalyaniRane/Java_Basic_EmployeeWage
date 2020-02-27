import java.util.*;
public class EmpWageBuilder{
	public static final int  IS_FULL_TIME=1;
   public static final int  IS_PART_TIME=2;

   public String company;
   public int empRatePerHr;
   public int numOfWorkingDays;
   public int maxHoursPerMonth;
	public int totalWage=0;
	public int empWage=0;
	public int totalDays=0;

	private HashMap<Integer,Integer>dailyWage=new HashMap<>();
	private HashMap<String,Integer>totalWages=new HashMap<>();

	public EmpWageBuilder(String company,int numOfWorkingDays,int empRatePerHr,int maxHoursPerMonth)
   {
         this.company=company;
         this.empRatePerHr=empRatePerHr;
         this.maxHoursPerMonth=maxHoursPerMonth;
         this.numOfWorkingDays=numOfWorkingDays;
   }

	public void companyWage()
	{
		//variables
		int totalHrs=0;
		System.out.println("Employee Details of "+company);
		while(totalHrs<=maxHoursPerMonth && totalDays<numOfWorkingDays)
		{
			int empHrs=0;
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
			dailyWage.put(totalDays,totalWage);
		}
		totalWages.put(company,totalWage);
	}

	public void printDailyWage()
	{
		for (int i:dailyWage.keySet()) {
            System.out.println("Day"+i+" : "+dailyWage.get(i));
        }
	}

	public void companyTotalWage(String company)
	{
		if(totalWages.get(company)!=null)
		System.out.println("Total Wage of "+company+" "+totalWages.get(company));
	}
}
