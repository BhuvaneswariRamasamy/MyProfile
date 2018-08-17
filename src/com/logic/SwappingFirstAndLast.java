package com.logic;

public class SwappingFirstAndLast {
public static void main(String[] args) {
	String s="geeks for geeks";
	char ch[]=s.toCharArray();
	char temp;
	for(int i=0;i<ch.length;i++) {
		int k=i;
		while(i<ch.length && ch[i]!=' ') {
			i++;
			temp=ch[k];
			ch[i-1]=ch[k];
			temp=ch[i-1];
			
		}
	
	}
	System.out.println(ch);
	}
}
