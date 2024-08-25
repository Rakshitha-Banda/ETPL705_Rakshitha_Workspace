package com.evergent.corejava.collection;

import java.awt.List;
import java.util.*;

public class CF6_ListIterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("ravi");
		list.add("ramu");
		list.add("balu");
		list.add("bhanu");
		ListIterator li=list.listIterator();
		li.add("welcome");
		li.add("hello");
		while(li.hasNext()) {
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("balu")) {
				li.remove();
			}
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		

	}

}
