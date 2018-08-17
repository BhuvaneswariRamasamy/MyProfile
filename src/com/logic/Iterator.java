package com.logic;

public class Iterator {
	int array[]= {1,2,3,4};
	int currentElement=0;
	boolean hasElement=true;

 public boolean hasNext() {
	        currentElement++;
	        if(array.length!=0&&currentElement!=array.length+1) {
	            return hasElement;
	        }
	    
	return false;
	 
 }
 public Integer next() {
	return array[currentElement-1];
	 
 }
 public static void main(String[] args) {
	Iterator iterator=new Iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}

