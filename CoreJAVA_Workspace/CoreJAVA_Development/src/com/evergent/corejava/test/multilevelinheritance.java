package com.evergent.corejava.test;

class person{
	public void data() {
		System.out.println("my");
	}
}
class animal extends person{
	public void data1(){
	System.out.println("my1");}
}

public class multilevelinheritance extends animal{
	public void data2() {
		System.out.println("data3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevelinheritance mi=new multilevelinheritance();
		mi.data();
		mi.data1();
		mi.data2();

	}

}
