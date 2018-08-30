package com.logic;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
public static void main(String args[]) {
	List l1=new ArrayList();
	l1.add(0,1);
	l1.add(1,23);
	System.out.println(l1);
	List l2=new ArrayList();
    l2.add(0,32);
    l2.add(1,12);
    l2.add(2,3);
    System.out.println(l2);
    //addAll with (index,collection)
    l1.addAll(2, l2);
    System.out.println(l1);
    //remove method
    l1.remove(0);
    System.out.println(l1);
    //to get specfied index position
    System.out.println("Index position at 2="+l2.get(2));
    List<String> list=new ArrayList<String>();
    list.add("Bhuvana");
    list.add("is a good");
    list.add("girl");
    list.add("girl");
    System.out.println(list.indexOf("girl"));
    List<String> range=new ArrayList<String>();
    range=list.subList(0, 3);
    System.out.println("Range:"+range);
}
}
