package com.evergent.corejava.logicalprogramming1;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghijklmnopqrstuvwxyz";
		int i=0;
		int j=2;
		System.out.print(s.charAt(i)+""+s.charAt(j)+",");
		while(j<24) {
			System.out.print(s.charAt(j-1)+""+s.charAt(j+2)+",");
			j=j+2;
			
		}
		System.out.println(s.charAt(j-1)+""+s.charAt(j+1));

	}

}
