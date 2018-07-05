package com.logic;

import java.util.Scanner;

public class SimpleEncode {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split("\\s");
		int s2 = s1.length;
		int sum = 0;
		int arro[] = new int[s2];
		int arr[] = new int[s2];
		for (int i = 0; i < s2; i++) {
			arro[i] = Integer.parseInt(s1[i]);
			sum = sum + arro[i];

		}
		System.out.print("Encoded array={");

		int i;
		for (i = 0; i < s2; i++) {
			if (i != s2 - 1) {
				arr[i] = arr[i + 1] - arr[i];
			} else {
				arr[i] = arr[s2 - 1];
			}
			System.out.print(arr[i]);
			if (i < s2 - 1) {
				System.out.print(",");
			}

			System.out.print("}");
			System.out.println("");

			System.out.println("First number=" + arro[0]);
			System.out.println("Sum =" + sum);

		}
	}
}

