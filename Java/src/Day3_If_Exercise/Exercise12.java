package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Write a program to input month number and print month Name

		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Month Name From 1 to 12");
		num= sc.nextInt();
		if(num==1)
		{
			System.out.println("January");
		}
		else if(num==2)
		{
			System.out.println("-");
		}
		else if(num==3)
		{
			System.out.println("March");
		}
		else if(num==4)
		{
			System.out.println("April");
		}
		else if(num==5)
		{
			System.out.println("May");
		}
		else if(num==6)
		{
			System.out.println("June");
		}
		else if(num==7)
		{
			System.out.println("July");
		}
		else if(num==8)
		{
			System.out.println("August");
		}
		else if(num==9)
		{
			System.out.println("September");
		}
		else if(num==10)
		{
			System.out.println("October");
		}
		else if(num==11)
		{
			System.out.println("Nov");
		}
		else if(num==12)
		{
			System.out.println("Dec");
		}
		else
		{
			System.out.println("Please enter valid number");
		}
		sc.close();

	}

}
