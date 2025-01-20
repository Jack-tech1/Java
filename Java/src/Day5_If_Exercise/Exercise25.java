package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		
		/*
		 * The marks obtained by a student in 5 different subjects are input through the
		 * keyboard. The student gets a division as per the following rules: Write a
		 * program to calculate the division obtained by the student
		 * 
		 * Percentage above or equal to 60 - First division 
		 * Percentage between 50 and 59    - Second division 
		 * Percentage between 40 and 49 - Third division 
		 * Percentage less than 40 – Fail
		 */
		System.out.println("Enter marks of 5 subjects");
		Scanner sc = new Scanner(System.in);
		int m1= sc.nextInt();
		int m2 = sc.nextInt();
		int m3= sc.nextInt();
		int m4 =sc.nextInt();
		int m5= sc.nextInt();
		int total;
		float percentage;
		total= m1+m2+m3+m4+m5;
		percentage= total/5;
		if(percentage>=60)
		{
			System.out.println("First Division \n Total: "+total+"\n Percentage: "+percentage);
		}
		else if(percentage>=50 && percentage<60)
		{
			System.out.println("Second Division \n Total: "+total+"\n Percentage: "+percentage);
		}
		else if(percentage>=40 && percentage<50)
		{
			System.out.println("Third Division \n Total: "+total+"\n Percentage: "+percentage);
		}
		else
		{
			System.out.println("Fail \n Total: "+total+"\n Percentage: "+percentage);
		}
		sc.close();
	}

}
