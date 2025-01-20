package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		
		/*
		 * A company insures its drivers in the following cases:
		 * 
		 * If the driver is married 
		 * If the driver is unmarried, male & above 30 years of age 
		 * If the driver is unmarried, female & above 25 years of age
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age Of Driver");
		int age = sc.nextInt();
		System.out.println("Enter The Gender of Driver");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the marital status of driver");
		char status = sc.next().charAt(0);
		
		if(status=='M' || status=='m')
		{
			System.out.println("Driver should be insured");
		}
		else if(status=='U' && gender=='M' && age>30 
				||status=='u' && gender=='m' && age>30  )
		{
			System.out.println("Driver should be insured");
		}
		else if(status=='U' && gender=='F' && age>25 
				||status=='u' && gender=='f' && age>25  )
		{
			System.out.println("Driver should be insured");
		}
		else
		{
			System.out.println("Driver should not be insured");
		}
		sc.close();
		
	}

}
