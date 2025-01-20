package Day1;

import java.util.Random;

public class Random_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		int a= rd.nextInt(10)+1;
		System.out.println(a);
		
		double d = rd.nextDouble();
		System.out.println(d);
		
		boolean b = rd.nextBoolean();
		System.out.println(b);

	}

}
