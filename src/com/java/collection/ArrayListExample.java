package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class ArrayListExample {
public static void main(String args[]) {
	List<String> List=new ArrayList<String>();
	List.add("one");
	List.add("two");
	List.add("three");
	List.add("one");
	System.out.println(List.toString());
	List<String> LinkedList=new LinkedList<String>();
	LinkedList.add("one");
	LinkedList.add("two");
	LinkedList.add("three");
	LinkedList.add("one");
	System.out.println(LinkedList.toString());
	Set<String> set=new HashSet<String>();
	set.add("one");
	set.add("two");
    set.add("three");
    System.out.println(set.toString());
    Set<String> setone=new HashSet<String>(List);
    System.out.println(setone.toString());
    LinkedHashSet<String> Linkedset=new LinkedHashSet<String>();
    for(int i=0;i<5;i++) {
    	Linkedset.add("two "+i);
    }
    System.out.println(Linkedset.toString());
    TreeSet<String> treeset=new TreeSet<String>();
    treeset.add("bhuvana");
    treeset.add("kowsi");
    treeset.add("kokila");
    treeset.add("harini");
    treeset.add("ezhil");
    treeset.add("gowri");
    treeset.add("harshini");
    System.out.println(treeset.toString());
    NavigableSet<String> naviset=treeset.headSet("harini",true);
    System.out.println(naviset.toString());
    NavigableSet<String> navi1set=treeset.tailSet("harini",false);
    System.out.println(navi1set.toString());
	
}
}
