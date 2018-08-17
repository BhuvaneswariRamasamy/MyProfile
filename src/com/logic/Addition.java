package com.logic;

import java.math.*;

public class Addition {
	public static void main(String args[]) {
		String s1 = "1234";
		String s2 = "-56";

		byte[] b = s1.getBytes();
		byte[] b1 = s2.getBytes();

		int sum = 1;
		int carry = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isAlphabetic(b[i])) {
				sum = 0;
				System.out.println("Error");
				break;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isAlphabetic(b1[i])) {
				sum = 0;
				System.out.println("Error");
				break;
			}
		}
		if (sum != 0) {
			Long i1 = Long.parseLong(s1);
			if (i1 < 0) {
				i1 = Math.abs(i1);
			}
			Long i2 = Long.parseLong(s2);
			if (i2 < 0) {
				i2 = Math.abs(i2);

			}
			System.out.println(i1 + i2);
		}
	}
}
