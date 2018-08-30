package com.logic;

import java.util.LinkedList;
import java.util.List;

public class NewPrime {
	    public static void main(String[] args) {
	       
	    int count=0,m=0,count1=0,max=0,max2=0;
	    int n=20;
	    for(int i=2;i<n;i++) {
	        if(n%i==0) {
	            count++;
	        }
	    }
	    System.out.println(count);
	    int array[]=new int[count];
	    for(int i=2;i<n;i++) {
	        if(n%i==0) {
	            array[m]=i;
	            System.out.print(array[m]+" ");
	            m++;
	           
	        }
	    }
	    List<Integer> list=new LinkedList<Integer>();
	    List<Integer> list1=new LinkedList<Integer>();
	    for(int i=0;i<array.length;i++) {
	        for(int j=1;j<=array[i];j++) {
	            if(array[i]%j==0) {
	                count1++;
	            }
	        }
	        if(count1==2) {
	            list.add(array[i]);
	            count1=0;
	            if(max<array[i] ){
	                max=array[i];
	            }
	        }
	        else {
	            list1.add(array[i]);
	            count1=0;
	            if(max2<array[i] ){
	                max2=array[i];
	            }
	        }
	    }
	    System.out.println(list);
	    System.out.println(list1);
	    System.out.println(max);
	    System.out.println(max2);
	   
	    }



}
