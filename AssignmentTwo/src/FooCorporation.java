import java.util.*;
/**
 * @author Moses Byanyuma
	Date: 2/5/2017
 */

/**
 *Summary:
 *An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
 *For every hour over 40, the employee gets overtime = (base pay) × 1.5
 *The base pay must not be less than the minimum wage ($8.00 an hour). If it is, program prints an error
 *If the number of hours is greater than 60, the application prints an error message
 */
public class FooCorporation {
	
	final double MINIMUM_WAGE = 8;
	final double HOUR_THRESHOLD = 40;
	final double HOUR_LIMIT = 60;
	final double OVERTIME = 1.5;
	double weeklySalary;
	
	
	/** This is the main method
	 * @param the String[] args is an array of command-line arguments 
	 * */
	public static void main(String[] args) {
		
		userPrompting();
	}
	
	public void newLine()
	{
		System.out.println("");
	}
	
	
	/** 
	 * The method userPrompting() prompts to proceed with application or exit, then for his/her name, hourly wage and
	 * number of hours worked this week. The method then outputs the invoice.
	 * */
	public static void userPrompting()
	{
		double empHourWorked;
		double empBasePay;
		String choice;
		String clientsName;
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		FooCorporation foo = new FooCorporation();
		
		System.out.println("\t\tEmployee Payroll Application");
		System.out.print("\nWould you like to proceed? (Enter 'y' to proceed & 'n' to terminate application) : ");
		choice = userInput.nextLine();
		
		if (choice.equals("y"))
		{
		while (choice.equals("y"))
		{
		System.out.print("\nEnter your full name: ");
		clientsName = userInput.next();
		System.out.print("\nPlease enter your hourly wage: ");
		empBasePay = userInput.nextDouble();
		foo.newLine();
		System.out.print("Please enter the number of hours you've worked this week: ");
		empHourWorked = userInput.nextInt();
		
		foo.employeeInformation(clientsName, empHourWorked, empBasePay);
		System.out.print("\nWould you like to process another invoice? ('y' to proceed, 'n' to terminate) : ");
		choice = userInput.next();
		}
		}
		else if (choice.equals("n"))
		{
			System.out.println("End of application, take care!");
		}
		else 
		{
			System.out.println("Error, you've entered invalid input, bye");
		}
		System.out.println("Stay blessed & keep working :) ");
		
	}
	
	/** The employeeInformation method calculates the invoice
	 * @param name				The name of the employee
	 * @param hoursWorked		The number of hours the employee has worked in a week
	 * @param basePay			The standard hourly wage the employee currently earns
	 */
	public void employeeInformation(String name, double hoursWorked, double basePay)
	{

		if (basePay < MINIMUM_WAGE) 
		{
			newLine();
			System.out.println(name + ", your hourly pay is below minimum standards.");
			//return;
		}
		
		if (basePay >= MINIMUM_WAGE)
		{
			if (hoursWorked  <= HOUR_THRESHOLD)
			{
				newLine();
				weeklySalary = basePay * hoursWorked;
				System.out.println(name + ", your weekly salary is $" + weeklySalary);
				
			}
			else if (hoursWorked > HOUR_LIMIT)
			{
				newLine();
				System.out.println(name + ", you have exceeded the maximum number of hours worked");
				//return;
			}
			else
			{
				double regularHours = HOUR_THRESHOLD;
				double overtimeHours = hoursWorked - regularHours;
				newLine();
				weeklySalary = (regularHours * basePay) + (overtimeHours * basePay * OVERTIME);
				System.out.println(name + ", your weekly salary is $" + weeklySalary);
				
			}
		}
		
		}

}
