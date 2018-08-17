package com.logic;

public class PowerOfDigits {
public static void main(String[] args) {
	    int n = 5801;

       
		
       }
	   static int calculate(int n)
	    {
	        int sum = 0;
	        for(int i=0;i<n;i++) {
	        	for(int j=i+1;j<n;j++) {
	        
	        int bp = (int)Math.pow(i, j);
	        	
	        
	        while (bp != 0) {
	            int d = bp % 10;
	            sum += d;
	            bp /= 10;
	        }
	        	}
	        }
	        return sum;
	    }
	 
	   
	    
}



