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
		String choice;
		String clientsName;
		Scanner userInput = new Scanner(System.in);
		FooCorporation foo = new FooCorporation();
		
		System.out.println("\t\tEmployee Payroll Application");
		System.out.print("\nWould you like to proceed? (Enter 'y' to proceed & 'n' to terminate application) : ");
		choice = userInput.nextLine();
		
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
