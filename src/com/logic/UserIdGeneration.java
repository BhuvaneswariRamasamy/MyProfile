package com.logic;

public class UserIdGeneration {
	public static void main(String args[]) {

		String FirstName = "manoj";
		String LastName = "Kumar";
		int PinNumber = 636012;
		int Number = 5;
		int pinLength=Integer.toString(PinNumber).length();
		String smaller="";
		String larger="";
		if (Number >= pinLength) {
			System.out.println("ERROR");
		}
		int l1 = FirstName.length();
		int l2 = LastName.length();
		System.out.println("Length of the String:" + l1);
		System.out.println("Length of the String:" + l2);
       
//		String s = String.valueOf(l1);
//		String s1 = String.valueOf(l2);
        if(l1<l2) {
		        	 smaller=FirstName;
		         larger=LastName;
		        }
        else if(l1>l2) {
        	 smaller=LastName;
        	 larger=FirstName;
        }else {
		int b = FirstName.compareTo(LastName);
		if (b < 0) {
			
		smaller=FirstName;
		larger=LastName;
		}
		if (b > 0) {
			
			smaller=LastName;
			larger=FirstName;
		}
        }
		char last = smaller.charAt(smaller.length() - 1);
		System.out.println(last);
		
		String d = String.valueOf(PinNumber);
		char l = d.charAt(Number);
		System.out.println(l);
		StringBuilder str = new StringBuilder(d);
		StringBuilder u=str.reverse();
		char r = str.charAt(Number);
		System.out.println(r);
		String an = last + FirstName;
		System.out.println("The Id:" + an);
        char[] ch = larger.toCharArray();
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				ch[i]= Character.toUpperCase(ch[i]);
			}
			if (Character.isUpperCase(ch[i])) {
				ch[i]= Character.toLowerCase(ch[i]);
			}
		}
		String s1=String.valueOf(ch);
		if(Character.isLowerCase(last)) {
			 last=Character.toUpperCase(last);
		}else {
			last=Character.toLowerCase(last);
		}
		String f = last+s1+ l + r;
		System.out.println(f);
	}

}
