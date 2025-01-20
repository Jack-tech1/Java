package For_Loop;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		//Write a program to print all natural numbers in reverse
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int s= sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		
		if(s>e)
		{
			while(s>=e)
			{
				System.out.println(s);
				s--;
			}
		}
		else
		{
			System.out.println("Plese Enter Valid Number");
		}
		
		sc.close();

	}

}
