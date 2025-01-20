package stringMethods;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome";
		
		//length
		
		System.out.println(s.length());
		
		//concat
		
		String s1 = " To Java";
		String s2= " Programming";
		
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s+s1+s2);
		
		//trim
		s= "    WElcome      ";
		System.out.println("Before Trim "+ s.length());
		System.out.println("After Trim "+s.trim().length());
		
		//charAt
		
		String name= "Altamash";
		
		char a=name.charAt(0);
		System.out.println(a);
		System.out.println(name.charAt(6));
		String edit=name.toUpperCase();
		System.out.println(edit);
		
		//contains
		
		System.out.println(name.contains("Alt"));
		System.out.println(name.contains("alt"));
		
		//equals and equalIgnorecase
		
		String name1= "Zaki";
		String name2= "zaki";
		
		System.out.println(name1.equals(name2)); //false
		System.out.println(name1.equalsIgnoreCase(name2));  //true
		
		//replace
		
		String ab= "Welcome to Python Programming";
		
		System.out.println(ab.replace("Python", "Java"));
		
		//substring
		
		System.out.println(ab.substring(0, 7)); //Welcome
		
		//split
		
		ab = "abc@gmail.com";
		
		String[] data=ab.split("@");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(Arrays.toString(data));
		
		ab= "%15,20,30";
		
		String value=ab.replace("%", "").replace(",", "");
		int l=Integer.parseInt(value);
		System.out.println(l);
		
		name= "aLTAMASH";
		name1=name.toLowerCase();
		System.out.println(name1); //altamash
		
		String ON= "Madam";
		String rev="";
		
		for(int i=ON.length()-1;i>=0;i--)
		{
			rev= rev+ON.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer m= new StringBuffer("Hello");
		m.append(" World");
		System.out.println(m);
		System.out.println(m.reverse());
		
		
		

	}

}
