package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {


		/*
		 * Write a program to check whether a triangle is valid or not, when the three
		 * angles of the triangle are entered through the keyboard. A triangle is valid
		 * if the sum of all the three angles is equal to 180 degrees
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all sides of angle");
		int angle1= sc.nextInt();
		int angle2= sc.nextInt();
		int angle3 = sc.nextInt();
		int sum= angle1+angle2+angle3;
		
		if(sum==180)
		{
			System.out.println("Valid triangle");
		}
		else
		{
			System.out.println("Invalid triangle");
		}
		sc.close();
	}

}
