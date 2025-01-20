package Day2;

import java.util.Scanner;

public class Nested_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows;
		int columns;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		rows = sc.nextInt();
		System.out.println("Enter Number of columns");
		columns=sc.nextInt();
		System.out.println("Enter the symbol");
		String symbol= sc.next();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=columns;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		

	}

}
