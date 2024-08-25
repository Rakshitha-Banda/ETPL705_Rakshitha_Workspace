package com.evergent.corejava.oops;

public class MethodFlow {
	//No arguments with No return type
	public void display() {
		System.out.println("Hello");
	}
	//No arguments with  return type
	public int myChange() {
		return 20;
	}
	// arguments with No return type
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	//arguments with  return type
	public int myData(int a,int b) {
		return (a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow m=new MethodFlow();
		m.display();
		System.out.println(m.myChange());
		m.addition(4, 5);
		System.out.println(m.myData(2,3));

	}

}
