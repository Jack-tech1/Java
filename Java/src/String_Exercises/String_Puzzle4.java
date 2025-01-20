package String_Exercises;

public class String_Puzzle4 {

	public static void main(String[] args) {


		//Convert the given string into lowercase in Java
		
		StringBuilder a = new StringBuilder("ABCDERF");
		System.out.println("Original input "+a);
		for(int i=0; i<=a.length()-1;i++)
		{
			if(a.charAt(i)>=65 && a.charAt(i)<=90)
			{
				int c=(int)a.charAt(i)+32;
				a.setCharAt(i, (char)c);
			}
		}
		System.out.println("Lowercase: "+ a);

	}

}
