package com.logic;

import java.util.Scanner;

public class PossibleWords {
	String input1, input2;
		
	
		public static void identifyPossibleWords(String input1, String input2) {
			
			int input1Len = input1.length();
			String i1[] = input1.split("_");// split the 1st string
			String arr[] = input2.split(":");// split the 2nd string
			int length = arr.length;
			int arr1[] = new int[length];
			for (int i = 0; i < arr1.length; i++) {
			int arrLength = arr[i].length();
				arr1[i] = arrLength;
				if (input1Len == arr1[i]) {// check first string length is equal to second string length
				if (i1.length == 1) {
					if (arr[i].startsWith(i1[0]) | arr[i].endsWith(i1[0])) {
							arr[i] = arr[i].toUpperCase();
						 System.out.print(arr[i]+":");
						}
					} else if (i1.length == 2) {
					if (arr[i].startsWith(i1[0]) & arr[i].endsWith(i1[1])) {
							arr[i] = arr[i].toUpperCase();
							System.out.print(arr[i]);
							System.out.print(":");
//							System.out.println(arr[i].charAt(arr[i].length()-1));
//							arr[i]=arr[i].substring(0, arr[i].length()-1);
//							System.out.print(arr[i]);
							
						}
					}

					else {
						System.out.println("ERROR-009");
				}
	
					
			}
			 
	
		}int i=0;
			 String array=arr[i];
				array = arr[i].substring(0, arr[i].length()-0); 
				System.out.print(array);
	
		}
	
		public static void main(String args[]) {
			PossibleWords possible = new PossibleWords();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1st strings:");
			String input1 = scanner.next().toLowerCase();
			System.out.println("Enter 2nd strings:");
			String input2 = scanner.next().toLowerCase();
//			String input1= input1.toLowerCase();
		    PossibleWords. identifyPossibleWords(input1, input2);
//		    PossibleWords.deleteCharAt(arr[i].length-1);
	 }
}
