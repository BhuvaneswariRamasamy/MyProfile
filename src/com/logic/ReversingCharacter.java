package com.logic;

public class ReversingCharacter {
public static void main(String[] args) {
	String s= "India Is My Country";
	String[] ss=s.split(" ");

	//char ch[]=s.toCharArray();
    String s1="";
    int i;
	for(  i=0;i<ss.length;i++) {
		if(i==ss.length-1)
			s1=ss[i]+s1;
		else
			s1=" "+ss[i]+s1;
	
	}
	System.out.println(s1);
}
}