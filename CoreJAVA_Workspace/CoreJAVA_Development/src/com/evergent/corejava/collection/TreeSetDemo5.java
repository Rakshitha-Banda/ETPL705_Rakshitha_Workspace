package com.evergent.corejava.collection;

import java.util.*;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		TreeSet myset=new TreeSet();
		myset.add(100);
		myset.add(200);
		myset.add(50);
		myset.add(2);
		//myset.add("hi");
		//myset.add("hello");
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
