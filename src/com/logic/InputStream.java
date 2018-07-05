package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class InputStream {
public static void main(String args[])throws Exception {
	File fl=new File("e:/testing.txt");
	FileReader fr=new FileReader(fl);
    int data=fr.read();
	String str="";
	while(data!=-1) {
		data=fr.read();
		System.out.println(((char)data));
	}
}
}
