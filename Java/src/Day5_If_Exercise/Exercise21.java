package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {

		//		Write a program to input electricity unit charges and 
		//		calculate total electricity bill according to the given condition:
		//
		//			For first 50 units Rs. 0.50/unit
		//			For next 150 units Rs. 0.75/unit
		//			For next 250 units Rs. 1.20/unit
		//			For unit above 250 Rs. 1.50/unit
		//			An additional surcharge of 20% is added to the bill

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Units");
		int unit = sc.nextInt();
		float unit_bill;
		float total;
		float additional_charge;

		if(unit<=50)
		{
			unit_bill = unit*0.5f;
			additional_charge = unit_bill*0.2f;
			total = unit_bill+additional_charge;

			System.out.println("Your total unit is: "+unit+" and Your unit_bill is: "+
					unit_bill+" and your total charge is: "+total+" rupees");

		}
		else if(unit>50 && unit<=150)
		{
			unit_bill = unit*0.75f;
			additional_charge = unit_bill*0.2f;
			total = unit_bill+additional_charge;

			System.out.println("Your total unit is: "+unit+" and Your unit_bill is: "+
					unit_bill+" and your total charge is: "+total+" rupees");
		}
		else if(unit>150 && unit<=250)
		{
			unit_bill = unit*1.2f;
			additional_charge = unit_bill*0.2f;
			total = unit_bill+additional_charge;

			System.out.println("Your total unit is: "+unit+"  and Your unit_bill is: "+
					unit_bill+" and your total charge is: "+total+" rupees");
		}
		else if(unit>250)
		{
			unit_bill = unit*1.5f;
			additional_charge = unit_bill*0.2f;
			total = unit_bill+additional_charge;

			System.out.println("Your total unit is: "+unit+" and Your unit_bill is: "+
					unit_bill+" and your total charge is: "+total+" rupees");
		}
		sc.close();
	}
}
