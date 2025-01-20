package Day2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Switch1();
		Switch2();

	}
	
	public static void Switch1()
	{
		String day = "Friday";

		switch(day)
		{
		case "Sunday": System.out.println("Today is Sunday");
		break;
		case "Monday": System.out.println("Today is Monday");
		break;
		case "Tuesday": System.out.println("Today is Tuesday");
		break;
		case "Wednesday": System.out.println("Today is Wednesday");
		break;
		case "Thursday": System.out.println("Today is Thursday");
		break;
		case "Friday": System.out.println("Today is Friday");
		break;
		case "Saturday": System.out.println("Today is Saturday");
		break;
		}
	}
	
	public static void Switch2()
	{
		int age=7;
		switch(age)
		{
		case 5: System.out.println("Primary School");break;
		case 10: System.out.println("Middle School");break;
		case 13: System.out.println("High School");break;
		default: System.out.println("Invalid Match");
		}
	}

}
