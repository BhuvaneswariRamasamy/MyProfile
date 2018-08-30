package com.logic;

public class Prime {
	public static void main(String args[]) {
		int n = 20;
		int[] arr = new int[5];

		int m = 0, z = 0, max = 0,max1=0,p=0;
		int sum = 0;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				arr[m] = i;
				System.out.println("prime factor:" + arr[m]);
				m++;
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				int array[] = new int[count];
				array[z] = arr[i];
				if (max < array[z]) {
					max = array[z];
				}
				z++;
				
				sum = sum + arr[i];
			}
		}
		System.out.println("The sum of Prime Number is:"+sum);
	System.out.println("max:"+max);
}
}
