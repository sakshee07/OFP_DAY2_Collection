package com.bl.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String>ab = new ArrayList<>();
		ArrayList<String>ac = new ArrayList<>();
		ab.add("one");
		ab.add("two");
		ab.add("three");
		ab.add("four");
		ab.add("five");
		for(String value:ab) {
			System.out.println("elemenst of ab : "+ value);
		}

		System.out.println("number of elemets in list = "+ab.size());
		
		
		ab.add(5, "six");
		for(String value1: ab) {
			System.out.println("after adding ab " +value1);
		}
		
		ab.remove(5);
		for(String value3: ab) {
			System.out.println("after removing now ab " +value3);
		}
		
		Collections.sort(ab);
		for(String value4: ab) {
			System.out.println("sorted " +value4);
		}
		
 	}
}
