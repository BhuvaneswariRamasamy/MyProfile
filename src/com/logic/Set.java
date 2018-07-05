package com.logic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String args[]) {
		HashSet<String> names = new HashSet<String>();
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(4, 7, 8, 5, 6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(7));
		names.add("Tom");
		names.add("Mary");
		names.add("Ram");
		names.add("Bhuvana");
		// To print elements in the Set
		System.out.println(names);
		// To print the size of the set
		System.out.println("The size of the Set is:" + names.size());
		// To check the Set is empty or not
		if (names.isEmpty()) {
			System.out.println("The Set is Empty");
		} else {
			System.out.println("The Set is not Empty");
		}
		// To check whether the elements is contained or not
		if (names.contains("Bhuvana")) {
			System.out.println("Bhuvana is contained in the Set");
		} else
			System.out.println("Bhuvana is not contained in the Set");
		// To add a element in a set
		if (names.add("Toffy")) {
			System.out.println("Toffy is added to the set");
		}
		// To remove a element in a set
		if (names.remove("Ram")) {
			System.out.println("Ram is removed in the set");
		}
		// Subset Operation
		if (s1.containsAll(s2))
			System.out.println("s1 is subset of s2");
		else
			System.out.println("s1 is not a subset of s2");
		// union operation
		if (s1.addAll(s2)) {
			System.out.println("s1 is Union of s2:" + s1);
		} else
			System.out.println("s1 is not Union of s2:" + s1);
		// Intersection operation
		if (s1.retainAll(s2)) {
			System.out.println("s1 is Intersection of s2:" + s1);
		} else
			System.out.println("s1 is not a Intersection of s2");
		// Difference operation
		if (s1.removeAll(s2))
			System.out.println("s1 with difference of s2:" + s1);
		// For each loop
		names.forEach(System.out::println);
		// enchanced for loop
		for (String name : names) {
			System.out.println(name);
		}
		// To print elements Line by Line
		Iterator iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
			// if (!names.add("Tom")) {
			// System.out.println("Tom is already added to the set");
			// }
		}
	}
}
