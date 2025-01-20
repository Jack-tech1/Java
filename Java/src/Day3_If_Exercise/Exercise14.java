package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		//Write a program to input angles of a triangle and check whether triangle is valid or not
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angles of triangle");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int sum= a1+a2+a3;
		
		if(sum==180 && a1>0 && a2>0 && a3>0)
		{
			System.out.println("This is a triangle");
		}
		else
		{
			System.out.println("This is not a triangle");
		}
		sc.close();

	}

}
