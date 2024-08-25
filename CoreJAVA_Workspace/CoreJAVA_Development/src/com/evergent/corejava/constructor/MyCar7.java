package com.evergent.corejava.constructor;
class car{
	String color;
	int maxspeed;
	car(){
		color="white";
		maxspeed=20;
	}
	car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display() {
		System.out.println("color :"+color);
		System.out.println("maxspeed:"+maxspeed);
	}
}

public class MyCar7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car("red",50);
		c1.display();
		c2.display();
		
		

	}

}
