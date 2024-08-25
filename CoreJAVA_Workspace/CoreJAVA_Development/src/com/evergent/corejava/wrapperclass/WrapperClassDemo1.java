package com.evergent.corejava.wrapperclass;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		//Auto data types objects
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		//objects data convert into data types
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
