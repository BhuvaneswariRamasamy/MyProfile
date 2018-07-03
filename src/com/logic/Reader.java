package com.logic;
import java. io. *;
public class Reader
{
 public static void main(String[] args)throws Exception
 {
  
   File fl = new File("e:/testing.txt");
   FileReader fr=new FileReader(fl);
   BufferedReader br = new BufferedReader(fr) ;
   int str;
   while ((str=br.read())!=-1)
   {
    System.out.println((char)str);
   }
   br.close();
//   fl.close();
  }
 
}