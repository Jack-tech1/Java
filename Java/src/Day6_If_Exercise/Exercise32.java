package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		
		/*
		 * Given the length and breadth of a rectangle, write a program to find whether
		 * the area of the rectangle is greater than its perimeter. For example, the
		 * area of the rectangle with length = 5 and breadth = 4 is greater than its
		 * perimeter
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of a rectangle");
		int length = sc.nextInt();
		System.out.println("Enter breadth of a rectangle");
		int breadth= sc.nextInt();
		
		int area= length*breadth;
		int perimeter= 2*(length+breadth);
		
		if(area>perimeter)
		{
			System.out.println("Area is greater than perimeter Area: "+ area +" Perimeter: "+ perimeter);
		}
		else
		{
			System.out.println("Area is smaller than perimeter Area: "+ area +" Perimeter:"+ perimeter);

		}
		sc.close();


	}

}
