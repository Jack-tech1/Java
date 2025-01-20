package String_Exercises;

public class String_Puzzle1 {

	public static void main(String[] args) {


		//Count Vowels,Capital letters,small letters,numbers and space in Java
		
		StringBuilder a = new StringBuilder("Ram-age is 12@");
		System.out.println(a);
		int upper=0;
		int lower=0;
		int numbers=0;
		int space=0;
		int vowel=0;
		
		
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)>=65 && a.charAt(i)<=90)
			{
				upper++;
			}
			if(a.charAt(i)>=97 && a.charAt(i)<=122)
			{
				lower++;
			}
			if(a.charAt(i)==32)
			{
				space++;
			}
			if(a.charAt(i)>=48 && a.charAt(i)<=57)
			{
				numbers++;
			}
			if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O'
			   || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'
			   || a.charAt(i)=='u')
			{
				vowel++;
			}
		}
		
		System.out.println("Upper Case: "+upper);
		System.out.println("Lower Case: "+lower);
		System.out.println("Spaces: "+ space);
		System.out.println("Numbers: "+numbers);
		System.out.println("Vowels: "+ vowel);
		System.out.println("Symbols: " + (a.length()-(upper+lower+space+numbers)));
		
		

	}

}
