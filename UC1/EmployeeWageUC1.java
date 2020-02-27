public class EmployeeWageUC1{
	public static void main(String [] args)
	{

		int empCheck =(int)Math.floor(Math.random()*10)%2;

		if(empCheck == 0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is Present");
	}
}
