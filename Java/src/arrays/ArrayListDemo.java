package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList myList = new ArrayList();
		
		myList.add(1);
		myList.add(1.5);
		myList.add('A');
		myList.add("Welcome");
		myList.add(null);
		myList.add(true);
		
		System.out.println(myList);
		
		System.out.println(myList.get(2)); //A
		
		System.out.println("Get First "+myList.getFirst());
		System.out.println("Get Last "+ myList.getLast());
		System.out.println("Contains "+ myList.contains('A'));
		System.out.println(" Size "+myList.size());
		System.out.println("Remove: "+ myList.remove(0));
		myList.add(0,"Java");
		System.out.println("Insert: "+ myList);
		
		for(Object x: myList)
		{
			System.out.println(x);
		}
		myList.set(0, "Python");
		
		System.out.println(myList);
		
		Iterator var=myList.iterator();
		
		while(var.hasNext())
		{
			System.out.println(var.next());
		}
		myList.clear();
		System.out.println("My List: "+ myList);
		

	}

}
