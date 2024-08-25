package com.evergent.corejava.strings.immutable;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person=new PersonImmutable("rakshitha",20);
		System.out.println("Name:"+person.myName());
		System.out.println("Age:"+person.myAge());


	}

}
