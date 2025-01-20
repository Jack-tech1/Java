package For_Loop;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		//Write a program to find sum of all natural numbers between 1 to n
		
		
		//Method1();
		Method2();
		
		

	}
	public static void Method2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int s = sc.nextInt();
		System.out.println("Enter last number");
		int l = sc.nextInt();
		int sum=0;
		for(int t=s; t<=l; t++)
		{
			sum= sum+t;
			
		}
		System.out.println(sum);
		sc.close();
		
	}
	public static void Method1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int s = sc.nextInt();
		System.out.println("Enter last number");
		int l = sc.nextInt();
		int sum=0;
		while(l>=s)
		{
			sum=sum+s;
			s++;
		}
		System.out.println(sum);
		sc.close();
	}

}
