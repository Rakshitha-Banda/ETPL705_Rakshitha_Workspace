package com.evergent.corejava.exceptionhandling;
//All Exceptions are excecuted while abnormal condition only
//Normal flow it won't execute any exceptions
public class ExceptionDemo2 {
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
	catch(NullPointerException e) {
		System.out.println("I acn handle :"+e);
	}

	}

	public static void main(String[] args) {
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.myData();

	}

}
