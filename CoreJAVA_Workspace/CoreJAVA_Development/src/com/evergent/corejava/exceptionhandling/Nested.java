package com.evergent.corejava.exceptionhandling;

public class Nested {

	public static void main(String[] args) {
		int a=0;
		String s=null;
		try {
			
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			System.out.println(10/a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
				

	}

}
