package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	//constructor
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//copy constructor
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void display() {
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 s1=new Student9("bhanu",20);
		Student9 s2=new Student9(s1);
		s1.display();
		s2.display();
		

	}

}
