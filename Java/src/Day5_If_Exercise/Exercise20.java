package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to input basic salary of an employee and calculate its Gross
		 * salary according to following:
		 * 
		 * Basic Salary <= 10000 : HRA = 20%, DA = 80% 
		 * Basic Salary <= 20000 : HRA =25%, DA = 90% 
		 * Basic Salary > 20000 : HRA = 30%, DA = 95%
		 */
		
		// Gross Salary = BS+HRA+DA
		float GA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		float BS = sc.nextInt();
		
		if(BS<=10000)
		{
			GA= BS+(BS*0.2f)+(BS*0.8f);
			System.out.println("Your Gross Salary Is "+ GA);
		}
		else if(BS<=20000)
		{
			GA= BS+(BS*0.25f)+(BS*0.9f);
			System.out.println("Your Gross Salary Is "+ GA);
		}
		else if(BS>20000)
		{
			GA= BS+(BS*0.3f)+(BS*0.95f);
			System.out.println("Your Gross Salary Is "+ GA);
		}
		sc.close();
	}

}
