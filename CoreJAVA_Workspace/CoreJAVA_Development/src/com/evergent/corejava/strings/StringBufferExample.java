package com.evergent.corejava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Initial String :"+sb);
		//Append a string
		sb.append(" World!");
		System.out.println("After append:"+sb);
		//Insert a string at a specific position
		sb.insert(6,"Beautiful ");
		System.out.println("After insert:"+sb);
		//Replace a substring you have to give starting index and ending index
		sb.replace(0, 5, "Hi");
		System.out.println("After replace :"+sb);
		//Delete a substring 
		sb.delete(0, 3);
		System.out.println("After delete:"+sb);
		//Reverse the String
		sb.reverse();
		System.out.println("after reverse:"+sb);
		//capacity or length
		System.out.println("capacity:"+sb.capacity());
		System.out.println("capacity:"+sb.length());
		
		

	}

}
