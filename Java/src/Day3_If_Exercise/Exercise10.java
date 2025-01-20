package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		//Write a program to check whether a character is uppercase or lowercase alphabet
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower Case");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper Case");
		}
		else
		{
			System.out.println("This is not a character");
		}
		sc.close();

	}

}
