package com.evergent.corejava.oops;

public class Myclass extends Calculation{
	public void show() {
		System.out.println("show method class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass my=new Myclass();
		my.show();
		my.addition();

	}

}
