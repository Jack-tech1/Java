package For_Loop;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {


		//Write a program to find the factorial value of any number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int fact=1;
		while(num>=1)
		{
			fact = fact*num;
			num--;
		}
		System.out.println("Factorial is: "+ fact);
		
		sc.close();
	}

}
