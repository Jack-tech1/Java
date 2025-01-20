package Day1;

public class Swap_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Tea";
		String b= "Water";
		String temp;
		System.out.println("Value of a(Before): "+ a);
		System.out.println("Value of b(Before): "+b);
		temp=a;
		a=b;
		b=temp;
		
		
		
		System.out.println("Value of a(After): "+ a);
		System.out.println("Value of b(After): "+b);

	}

}
