package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		//Write a program to input any alphabet and check whether it is vowel or consonant

		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the character");
		ch= sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
		   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("This is a vowel");
		}
		else
		{
			System.out.println("This is a consonant");
		}
		sc.close();


	}

}
