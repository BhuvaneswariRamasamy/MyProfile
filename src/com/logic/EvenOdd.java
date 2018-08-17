package com.logic;



public class EvenOdd {
public static void main(String args[]) {
	int m=0,n=0;
	int arr[]= {3,6,12,1,5,8};

	int length=arr.length;
	int a1[]=new int[length/2];
	int a2[]=new int[length/2];
	for(int i=0;i<length;i++) {
		if(arr[i]%2!=0) {
			a1[m]=arr[i];
			m++;
		}
		else {
			a2[n]=arr[i];
			n++;
		}
	}
	for(int i=0;i<length/2;i++) {
		System.out.print(a1[i]+","+a2[i]+",");
	}
}


}
