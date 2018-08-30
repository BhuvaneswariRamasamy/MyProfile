package com.logic;

public class DigitSum {
public static void main(String args[]) {
int input1=568, n,sum1=0,sum2=0,sum3=0;
int count=0;
if(input1<0) {
	input1=Math.abs(input1);
	count++;
}
 while(input1>0) {
	n=input1%10;
	sum1=sum1+n;
	input1=input1/10;
 }
 while(sum1>0) {
	n=sum1%10;
	sum2=sum2+n;
	sum1=sum1/10;
 }
 while(sum2>0) {
	n=sum2%10;
	sum3=sum3+n;
	sum2=sum2/10;
 }
 if(count==1) {
	sum3=-sum3;
 }
System.out.println(sum3);
}
}
