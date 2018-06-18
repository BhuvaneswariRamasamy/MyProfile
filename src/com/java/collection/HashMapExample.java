package com.java.collection;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
public static void main(String args[]) {
	Map<String,Integer> map=new HashMap<String,Integer>();
	map.put("Bhuvana",11);
	map.put("Kowsi",31);
	map.put("Kokila",26);
    System.out.println("Map:"+map);
	Set<String> set=map.keySet();
	Collection<Integer> val=map.values();
	Iterator<String> iterKey=set.iterator();
	Iterator<Integer> iterVal=val.iterator();
	while(iterKey.hasNext()) {
		System.out.println(iterKey.next()+"=="+iterVal.next());
	}
	Integer keySet=map.get("Kowsi");
	System.out.println(keySet);
	Map<String,Integer> linkmap=new LinkedHashMap<String,Integer>();
	linkmap.put("Bhuvana",11);
	linkmap.put("Kowsi",31);
	linkmap.put("Kokila",26);
	System.out.println("linkmap:"+linkmap);
	TreeMap<String,Integer> treemap=new TreeMap<String,Integer>();
	treemap.put("Bhuvana",11);
	treemap.put("Kowsi",31);
	treemap.put("Kokila",26);
	treemap.put("Ezhil",10);
	treemap.put("Harshini",20);
	treemap.put("Harini",17);
	treemap.put("Gowri",25);
	System.out.println("Treemap:"+treemap);
	NavigableMap<String,Integer> navimap=treemap.headMap("Ezhil",true);
	System.out.println("Headmap:"+navimap);
	NavigableMap<String,Integer> navi1map=treemap.tailMap("Ezhil",false);
	System.out.println("TailMap:"+navi1map);
}
}
