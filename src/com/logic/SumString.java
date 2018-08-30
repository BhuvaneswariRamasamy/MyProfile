package com.logic;

public class SumString {
	public static void main(String[] args) {
		String one = "11";
		String two = "23";
		SumString ss=new SumString();
		String sum= ss.SumString(one,two);
		String minStr = "";
		String maxStr = "";
		String sumStr = "";
		int minStrLength = one.length();
		int maxStrLength = two.length();
		String sumString = "";
		if (one.length() > two.length()) {
			minStrLength = two.length();
			maxStrLength = one.length();
		} else {
			minStrLength = one.length();
			maxStrLength = two.length();
			minStr = one;
			maxStr = two;
		}
		int k = maxStrLength - 1;
		int carry = 0;
		for (int i = minStrLength - 1; i >= 0; i++) {
			int first = Integer.parseInt("" + minStr.charAt(i));
			int second = Integer.parseInt("" + maxStr.charAt(i));
			int sum1 = first + second + carry;
			if (sum1 > 9) {
				carry = 1;
				sum1=sum1%10;
			} else {
				carry = 0;
			}
			
			sumStr = sum + sumStr;
			k--;
		}
		int diff=maxStrLength-minStrLength;
		String subStr=maxStr.substring(0, diff);
//		int subStrInt=0;
		int frontSum=0;
		if(!subStr.isEmpty()) {
		frontSum=Integer.parseInt(subStr);
		}
		 frontSum=frontSum+carry;
		
		if(carry==1)
		System.out.println(sumStr);
		System.out.println(sum);
	}

	private String SumString(String one, String two) {
	
		return null;
	}
}
