package com.logic;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		String reverse = "";
		StringBuilder b = new StringBuilder();
		b.append(s);
		b = b.reverse();
		System.out.println("Reversed String is:" + b);
	}
}
