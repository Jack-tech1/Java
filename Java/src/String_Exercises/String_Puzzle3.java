package String_Exercises;

public class String_Puzzle3 {

	public static void main(String[] args) {


		//Convert the given string into uppercase in Java
		
		StringBuilder a= new StringBuilder("abc");
		System.out.println("Original Value: "+a);
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)>=97 && a.charAt(i)<=122)
			{
				int c= (int)a.charAt(i)-32;
				a.setCharAt(i, (char)c);
			}
		}
		System.out.println("UpperCase: "+ a);

	}

}
