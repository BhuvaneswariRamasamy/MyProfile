package com.logic;
import java.util.Scanner;

public class MostFrequent {
	public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  System.out.println("The Most Frequent Digits are:");
  int s=sc.nextInt();
  int n,i;
  int array[]=new int[10];
  int input[]= {s};
  for(i=0;i<input.length;i++) {
	 while(input[i]!=0) {
		 n=input[i]%10;
		 array[n]=array[n]+1;
		 input[i]=input[i]/10;
	 }
  }
  int frequency=array[0],digit=0;
  for(i=1;i<array.length;i++) {
	  if(array[i]>frequency) {
		  frequency=array[i];
	  }
  }
  for(i=0;i<array.length;i++) {
	  if(frequency==array[i]) {
		  digit=i;
	  }
  }
//  return digit;
  System.out.println(digit);
  }
	
}

