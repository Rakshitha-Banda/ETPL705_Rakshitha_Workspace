package com.evergent.corejava.collection;

import java.util.*;
public class CF8_LinkedList {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.add("tata");
		mylist.add("bmw");
		mylist.add("volvo");
		mylist.addFirst("maruthi");
		mylist.addLast("safari");
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
		
	}

}
