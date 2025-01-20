package String_Exercises;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * Write a program to count a number of Unicode code points in the specified
		 * text range of a String
		 */

		String str ="Railway Station";
		System.out.println("Given String "+ str);
		int a=str.codePointCount(0, 10);
		System.out.println("After: "+ a);
		System.out.println(str.length());
		
		

	}

}
