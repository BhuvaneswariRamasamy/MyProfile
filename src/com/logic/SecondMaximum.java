package com.logic;

public class SecondMaximum {

	public static void main(String args[]) {
		int arr[]= {4,5,6,4,3,8};
	int length=arr.length;
	int max=arr[0];
	int secondmax=0;
	for(int i=1;i<length;i++) {
		if(max<arr[i]) {
			
			secondmax=max;
			max=arr[i];
		}
		
	}
	System.out.println(max);
	System.out.println(secondmax);
	
	}
}
