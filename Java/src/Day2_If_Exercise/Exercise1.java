package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Write a program to find maximum between two numbers
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2= sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("This is the maximum number: "+ num1);
		}
		else if(num2>num1)
		{
			System.out.println("This is the maximum number: " + num2);
		}else
		{
			System.out.println("Both are equal number");
		}
		sc.close();

	}

}
