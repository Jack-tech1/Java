package Day1;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Hello "+ name);
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Hello "+name+" You are "+ age+" year old");
		System.out.println("What is your favourite game?");
		String game= sc.nextLine();
		System.out.println("Hello "+name+" You are "+ age+" year old and your favorite game is "+game);
		sc.close();

	}

}
