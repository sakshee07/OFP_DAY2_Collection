package com.bl.list;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {


	      LinkedList<String> list=new LinkedList<String>();
	      list.add("one");
	      list.add("two");
	      list.add("three");
	      list.add("six");
	      list.add("ten");

	     
	      list.removeFirst();
	      list.removeLast();
	      Iterator<String> iterator=list.iterator();
	      while(iterator.hasNext()){
	         System.out.print(iterator.next()+" ");
	      }

	     
	      list.remove(1);
	      System.out.print("\nAfter removing second element: ");
	      Iterator<String> iterator2=list.iterator();
	      while(iterator2.hasNext()){
	         System.out.print(iterator2.next()+" ");
	      }
	   }
}
