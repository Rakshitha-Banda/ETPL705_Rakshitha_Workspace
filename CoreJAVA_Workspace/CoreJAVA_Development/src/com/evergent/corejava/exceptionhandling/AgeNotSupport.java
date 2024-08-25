package com.evergent.corejava.exceptionhandling;

class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String msg) {
		System.out.println(msg);
	}
}
public class AgeNotSupport {
	int age=10;
	public void myAge() throws AgeNotSupportException{
		if(age<18) {
			throw new AgeNotSupportException("age is below 18");
		}
		else {
			System.out.println("age is supported for voter card");
		}
	}

	public static void main(String[] args) {
		try {
		AgeNotSupport a=new AgeNotSupport();
		a.myAge();}
		catch(AgeNotSupportException e) {
			System.out.println(e);
		}

	}

}
