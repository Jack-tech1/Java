package For_Loop;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {


		//write a program to Check Whether a Given Number is Prime or Not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				//break;
			}
		}
		
		if(count==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime and number has "+ count + " divident");
		}
		sc.close();

	}

}
