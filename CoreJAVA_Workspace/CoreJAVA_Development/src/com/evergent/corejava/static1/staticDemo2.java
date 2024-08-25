package com.evergent.corejava.static1;
//static methods can access static methods and static variables
public class staticDemo2 {
	static String name="India";
	static public void myData() {
		System.out.println("mydata");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		myData();
		

	}

}
