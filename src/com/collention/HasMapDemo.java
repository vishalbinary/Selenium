package com.collention;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMapDemo {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(22, "vishal");
		map.put(5, "crystal");
		map.put(7, "deepak");
		map.put(90, "king");
		map.put(26, "Paul");
		map.put(31, "Sunny");
		map.put(26, "Sourabh");
		map.put(26, "Dr. B");
		Set<Map.Entry<Integer,String>>entry=map.entrySet();
		
		//Set<Map.Entry<Integer, String>> entry = map.entrySet();
		for (Entry<Integer, String> key : entry) {
			key.getKey();
			key.getValue();
			
			System.out.println("Key is:" + key.getKey() + "  values is:: " + key.getValue());
		}

	}

}
