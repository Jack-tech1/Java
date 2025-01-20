package For_Loop;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		//Write a program to print tables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int f = sc.nextInt();
        System.out.println("Enter Last Number");
        int l = sc.nextInt();
        System.out.println("Enter Table Number");
        int t= sc.nextInt();
        
        while(f<=l)
        {
        	System.out.println(t+"*"+f+"  =  "+ (t*f));
        	f++;
        }
        sc.close();

	}

}
