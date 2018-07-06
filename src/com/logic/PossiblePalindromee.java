package com.logic;

import java.util.ArrayList;
import java.util.Scanner;


	public class PossiblePalindromee {
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			int count = 0, num = 0;
			ArrayList<String> list = new ArrayList<String>();
			String s = scanner.nextLine();
			int inputLength=s.length();
			StringBuffer str = new StringBuffer(s);
			
			StringBuffer s1 = new StringBuffer(str.reverse().toString());
			
			if (s.toString().equals(s1.toString())) {
				System.out.println(inputLength);
			}
			else if (!s.toString().equals(s1.toString())) {
				// System.out.println("false");

				char ch[] = s.toCharArray();
				int length = s.length();
				for (int i = 0; i < length; i++) {
					for (int j = 0; j < length; j++) {
						if (ch[i] == ch[j]) {
							count++;

						}
						if (count >= 2) {

							list.add(Character.toString(ch[i]));
							count = 0;
						}

					}
					count = 0;
				}
				//System.out.println(list);
				// System.out.println(list.size());
				String ch1[] = list.toArray(new String[list.size()]);
				int array[] = new int[ch1.length];
				int count1 = 0;
				for (int i = 0; i < ch1.length; i++) {
					for (int j = 0; j < ch1.length; j++) {
						if (ch1[i].equals(ch[j])) {
							count1++;
						}
					}
					array[i] = count1;
				}
				for (int i = 1; i < array.length; i++) {
					if (array[0] == array[i])
						num++;
				}
				if (num + 1 == list.size()) {
					System.out.println(list.size() + 1);
				}
			}
			else {
				System.out.println("-1");
			}
		}
}
