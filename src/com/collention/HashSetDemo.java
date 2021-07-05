package com.collention;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add(null);
		set.add("Java");
		set.add("Nine");
		set.add("python");
		set.add(null);
		set.add("Prog");
		set.add(null);

		for (String key : set) {

			System.out.println(key);
		}

	}

}
