package com.profile;

public class BhuvanaProfile implements ProfileInterface {

	@Override
	public void myBasicInformation() {
	System.out.println(ProfileConstant.FIRST_NAME+"Bhuvana");
	System.out.println(ProfileConstant.FIRST_NAME+"Ramasamy");
	System.out.println(21);
	}
	@Override
	public void  myHobbies() {
		System.out.println("Gardening");
		System.out.println("Hearing Songs");
		}

}
