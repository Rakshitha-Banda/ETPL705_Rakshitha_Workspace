package com.evergent.corejava.strings;

import java.util.Arrays;

public class StringPerformance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name="JavaTechnologies";
	String str=Arrays.toString(name.toCharArray());
	System.out.println(str);
	System.out.println(name.indexOf('T'));
	System.out.println("    Java       ".strip());
	System.out.println("    Java       ".strip().length());//Remove spaces same like trim
		

	}

}
