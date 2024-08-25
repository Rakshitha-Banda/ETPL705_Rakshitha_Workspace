package com.evergent.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_Hashset_Generics {
	public static void main(String[] args) {
		HashSet<String> myset=new HashSet<>();
		myset.add("hi");
		myset.add("hello");
		myset.add("welcome");
		myset.add("rakshitha");
		System.out.println(myset);
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
