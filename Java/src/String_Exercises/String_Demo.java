package String_Exercises;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Zaki Inam";
		String b= "zaki Inam";
		System.out.println("A; "+a);
		System.out.println("B: "+b);
		System.out.println("Equals: "+ a.equals(b));
		System.out.println("Equal Ignore Case: "+ a.equalsIgnoreCase(b));
		System.out.println("Length: "+a.length());
		System.out.println("CharAt: "+ a.charAt(0));
		System.out.println("UpperCase: "+ a.toUpperCase());
		System.out.println("LowerCase: "+ a.toLowerCase());
		System.out.println("Replace: "+a.replace("Zaki", "Jack"));
		System.out.println("Contains: "+ a.contains("Inam"));
		System.out.println("Empty: "+ a.isEmpty());
		System.out.println("EndsWith: "+ a.endsWith("am"));
		System.out.println("StartWith: "+a.startsWith("Za"));
		System.out.println("SubString: "+ a.substring(4));
		System.out.println("Substring; "+a.substring(0, 4));
		char[] carray =a.toCharArray();
		for(char c: carray)
		{
			System.out.print(c+ " ");
		}
		String c= "  Zack    ";
		System.out.println();
		System.out.println("Length: "+ c.length());
		System.out.println("C: "+ c);
		System.out.println("C Trim: "+ c.trim());
		System.out.println("C Trim Length: "+ c.trim().length());
				
		
		

	}

}
