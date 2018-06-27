package com.logic;

import java.util.Scanner;

public class Equals {
	public static void main(String args[]) {
		String s = "Waiting to fAcE New Challenges ";

		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String r = s1[i];
			int Uppercount = 0;
			int LowerCount = 0;
			if (r.length() % 2 == 0) {
//				System.out.println(r);
			for (int k = 0; k < r.length(); k++) {
				if (Character.isUpperCase(r.charAt(k))) {
					Uppercount++;
				}
				if (Character.isLowerCase(r.charAt(k))) {
					LowerCount++;
				}
				
			}if(Uppercount==LowerCount) {
				System.out.println(r);
				
			}
			}

		}
	}
}
