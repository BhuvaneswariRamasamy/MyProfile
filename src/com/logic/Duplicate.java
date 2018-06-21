package com.logic;
import java.util.Scanner;

public class Duplicate {
            public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the line:");
			String words = sc.nextLine();
			String s = words.toLowerCase();
			String[] s1 = s.split("\\s");
			int count = 0;
			for (int i = 0; i < s1.length; i++) {
			count = 0;
				for (int j = 0; j < s1.length; j++) {
					if (s1[i].equals(s1[j])) {
						count++;
					}

				}
			}
			if (count > 1) {
				System.out.println(count);
			}
		}
	}

