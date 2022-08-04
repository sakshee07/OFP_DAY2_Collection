package com.bl.set;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> values = new LinkedHashSet<Integer>();
		values.add(1);
		values.add(2);
		values.add(4);
		values.add(4);
		values.add(4);
		values.add(42);
		values.add(21);
		values.add(8);
		values.add(8);
		values.add(8);
		System.out.println("values after adding: " + values);

		values.remove(8);
		System.out.println("values after removing: " + values);
		
		for(Integer a : values) {
			System.out.println(a);
		}

	}
}
