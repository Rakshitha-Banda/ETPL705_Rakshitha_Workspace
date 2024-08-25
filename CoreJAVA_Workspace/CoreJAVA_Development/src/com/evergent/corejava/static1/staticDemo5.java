package com.evergent.corejava.static1;
//static block
public class staticDemo5 {
	static {
		System.out.println("static block");
	}
	static String name="India";
	static public void myData() {
		System.out.println("mydata");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

}
