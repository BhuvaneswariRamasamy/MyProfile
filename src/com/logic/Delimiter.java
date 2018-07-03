package com.logic;
import java. io. *;
import java.util.Scanner;
public class Delimiter
{
 public static void main(String[] args)throws Exception
 {
  
   File fl = new File("e:/testing.txt");
   FileReader fr=new FileReader(fl);
  Scanner sc=new Scanner(fr);
   sc.useDelimiter("\\Z");
   System.out.println(sc.next());
//   fl.close();
  }
 
}