package String_Exercises;

public class String_Exercise1 {
	
	//Write a program to concatenate Two strings
	
	public String conCat(String s1, String s2)
	{
		if(s1.length()!=0 && s2.length()!=0 && s1.charAt(s1.length()-1)==s2.charAt(0))
		{
			return s1+s2.substring(1);
		}
		return s1+s2;
		
	}

	public static void main(String[] args) {
		String_Exercise1 m = new String_Exercise1();
		
		String a ="Mark";
		String b= "Kate";
		
		String s1= a.toLowerCase();
		String s2 = b.toLowerCase();
		
		System.out.println("Given String "+a+" and "+b);
		System.out.println("After Concatination: "+ m.conCat(s1, s2));
		
		
		

	}

}
