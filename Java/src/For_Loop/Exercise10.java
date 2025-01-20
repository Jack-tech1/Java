package For_Loop;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Write a program to find sum of all even numbers between 1 to n
		
		Method2();
		

	}
	public static void Method2() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s= sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		int sum=0;
		for(int i=s;i<=e;i++)
		{
			if(i%2==0)
			{
				sum= sum+i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
	public static void Method1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s= sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		int sum=0;
		while(e>=s)
		{
			if(s%2==0)
			{
				sum= sum+s;
			}
			s++;
		}
		System.out.println(sum);
		sc.close();
	}

}
