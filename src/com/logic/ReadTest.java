package com.logic;
import java. io. *;
public class ReadTest
{
 public static void main(String[] args)throws Exception
 {
  
   File fl = new File("e:/testing.txt");
   FileReader fr=new FileReader(fl);
   BufferedReader br = new BufferedReader(fr) ;
   String str;
   while ((str=br.readLine())!=null)
   {
    System.out.println(str);
   }
   br.close();
//   fl.close();
  }
 
}