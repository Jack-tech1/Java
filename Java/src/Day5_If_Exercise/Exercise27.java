package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {

//Write a program to calculate the salary as per the following table

//            Gender	   Year of Service	      Qualifications	Salary
//             Male	           >= 10	          Post - Graduate	15000
//                             >= 10	                 Graduate	10000
//                             < 10	              Post - Graduate	10000
//                             < 10	                     Graduate	7000
//             Female	       >= 10	          Post - Graduate	12000
//                             >= 10	                 Graduate	9000
//                              < 10	          Post - Graduate	10000
//                              < 10	                 Graduate	6000
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Years of Service :");
		int yos = input.nextInt();
		System.out.print("Enter the Gender f/m :");
		char gen = input.next().charAt(0);
		System.out.print("Enter the Qualification (Graduate(0) , Post-Graduate(1)) :");
		int qual = input.nextInt();
		int salary = 0;
		if(gen=='m' && yos>=10 && qual==1)
		{			
			salary = 15000;
		}
		else if( (gen=='m' && yos>=10 && qual==0) || ( gen=='m' && yos<10 && qual==1 ) || ( gen=='f' && yos<10 && qual==1))
		{			
			salary = 10000;
		}
		else if(gen=='m' && yos<10 && qual==0)
		{			
			salary = 7000;
		}
		else if(gen=='f' && yos>=10 && qual==1)
		{			
			salary = 12000;
		}
		else if(gen=='f' && yos>=10 && qual==0)
		{			
			salary = 9000;
		}
		else if(gen=='f' && yos<10 && qual==0)
		{			
			salary = 6000;
		}
		System.out.println("Salary : " + salary);
		input.close();
		
		
	}
	

}
