package com.evergent.corejava.exceptionhandling;

public class MyOutofMemory {

	public static void main(String[] args) {
		Integer[] array=new Integer[100000000*100000000];
		try {
		System.out.println(array);}
		catch(OutOfMemoryError e) {
			System.out.println("hi"+e);
		}
	}

}
