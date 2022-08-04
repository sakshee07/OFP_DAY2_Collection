package com.bl.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("seven", 7);
		
		for(Map.Entry<String, Integer> a :map.entrySet())
		System.out.println("value : "+a.getKey()+ ", "+"keys :" + a.getValue());

		Map<String, Integer> map1= new LinkedHashMap<>();
	  	map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		map1.put("seven", 7);
		
		 for (Map.Entry<String, Integer> e : map.entrySet())
			 System.out.println(e.getKey() + e.getValue());
		 
		  Map<String, Integer> map3 = new TreeMap<>();
		  map3.put("one", 1);
			map3.put("two", 2);
			map3.put("three", 3);
			map3.put("seven", 7);
			
		for (Map.Entry<String, Integer> z: map.entrySet())
			System.out.println(z	.getKey() + z.getValue());
	}  
}
