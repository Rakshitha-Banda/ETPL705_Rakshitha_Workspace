package com.evergent.corejava.static1;
//static methods cannot access non-static methods and non-static variables 
public class staticDemo3 {

	static String name="India";
	static public void myData() {
		//show();
		System.out.println("mydata");
	}
	public void show() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		myData();

	}

}
