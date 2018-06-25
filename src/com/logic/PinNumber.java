package com.logic;
import java.util.Arrays;
import java.util.Scanner;

public class PinNumber {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int s=sc.nextInt();
	System.out.println("Enter the second number:");
	int s1=sc.nextInt();
	System.out.println("Enter the third number:");
	int s2=sc.nextInt();
	int a=0,a1=0,a2=0;
	int b=0,b1=0,b2=0;
	int c=0,c1=0,c2=0;
	a=s%10;
	a1=s1%10;
	a2=s2%10;
	System.out.println(a);
	System.out.println(a1);
	System.out.println(a2);
	c=s/100;
	c1=s1/100;
	c2=s2/100;
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
	b=s/10;
	b=b%10;
	b1=s1/10;
	b1=b1%10;
	b2=s2/10;
	b2=b2%10;
	System.out.println(b);
	System.out.println(b1);
	System.out.println(b2);
	if((a<a1&a<a2)&&(b<b1&b<b2)&&(c<c1&c<c2)) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	if((a1<a&a1<a2)&&(b1<b&b1<b2)&&(c1<c&c1<c2)) {
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
	}
	if((a2<a&a2<a1)&&(b2<b&b2<b1)&&(c2<c&c2<c1)) {
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
	}
	int arr[]={a,a1,a2,b,b1,b2,c,c1,c2};
	Arrays.sort(arr);
	int max=arr[0];
	for(int z=1;z<arr.length;z++) {
		if(max<arr[z]) {
			max=arr[z];
		}	
		}
	System.out.println(max);
	}
}
