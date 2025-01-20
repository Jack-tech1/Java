package For_Loop;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {


		//write a program to sum of its Digits
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem=0;
		int sum=0;
		
		while(num>0)
		{
			rem= num%10;
			sum= sum+rem;
			num=num/10;
		}
		System.out.println("Sum Is: "+ sum);
		sc.close();

	}

}
