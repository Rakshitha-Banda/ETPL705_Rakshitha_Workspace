package com.evergent.corejava.collection;
import java.util.*;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
		myset.add(100);
		myset.add("hello");
		myset.add(45.5);
		myset.add(100);
		System.out.println(myset);
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
