package com.logic;

public class Pin {
public static void main(String[] args) {
	String sentence="Wipro technologies";
	String[] s=sentence.split("");
	
	int sum=0;
	for(String w:s) {
	//System.out.println(w);
		int l1=w.length();
		sum=sum+l1;
	}
	int s1=0;
	int s2=0;
	while(sum!=0) {
		s1=sum%10;
		 s2=s2+s1;
		 sum=sum/10;
	}
	
	System.out.println(s2);
}
}
