package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		/*
		 * Write a program to check whether the triangle is equilateral, isosceles or
		 * scalene triangle
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides of the triangle");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if(side1==side2 && side2==side3)
		{
			System.out.println("Equilateral Triangle");
		}
		else if(side1==side2 || side2==side3 || side3==side1)
		{
			System.out.println("Isosceles Triangle");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}
		sc.close();

	}

}
