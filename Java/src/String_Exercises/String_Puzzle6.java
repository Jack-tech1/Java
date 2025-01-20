package String_Exercises;

public class String_Puzzle6 {

	public static void main(String[] args) {


		//Convert the given string into toggle case word in Java
		
		 StringBuilder a = new StringBuilder("Tutor Joes Computer Education");
	        System.out.println("Original String : "+a);
	        
	        
	        for(int i=0; i<a.length(); i++)
	        {
	        	if(a.charAt(i)>=97 && a.charAt(i)<=122)
	        	{
	        		int b= (int)a.charAt(i)-32;
	        		a.setCharAt(i, (char)b);
	        	}
	        	else if(a.charAt(i)>=65 && a.charAt(i)<=90)
	        	{
	        		int b= (int)a.charAt(i)+32;
	        		a.setCharAt(i, (char)b);
	        	}
	        }
	 
	       
	        System.out.println("tOGGLE cASE wORD Output : "+a);
	}

}
