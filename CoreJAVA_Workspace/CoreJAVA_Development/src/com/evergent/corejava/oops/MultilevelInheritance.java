package com.evergent.corejava.oops;
class personData{
	public void mypersonData() {
		System.out.println("person data class method");
	}
}
class personInfo extends personData{
	public void mypersonInfo() {
		System.out.println("person info class method");
	}
}

public class MultilevelInheritance  extends personInfo{
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance m=new MultilevelInheritance();
		m.mypersonData();
		m.mypersonInfo();
		m.show();
		

	}

}
