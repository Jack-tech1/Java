package String_Exercises;

public class String_Puzzle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StringBuilder a= new StringBuilder("ABCBA");
		System.out.println(a); 
		StringBuilder b = new StringBuilder();

		for(int i = a.length()-1; i>=0;i--)
		{
			b.append(a.charAt(i)); 
		}
		System.out.println(b);
		
		if(a.equals(b))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}




	}

}
