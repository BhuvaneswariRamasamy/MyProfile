package com.logic;
import java.lang.*;
import java.util.Properties;
 
public class Properties2 {
	
	public class NewClass
	{
	    public void main(String[] args)
	    {
	 
	        /* Use of getProperties() method
	            System class refers to the JVM on which you are compling your JAVA code
	            getProperty fetches the actual properties
	            that JVM on your Sysytem gets from your Operating System
	        */
	 
	        System.out.println("Following are the JVM information of your OS :");
	        System.out.println("");
	         
	        // Property Object
	        Properties jvm = System.getProperties();
	        jvm.list(System.out);
	    }
	}
}
