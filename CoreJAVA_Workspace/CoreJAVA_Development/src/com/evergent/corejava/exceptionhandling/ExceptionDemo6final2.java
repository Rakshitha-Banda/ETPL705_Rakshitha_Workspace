package com.evergent.corejava.exceptionhandling;
//try followed by either catch block or finally block
public class ExceptionDemo6final2 {

	String name="null";
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
	finally{
		System.out.println("finally block is close");
	}

	}

	public static void main(String[] args) {
		ExceptionDemo6final2 ed=new ExceptionDemo6final2();
		ed.myData();

	}

}
