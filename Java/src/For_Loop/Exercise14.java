package For_Loop;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {


		//Write a program to find the value of one number raised to the power of another
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Number");
		int base = sc.nextInt();
		System.out.println("Enter Power Number");
		int power = sc.nextInt();
		int result =1;
		
		for(int i=1; i<=power; i++)
		{
			result= result*base;
		}
		System.out.println("Value is: "+ result);
		sc.close();

	}

}
