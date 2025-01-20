package Day1;

import java.util.Scanner;

public class Math_Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a");
		a= sc.nextDouble();
		System.out.println("Enter Value of b");
		b= sc.nextDouble();
		c= Math.sqrt((a*a)+(b*b));
		System.out.println("Value of C is: "+c);
		sc.close();
		

	}

}
