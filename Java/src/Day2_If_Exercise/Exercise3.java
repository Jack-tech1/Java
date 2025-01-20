package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		//Write a program to check whether a number is negative, positive or zero
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("This is a "+num+ " positive number");
		}
		else if(num<0)
		{
			System.out.println("This is a "+num+ " negative number");
		}
		else
		{
			System.out.println("This is a "+num+ " zero number");
		}
		sc.close();

	}

}
