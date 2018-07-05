package com.logic;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAsString {
public static String readFile(String FileName)throws Exception{
	String data="";
	data=new String(Files.readAllBytes(Paths.get(FileName)));
	return data;
}
public static void main(String args[])throws Exception {
	String data=readFile("E:/testing.txt");
	System.out.println(data);
}
}
