package com.logic;

public class StringCode {
	public static int getLetterNo(char Letter) {
		return (int) Letter - 64;
	}

	public static int difference(int a, int b) {
		int d = Math.abs(a - b);
        return d;
	}
	public static void main(String args[]) {
		
		String input = "WORLD WIDE WEB";
		int count ;
		int n1, n2;
		int sum = 0;
		char c1;
		char c2;
		int center;
		int output = 0;
		String[] words = input.toUpperCase().split("\\s");
		String total ="";
		for (String w : words) {
			count=0;
			center = w.length() / 2;
			sum = 0;
			while (count < center) {
				c1 = w.charAt(count);
				c2 = w.charAt(w.length() - count - 1);
				count++;
				n1 = getLetterNo(c1);
				n2 = getLetterNo(c2);
				sum = sum + difference(n1, n2);
			}
			if (w.length() % 2 != 0)
				sum = sum + getLetterNo(w.charAt(center));
			total = total + sum;
		}
		output = Integer.valueOf(total);
		System.out.println(output);
	

	}
}
