package com.collention;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2, "Swati");
		map.put(26, "Jin");
		map.put(21, "Paul");
		map.put(1, "Eddey");
		map.put(8, "Anna");
		map.put(66, "Eddey");
		map.put(0, "Gon");
		map.remove(0);
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		for (Map.Entry<Integer, String> key : entry) {
			System.out.println("key is: " + key.getKey() + " value is: " + key.getValue());
		}

	}

}
