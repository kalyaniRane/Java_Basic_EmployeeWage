public class EmployeeWageUC5{
	//constatnts
	public static final int  IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	public static final int  EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static void main(String [] args)
	{
		//variables
		int empHrs=0;
		int empWage=0;
		int totalWage=0;
		//Computation

		for(int days=1;days<=NUM_OF_WORKING_DAYS;days++)
		{
			int empCheck = (int)Math.floor(Math.random()*10)%3;
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

			empWage=empHrs*EMP_RATE_PER_HOUR;
			totalWage=totalWage+empWage;
			System.out.println("Employee wage "+days+" "+empWage);
		}
		System.out.println("Total Wage: "+totalWage);
	}
}
