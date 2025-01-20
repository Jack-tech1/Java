package Day1;

public class Learn_Day1 {
	
	static int x=10;
	
	public Learn_Day1()
	{
		System.out.println("Without Parameter");
	}
	public Learn_Day1(int x)
	{
		System.out.println("With single Parameter");
	}
	public Learn_Day1(int x, int y)
	{
		System.out.println("With two Parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CH1();
		x=12;
		
		Learn_Day1 LD = new Learn_Day1();
		
		
		

	}
	
	public static void L1()
	{
        System.out.println("Hello");
		
		String a = "Hello ";
		String b= "world";
		
		String c = a+b;
		System.out.println(c);
	}
	
	public static void CH1()
	{
		System.out.println("Hi \nHello \nBye");
	}

}
