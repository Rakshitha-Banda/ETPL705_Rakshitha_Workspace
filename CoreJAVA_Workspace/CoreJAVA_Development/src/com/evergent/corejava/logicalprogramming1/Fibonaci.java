package com.evergent.corejava.logicalprogramming1;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=a+b;
			System.out.print(a);
			a=b;
			b=sum;
		}

	}

}
