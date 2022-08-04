package com.bl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Practice1 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		LinkedList<String> linkedlist = new LinkedList<String>();  
		linkedlist.add("Ravi");  
		linkedlist.add("Vijay");  
		linkedlist.add("Ravi");  
		linkedlist.add("Ajay");  
		Iterator<String> itr = linkedlist.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}
