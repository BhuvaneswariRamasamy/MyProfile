package com.logic;

import java.util.Scanner;

public class IntergerOrString {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	String s=sc.nextLine();
	String s="f6789";
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			System.out.println("The given is a Integer");
			break;
		}
		else
			System.out.println("The given is a Character");
	}
}
}
