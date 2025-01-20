package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		
		//A five-digit number is entered through the keyboard.
		/*
		 * Write a program to obtain the reversed number and to determine whether the
		 * original and reversed numbers are equal or not
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit numbrt");
		int num= sc.nextInt();
		int rem,sum=0;
		int a=num;
		
		while(num>0)
			
		{
			rem= num%10;
			sum= (sum*10)+rem;
			num=num/10;
			
		}
		if(a==sum)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		sc.close();
		
		
		

	}

}
