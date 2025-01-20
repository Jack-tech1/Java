package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		
		
		// Find the absolute value of a number entered through the keyboard
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num<0)
		{
			num= num*-1;
		}
		System.out.println("Absolute Number is: "+ num);
		sc.close();

	}

}
