package String_Exercises;

public class Junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "!@#Java%^&*Testing";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
