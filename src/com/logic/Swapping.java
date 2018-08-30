package com.logic;

public class Swapping {
public static void main(String[] args) {
	int t=15;
	int f=10;
	int temp;
//	temp=t;
//	t=f;
//	f=temp;
	t=t+f;
	f=t-f;
	t=t-f;
	System.out.println(t);
	System.out.println(f);
	//System.out.println(temp);
}
}
