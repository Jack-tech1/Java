package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Write a program to check whether a number is even or odd
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		sc.close();

	}

}
