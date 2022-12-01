package com.snipe.learning.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String>  map = new HashMap<Integer, String>();
		map.put(10, "Mallikarjuna");
		map.put(20, "Ramesh");
		map.put(30, "Swamy");
		map.put(40,"Ahamed");
		
		System.out.println(map);
		
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<Integer, String> info = (Entry<Integer, String>)iter.next();
			System.out.println(info.getKey() + " :: "+ info.getValue());
		}
		
		for(Map.Entry<Integer, String> info: map.entrySet()) {
			System.out.println(info.getKey() + " :: "+ info.getValue());
		}
		
		map.forEach((k,v)->{System.out.println("key::"+k+ " :: " + "value ::"+v);});
		
		for(Integer key : map.keySet()) {
			System.out.println("keys::"+key);
		}
		
		for(String val : map.values()) {
			System.out.println("value::"+val);
		}
		
		map.entrySet().forEach(System.out::println);
		
		
		
	}

}
