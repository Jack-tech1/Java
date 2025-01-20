package String_Exercises;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Madamm";
		/*
		 * String rev =""; int len = name.length();
		 * 
		 * for(int i=len-1;i>=0;i--) { rev= rev+name.charAt(i); //madam
		 * 
		 * } System.out.println(rev); if(name.equalsIgnoreCase(rev)) {
		 * System.out.println("Its a Palindrome"); } else {
		 * System.out.println("Not a palindrome");
		 * 
		 * }
		 */
		
		StringBuffer sf = new StringBuffer(name);
		System.out.println(sf.reverse());

	}

}
