package For_Loop;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		//Write a program to print all odd number between 1 to 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit of number");
		int n= sc.nextInt();
		
		for(int i=1; i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		sc.close();

	}

}
