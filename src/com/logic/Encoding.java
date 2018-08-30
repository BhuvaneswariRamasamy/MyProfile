package com.logic;

public class Encoding {
	public static void main(String[] args) {
		byte[] s = new byte[] { 1, 2, 3, 4 };
		String ss = new String(s);
		System.out.println(s[0]);
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i];
		}
		System.out.println(sum);
	}
}
