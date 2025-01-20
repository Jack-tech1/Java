package Day4_If_Exercise;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		// Write a program to find all roots of a quadratic equation
		
		double a,b,c,root1,root2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a,b and c");
		a= sc.nextDouble();
		b= sc.nextDouble();
		c=sc.nextDouble();
		
		
		
		root1= (-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
		root2= (-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
		
		System.out.println("Value of 1st root is "+ root1);
		System.out.println("Value of 2nd root is "+ root2);
		sc.close();
		
		
		

	}

}
