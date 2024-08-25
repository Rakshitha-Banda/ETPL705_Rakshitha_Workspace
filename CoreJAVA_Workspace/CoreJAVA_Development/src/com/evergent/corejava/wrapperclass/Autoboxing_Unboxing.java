package com.evergent.corejava.wrapperclass;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		//autoboxing of characters
		char ch='a';
		Character my=new Character(ch);
		//auto unboxing of characters
		char ch1=my.charValue();
		System.out.println("value ch:"+ch);
		System.out.println("value if gfg:"+my);

	}

}
