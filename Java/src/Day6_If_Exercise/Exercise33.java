package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		
		
		/*
		 * A certain grade of steel is graded according to the following conditions
		 * 
		 * Hardness must be greater than 50 
		 * Carbon content must be less than 0.7 
		 * Tensile strength must be greater than 5600 The grades are as follows:
		 * 
		 * Grade is 10 if all three conditions are met 
		 * Grade is 9 if conditions (i) and (ii) are met 
		 * Grade is 8 if conditions (ii) and (iii) are met 
		 * Grade is 7 if conditions (i) and (iii) are met 
		 * Grade is 6 if only one condition is met
		 * Grade is 5 if none of the conditions are met
		 *  Write a program, which will require the user to give values of hardness, 
		 *  carbon content and tensile  strength of the steel under consideration and output 
		 *  the grade of the steel
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hardness");
		float hardness = sc.nextFloat();
		System.out.println("Enter Carbon content");
		float cc = sc.nextFloat();
		System.out.println("Enter tensile strength");
		float ts= sc.nextFloat();
		
		if(hardness>50 && cc<0.7 && ts>5600 )
		{
			System.out.println("Grade 10");
		}
		else if(hardness>50 && cc<0.7 && ts<=5600)
		{
			System.out.println("Grade 9");
		}
		else if(hardness<=50 && cc<0.7 && ts>5600 )
		{
			System.out.println("Grade 8");
		}
		else if(hardness>50 && cc>=0.7 && ts>5600)
		{
			System.out.println("Grade 7");
		}
		else if((hardness>50 || cc<0.7 || ts>5600) ||(hardness>50 || cc<0.7 || ts>5600)
				||(hardness>50 || cc<0.7 && ts>5600))
		{
			System.out.println("Grade 6");
		}
		else
		{
			System.out.println("Grade 5");
		}
		sc.close();

	}

}
