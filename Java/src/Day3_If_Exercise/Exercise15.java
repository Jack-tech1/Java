package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to input all sides of a triangle and check whether triangle
		 * is valid or not
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all three sides of triangle");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if((side1+side2)>side3)
			if((side1+side3)>side2)
				if((side2+side3)>side1)
				{
					System.out.println("Valid triangle");
				}
				else
				{
					System.out.println("Invalid triangle 3rd");
				}
			else
			{
				System.out.println("Invalid triangle 2nd");
			}
		else
		{
			System.out.println("Invalid triangle 1st");
		}
		sc.close();
		
		


	}

}
