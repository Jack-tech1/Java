package String_Exercises;

public class String_Puzzle5 {

	public static void main(String[] args) {


		//Convert the given string into Capitalized Each Word in Java
		StringBuilder a= new StringBuilder("zAki tuTor joes coMputer education");
		System.out.println("Given String: "+a);
		
		
		   if(a.charAt(0)>=97 && a.charAt(0)<=122) 
		   {
			   int b=(int)a.charAt(0)-32;
			   a.setCharAt(0, (char) b);
		   }
		  
		 		
		
		for(int i=1;i<a.length();i++)
		{
			if(a.charAt(i)==32)
			{
				i++;
				if(a.charAt(i)>=97 && a.charAt(i)<=122)
				{
					int c= (int)a.charAt(i)-32;
					a.setCharAt(i, (char)c);
				}
			}
			else
			{
				if(a.charAt(i)>=65 && a.charAt(i)<=90)
				{
					int d = (int)a.charAt(i)+32;
					a.setCharAt(i, (char)d);
				}
			}
		}
		System.out.println("Converted String: "+ a);

	}

}
