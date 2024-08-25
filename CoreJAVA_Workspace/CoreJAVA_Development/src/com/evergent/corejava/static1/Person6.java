package com.evergent.corejava.static1;

public class Person6 {
	static String name="rakshitha";
	//String name="rakshitha";
	int age=22;
	String address="hyderabad";
	public void display() {
		name="welcome";
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p=new Person6();
		System.out.println(p.name);
		p.display();
		Person6 p1=new Person6();
		System.out.println(p1.name);
		p1.display();
		
		

	}


	}


