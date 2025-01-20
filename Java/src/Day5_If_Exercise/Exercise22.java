package Day5_If_Exercise;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		/*while purchasing certain items, a discount of 10% is offered 
		if the quantity purchased is more than 100. If quantity and price 
		per item are input through the keyboard, write a program to calculate the total expenses*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of product");
		String name = sc.next();
		System.out.println("Enter Price of 1 product");
		int price = sc.nextInt();
		System.out.println("Enter total number of products");
		int total_product = sc.nextInt();
		int amount= price*total_product;
		float discount;
		float total_Expense;
		
		
		if(total_product>100)
		{
			discount= amount*0.1f;
			total_Expense = amount-discount;
			System.out.println("You baoght: "+ name +" You Total Product is: "+ total_product+ "and you got discount of 10% "
					+ " and your total expense is: "+ total_Expense );
		}
		else
		{
			
			System.out.println("No Discount and your total expense is: "+ amount);
		}
		sc.close();
		
		

	}

}
