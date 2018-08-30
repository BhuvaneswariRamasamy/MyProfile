package com.logic;
import java.util.Scanner;
public class Id {
	public static void main(String args[]) {
		String s1="bhuvanakeerthi1197@gmail.com";
		int d=0;
		
     if(s1.contains("@")) {
    	 
     
      if(s1.length()>=15&&s1.length()<=35) {
    	  String[] s=s1.split("@");
//    	  String s1[1]="redtape.com";{
    		  for(int i=0;i<s[0].length();i++) {
    			  int d1=Integer.parseInt(s[0]);
    			if(d1>=0&&d1<=9)  {
    				d1++;
    				System.out.println("yes");
    			}
    			
    		  else {
    				System.out.println("no");
    			}
    	  }
      }
      }
     }
	}

	

//for(int i=0;i<c.length;i++) {
//	if(c[i]==d) {
//		System.out.println("invalid");
//	}//else {
//		
//		if(c[i]>=15&&c[i]<=35) {
//			  char ch=(char) (c[i]/2);
//	          
//			
//			int m=1;
//			String a="S";
//			if(c[0].isLowerCase())
//			
//		}
//	}
//}

	


