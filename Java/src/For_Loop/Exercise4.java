package For_Loop;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		//Write a program to print reverse tables
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last number");
		int l = sc.nextInt();
		System.out.println("Enter First Number");
		int f = sc.nextInt();
		System.out.println("Enter Table Number");
		int t= sc.nextInt();
		
		while(l>=f)
		{
			System.out.println(t+"*"+l+"  =  "+ (t*l));
			l--;
		}
		sc.close();

	}

}
