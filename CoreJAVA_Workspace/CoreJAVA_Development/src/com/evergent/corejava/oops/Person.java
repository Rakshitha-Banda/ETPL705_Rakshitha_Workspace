package com.evergent.corejava.oops;

public class Person {

		// TODO Auto-generated method stub
		String Pname="Rakshitha";
		int Page=22;
		String Paddress="Nizamabad";
		public void display() {
			System.out.println("name is :"+Pname);
			System.out.println("age is :"+Page);
			System.out.println("address is :"+Paddress);
		}
		
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p=new Person();
			p.display();


	}

}
