package String_Exercises;

public class String_Exercise3 {

	public static void main(String[] args) {


		/*
		 * Write a program to get the character (Unicode code point) at the given index
		 * within the String
		 */
		
		String str ="Zaki Inam";
		int a = str.codePointAt(0);
		int b = str.codePointAt(4);
		int c= str.codePointAt(7);
		
		System.out.println("Character at: " + str.charAt(0)+ " Unicode is: "+ a);
		System.out.println("Character at: " + str.charAt(4)+ " Unicode is: "+ b);
		System.out.println("Character at: " + str.charAt(7)+ " Unicode is: "+ c);




	}

}
