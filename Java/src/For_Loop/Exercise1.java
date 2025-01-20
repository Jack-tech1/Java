  package For_Loop;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		
		//Write a program to print all natural numbers from 1 to n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		
		while(s<=e)
		{
			System.out.println(s);
			s++;
		}
		sc.close();

	}

}
