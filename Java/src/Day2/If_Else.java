package Day2;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name =sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		
		if(age>5 && age<=9)
		{
			System.out.println("Hi "+name+" Your admission can be done in Primary school");
		}
		else if(age>9 && age<=12)
		{
			System.out.println("Hi "+name+" Your admission can be done in Middle school");
		}
		else if(age>12 && age<=15)
		{
			System.out.println("Hi "+name+" Your admission can be done in High school");
		}
		else if(age<5)
		{
			System.out.println("Hi "+name+" Your can learn with your mother at home");
		}
		else
		{
			System.out.println("Not Eligble because your age is "+ age);
		}

	}

}
