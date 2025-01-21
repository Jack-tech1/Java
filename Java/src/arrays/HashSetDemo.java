package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> mySet = new HashSet<String>();
		
		mySet.add("Jack");
		mySet.add("Jack");
		mySet.add("100");
		mySet.add("0.5");
		mySet.add("null");
		mySet.add("null");
		mySet.add("C");
		
		System.out.println(mySet);
		
		mySet.add("ABC");
		
		System.out.println(mySet);
		mySet.remove("ABC");
		System.out.println(mySet);
		
		for(Object x: mySet)
		{
			System.out.println(x);
		}
		
		ArrayList al = new ArrayList(mySet);
		
		System.out.println(al.get(0));
	}

}
