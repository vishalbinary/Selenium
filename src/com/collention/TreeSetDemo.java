package com.collention;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		SortedSet<String> tree = new TreeSet<String>();
		// tree.add(null);
		tree.add("paul");
		tree.add("Ana");
		tree.add("ana");
		// tree.add(0);

		tree.add("Law");
		// tree.add("Nina");
		// tree.add(null);
		for (String key : tree) {
			System.out.println(key);
		}
	}

}
