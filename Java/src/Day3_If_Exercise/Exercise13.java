package Day3_If_Exercise;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// Write a program to count total number of notes in given amount
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = sc.nextInt();
		
		int n500,n200,n100,n50,n20,n10,n5,n2,n1;
		
		n500=n200=n100=n50=n20=n10=n5=n2=n1=0;
		
		if(amount>=500)
		{
			n500 = amount/500;
			amount= amount-(n500*500);
		}
		if(amount<500)
		{
			n200=amount/200;
			amount= amount-(n200*200);
		}
		if(amount<200)
		{
			n100=amount/100;
			amount=amount-(n100*100);
		}
		if(amount<100)
		{
			n50=amount/50;
			amount=amount-(n50*50);
		}
		if(amount<50)
		{
			n20=amount/20;
			amount=amount-(n20*20);
		}
		if(amount<20)
		{
			n10=amount/10;
			amount=amount-(n10*10);
		}
		if(amount<10)
		{
			n5= amount/5;
			amount=amount-(n5*5);
		}
		if(amount<5)
		{
			n2=amount/2;
			amount=amount-(n2*2);
		}
		if(amount<2)
		{
			n1=amount;
		}
		
		System.out.println("Total Number of 500 notes are "+ n500);
		System.out.println("Total Number of 200 notes are "+ n200);
		System.out.println("Total Number of 100 notes are "+ n100);
		System.out.println("Total Number of 50 notes are "+ n50);
		System.out.println("Total Number of 20 notes are "+ n20);
		System.out.println("Total Number of 10 notes are "+ n10);
		System.out.println("Total Number of 5 notes are "+ n5);
		System.out.println("Total Number of 2 notes are "+ n2);
		System.out.println("Total Number of 1 notes are "+ n1);
		sc.close();
		
		

	}

}
