package com.profile;

public  class Test {
	public  static void printProfile(ProfileInterface profile)
	{
		profile.myBasicInformation();
		profile.myHobbies();
	}
public static void main(String args[]) {
  ProfileInterface myProfile=new BhuvanaProfile();
  ProfileInterface myProfile1=new KowsalyaProfile();
  printProfile(myProfile);
  printProfile(myProfile1);
}
}
