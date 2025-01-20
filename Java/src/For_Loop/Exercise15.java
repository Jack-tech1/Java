package For_Loop;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//write a program to reverse the given Digits
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem=0;
		int rev=0;
		int a=num;
		
		while(num>0)
		{
			rem = num%10;
			rev= (rev*10)+rem;
			num=num/10;
			
			
		}
		System.out.println("Given Number Is: "+ a);
		System.out.println("Reverse Number Is: "+ rev);
		if(a==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		sc.close();
	}

}
