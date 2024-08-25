package com.evergent.corejava.oops;

public class Has_A_RelationDemo {
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_A_RelationDemo has=new Has_A_RelationDemo();
		has.show();
		//Has-A relationship
		Person p=new Person();
		p.display();
		

	}

}
