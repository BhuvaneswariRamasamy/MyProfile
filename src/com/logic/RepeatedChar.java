package com.logic;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<Character>();
		String ss = sc.next();
	
		for (int i = 0; i < ss.length(); i++) {
			set.add(ss.charAt(i));
		}
		System.out.println(set.size());
	}
}
