package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		
		// Write a program to find maximum between three numbers
		//First Number=10
		//Second Number=20
		//Third Number =30
		
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("This is the maximum number: "+ num1);
		}
		else if(num2>num3)
		{
			System.out.println("This is the maximum number: "+ num2);
		}
		
		else
		{
			System.out.println("This is the maximum number: "+ num3);
		}
		sc.close();

	}

}
