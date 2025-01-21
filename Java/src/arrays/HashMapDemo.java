package arrays;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		
		HM.put(1, "Warner");
		HM.put(2, "Finch");
		HM.put(3, "Smith");
		HM.put(4, "Maxwell");
		HM.put(5, "Smith");
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		System.out.println(HM.entrySet());
		
		for(Object a:HM.keySet())
		{
			System.out.println("A: "+a + HM.get(a));
		}
		
		
		
		

	}

}
