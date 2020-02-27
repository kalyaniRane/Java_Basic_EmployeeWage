import java.util.*;

public class EmpWageBuilderArray{

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private int numOfCompany=0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilderArray()
	{
		 companyEmpWageList =new LinkedList<>();
		 companyToEmpWageMap = new HashMap<>();
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);

		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company,companyEmpWage);
	}

	private void computeEmpWage(){
		for(int i=0;i<companyEmpWageList.size();i++){
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	public int getTotalWage(String company){
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeWage(CompanyEmpWage companyEmpWage){
		//variables
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;

		//computation
		while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays){
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
				case IS_PART_TIME:
						empHrs=4;
						break;
				case IS_FULL_TIME:
						empHrs=8;
						break;
				default:
						empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays + " EmpHrs: "+empHrs);
		}
		return totalEmpHrs*companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args){
		EmpWageBuilderArray empWageBuilderArray=new EmpWageBuilderArray();
		empWageBuilderArray.addCompanyEmpWage("D-Mart",20,2,10);
		empWageBuilderArray.addCompanyEmpWage("Big-Bazar",10,4,20);
		empWageBuilderArray.computeEmpWage();
		System.out.println("Total Wage for DMart Company: "+empWageBuilderArray.getTotalWage("D-Mart"));
	}
}
