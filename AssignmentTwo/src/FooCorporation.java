import java.util.*;
/**
 * 
 */

/**
 * @author Moses Byanyuma
 *
 */
public class FooCorporation {

	/**
	 * @param args
	 */
	
	final double MINIMUM_WAGE = 8;
	final double HOUR_THRESHOLD = 40;
	final double HOUR_LIMIT = 60;
	final double OVERTIME = 1.5;
	String employeeName;
	
	double weeklySalary;
	
	
	
	public static void main(String[] args) {
		
		userPrompting();
	}
	
	public void newLine()
	{
		System.out.println("");
	}
	
	public static void userPrompting()
	{
		double empHourWorked;
		double empBasePay;
		Scanner userInput = new Scanner(System.in);
		
		for (int x = 0; x < 3; x++)
		{
		FooCorporation foo = new FooCorporation();
		System.out.print("Please enter your hourly wage: ");
		empBasePay = userInput.nextDouble();
		foo.newLine();
		System.out.print("Please enter the number of hours you've worked this week: ");
		empHourWorked = userInput.nextInt();
		
		foo.employeeInformation(empHourWorked, empBasePay);
		}
	}

	public void employeeInformation(double hoursWorked, double basePay)
	{

		if (basePay < MINIMUM_WAGE) 
		{
			System.out.println("Your hourly pay is below minimum standards");
			return;
		}
		
		if (basePay >= MINIMUM_WAGE)
		{
			if (hoursWorked  <= HOUR_THRESHOLD)
			{
				weeklySalary = basePay * hoursWorked;
				System.out.println("Your weekly salary is $" + weeklySalary);
				
			}
			else if (hoursWorked > HOUR_LIMIT)
			{
				System.out.println("You have exceeded the maximum number of hours worked");
				return;
			}
			else
			{
				double regularHours = HOUR_THRESHOLD;
				double overtimeHours = hoursWorked - regularHours;
				weeklySalary = (regularHours * basePay) + (overtimeHours * basePay * OVERTIME);
				System.out.println("Your weekly salary is $" + weeklySalary);
				
			}
		}
		
		}

}
