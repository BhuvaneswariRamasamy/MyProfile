package com.logic;

import java.util.Scanner;

public class LongestSubArray {
public static void main(String args[]) {
	int[] a= {2, 7, 6, 1, 4, 5};
	int k=3;
	int sum=0;

	for( int i=1;i<a.length-1;i++) {
		if(a[i]>0) {
		sum=sum+a[i];
    }
	}
	System.out.println(sum);

}
}
