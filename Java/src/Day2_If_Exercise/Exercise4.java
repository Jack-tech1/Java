package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		//Write a program to check whether a number is divisible by 5 and 11 or not
		
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("This Number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("This number is not divisible by 5 and 11");
		}
		sc.close();

	}

}
