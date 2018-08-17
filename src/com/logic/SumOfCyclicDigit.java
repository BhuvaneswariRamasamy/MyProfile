package com.logic;

public class SumOfCyclicDigit {
	
public static void main(String[] args) {
	SumOfCyclicDigit scd=new SumOfCyclicDigit();
	System.out.println(scd.SumOfCyclicDigit(582109));
}

public long SumOfCyclicDigit(int number) {
	String num=String.valueOf(number);
	long sum=0;
	for(int i=0;i<num.length();i++) {
		for(int j=i;j<num.length();j++) {
			sum=sum+(num.charAt(j)-'0');
		}
	}
	return sum;
}
}
