package com.logic;

public class IsPalindrome {

	public boolean palindrome(int number) {
		String num=String.valueOf(number);
		boolean isEven=false;
		int length=num.length();
		if(length%2==0) {
			isEven=true;
	    }
		else {
			isEven=false;
		}
		int arr[]=new int[10];
	int numCopy=number;
	int r=0;
	while(numCopy!=0)
	{
	r=numCopy%10;
	arr[r]=arr[r]+1;
	numCopy=numCopy/10;
	}
	int flag=0;
	if(isEven) {
		for(int i=0;i<10;i++) {
			if(arr[i]%2==1) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("false");
		}else 
			System.out.println("true");
	}
		else {
			int oddNumberCount=0;
			for(int i=0;i<10;i++) {
				if(arr[i]%2==1) {
				oddNumberCount++;
				}
			}
		if(oddNumberCount==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		}
	return isEven;
   
	}

	public static void main(String args[]) {
		IsPalindrome p=new IsPalindrome();
		System.out.println(p.palindrome(56654));
	  
	}
}
