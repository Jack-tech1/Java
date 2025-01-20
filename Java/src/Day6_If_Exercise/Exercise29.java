package Day6_If_Exercise;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		/*
		 * // If the ages of Ram, Shyam and Ajay are input through the keyboard, write a
		 * program to determine the youngest of the three
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Ram");
		int Ram = sc.nextInt();
		System.out.println("Enter the age of Shyam");
		int Shyam = sc.nextInt();
		System.out.println("Enter the age of Ajay");
		int Ajay = sc.nextInt();
		
		if(Ram<Shyam && Ram<Ajay)
		{
			System.out.println("Ram is younger: "+ Ram);
		}
		else if(Shyam<Ajay)
		{
			System.out.println("Shyam is younger: "+Shyam);
		}
		else
		{
			System.out.println("Ajay is younger: "+Ajay);
		}
		sc.close();
	}

}
