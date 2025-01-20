package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {


		/* If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and 
		 * DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500, 
		 * then HRA = Rs. 500 and DA = 98% of basic salary. If the employee's salary is 
		 * input through the keyboard write a program to find his gross salary*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary of Employee");
		float BS = sc.nextFloat();
		float HRA,DA;
		float GS;
		
		if(BS<1500)
		{
			HRA= BS*0.1f;
			DA= BS*0.9f;
			
		}
		else 
		{
			HRA=500;
			DA= BS*0.98f;
			
		}
		
		GS=BS+HRA+DA;
		System.out.println("Total salary is: "+ GS);
		sc.close();
		
		

	}

}
