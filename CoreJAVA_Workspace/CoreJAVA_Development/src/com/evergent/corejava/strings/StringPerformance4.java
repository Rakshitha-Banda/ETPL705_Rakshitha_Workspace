package com.evergent.corejava.strings;

public class StringPerformance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder);

	}

}
