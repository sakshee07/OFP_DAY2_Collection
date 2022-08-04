package com.bl.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {
		 LinkedHashSet<String> set1  = new LinkedHashSet<>();
		 set1.add("one");
		 set1.add("two");
		 set1.add("three");
		 set1.add("eleven");
		 set1.add("nine");
		 set1.add("five");

		 System.out.println("linkedhashset "+ set1);
			 
     TreeSet<String> treeSet = new TreeSet<>();
     
     treeSet.add("one");
     treeSet.add("two");
     treeSet.add("three");
     treeSet.add("eleven");
     treeSet.add("nine");
     treeSet.add("five");
     
     System.out.println("treeset" + treeSet);
     
     HashSet<String> hashSet = new HashSet<String>();
     hashSet.add("one");
     hashSet.add("two");
     hashSet.add("three");
     hashSet.add("eleven");
     hashSet.add("eleven");
     hashSet.add("eleven");
     hashSet.add("nine");
     hashSet.add("five");
     
     System.out.println("hashset "+ hashSet);

	}
}
