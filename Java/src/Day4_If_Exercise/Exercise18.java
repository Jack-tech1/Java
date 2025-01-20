package Day4_If_Exercise;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		//Write a program to calculate profit or loss
		
		int BP,SP,P,L;
		
		//BP = Buying Price
		//SP = Selling Price
		//p = Profit
		//L=Loss
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Buying Price");
		BP = sc.nextInt();
		System.out.println("Enter Selling Price");
		SP= sc.nextInt();
		
		if(SP>BP)
		{
			P = SP-BP;
			System.out.println("Profit of "+P+ " Rupees");
		}
		else if(BP>SP)
		{
			L= BP-SP;
			System.out.println("Loss of "+L+ " Rupees");
					
		}
		else
		{
			System.out.println("No profit no loss");
		}
		sc.close();
		
		

	}

}
