package Day2;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Response, For quitting the game please type 'q' or 'Q '");
		String response = sc.next();
		
		if(!response.equals("q") && !response.equals("Q"))
		{
			System.out.println("You are still playing the game");
			
		}
		else
		{
			System.out.println("You Quit The Game");
		}

	}

}
