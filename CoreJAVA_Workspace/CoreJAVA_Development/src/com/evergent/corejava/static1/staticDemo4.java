package com.evergent.corejava.static1;
//non-static methods can access static variables and static methods
public class staticDemo4 {
	static String name="India";
	static public void myData() {
		System.out.println("mydata");
	}
	public void show() {
		myData();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		myData();
		staticDemo4 s=new staticDemo4();
		s.show();
	}

}
