package com.evergent.corejava.exceptionhandling;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}

	}

}
