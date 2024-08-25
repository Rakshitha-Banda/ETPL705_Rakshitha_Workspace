package com.evergent.corejava.test;



class Animal{
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
	}
}
class Dog extends Animal{
	private String breed;
	public Dog(String name,int age,String breed){
		super(name,age);
	
		this.breed=breed;
	}
	public void display() {
		super.display();
		System.out.println("breed is:"+breed);
	
}}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("buddy",5,"golden retriver");
		d.display();
		

	}

}

