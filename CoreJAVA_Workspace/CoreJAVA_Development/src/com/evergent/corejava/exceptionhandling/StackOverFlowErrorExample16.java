package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample16 {

	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("stackoverflowerror caught:"+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
