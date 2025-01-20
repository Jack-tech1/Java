package String_Exercises;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("Zaki");
		builder.append(" Inam");
		System.out.println(builder);
		builder.insert(9, " Cricketer");
		System.out.println(builder);
		builder.replace(6, 8, "@#$");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder.charAt(2));
		System.out.println(builder.length());
		System.out.println(builder.substring(5));
		System.out.println(builder.substring(1, 3));
		builder.setCharAt(0, 'J');
		System.out.println(builder);

	}

}
