package Day4_If_Exercise;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		
		/*
		 * //Write a program to input marks of five subjects Physics, Chemistry,
		 * Biology, Mathematics and Computer. Calculate percentage and grade according
		 * to following: // //Percentage >= 90% : Grade A //Percentage >= 80% : Grade B
		 * //Percentage >= 70% : Grade C //Percentage >= 60% : Grade D //Percentage >=
		 * 40% : Grade E //Percentage < 40% : Grade F
		 */
		
		double  total_number,Phy,Che,Bio,Math,Comp;
		double per,max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maximum Number");
		max= sc.nextInt();
		System.out.println("Enter Physics Number");
		Phy = sc.nextInt();
		System.out.println("Enter Chemistry Number");
		Che = sc.nextInt();
		System.out.println("Enter Biology Number");
		Bio= sc.nextInt();
		System.out.println("Enter Math Number");
		Math=sc.nextInt();
		System.out.println("Enter Computer Number");
		Comp = sc.nextInt();
		total_number= Phy+Che+Bio+Math+Comp;
		per= (total_number*100)/max;
		
		if(per>=90)
		{
			System.out.println("Grade A " + per + "Percentage");
		}
		else if(per<90 && per>=80)
		{
			System.out.println("Grade B " + per + "Percentage");
		}
		else if(per<80 && per>=70)
		{
			System.out.println("Grade C " + per + "Percentage");
		}
		else if(per<70 && per>=60)
		{
			System.out.println("Grade D " + per + "Percentage");
		}
		else if(per<60 && per>=40)
		{
			System.out.println("Grade E " + per + "Percentage");
		}
		else if(per<40)
		{
			System.out.println("Grade F " + per + "Percentage");
		}
		sc.close();
		
		
	}

}
