package com.logic;
import java.util.Scanner;

public class Convention {
public static void main(String args[]) {
	 System.out.println("String to Array---");
	Scanner sc=new Scanner(System.in);
	 String r=sc.nextLine();	
	
	int result=Integer.parseInt(r);
	System.out.println(result);
	System.out.println("Integer to String---");
	int r1=sc.nextInt();
	String s=Integer.toString(r1);
	System.out.println(s);
//	System.out.println("Array to String---");
//	int[] num= {1,2,3,4,5};
//	System.out.println(num.toString());

}
}
