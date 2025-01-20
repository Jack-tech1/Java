package Day2_If_Exercise;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter Year");
		year=sc.nextInt();
		boolean flag;
		
		if(year%400==0)
		{
			flag=true;
		}
		else if(year%100==0)
		{
			flag=false;
		}
		else if(year%4==0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		if(flag)
		{
			System.out.println("This is a leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
		sc.close();

	}

}
