package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// Write a program to check whether a character is alphabet or not

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch= sc.next().charAt(1);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a alphabet");
		}
		else
		{
			System.out.println("This is not alphabet");
		}
		sc.close();

	}

}
