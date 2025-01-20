package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		//Write a program to input week number and print week day
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week number from 1-7");
		int num;
		num= sc.nextInt();
		
		if(num==1)
		{
			System.out.println("Sunday");
		}
		else if(num==2)
		{
			System.out.println("Monday");
		}
		else if(num==3)
		{
			System.out.println("Tueday");
		}
		else if(num==4)
		{
			System.out.println("Wedday");
		}
		else if(num==5)
		{
			System.out.println("Thursday");
		}
		else if(num==6)
		{
			System.out.println("Friday");
		}
		else if(num==7)
		{
			System.out.println("Satday");
		}
		else
		{
			System.out.println("Please enter form 1 to 7"); 
			
		}
		sc.close();

	}

}
