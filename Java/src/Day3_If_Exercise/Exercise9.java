package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to input any character and check whether it is alphabet,
		 * digit or special character
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number or alphabet or special character");
		char ch;
		ch=sc.next().charAt(0);
		
		if(ch>'a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is an alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is a number");
		}
		else
		{
			System.out.println("This is a special character");
		}
		sc.close();


	}

}
