package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		
		/*
		 * The current year and the year in which the employee joined the organization
		 * are entered through the keyboard. If the number of years for which the
		 * employee has served the organization is greater than 3 then a bonus of Rs.
		 * 2500/- is given to the employee. If the years of service are not greater than
		 * 3, then the program should do nothing
		 */
		
		int current_year;
		int joining_year;
		int experience;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Year");
		current_year = sc.nextInt();
		System.out.println("Enter Joining Year");
		joining_year = sc.nextInt();
		
		experience = current_year-joining_year;
		
		if(experience>=3)
		{
			System.out.println("Get Bonus of 2500");
		}
		else
		{
			System.out.println("Nothing");
		}
		sc.close();
	}

}
