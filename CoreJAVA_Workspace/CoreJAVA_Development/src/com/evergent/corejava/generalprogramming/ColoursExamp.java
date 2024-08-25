package com.evergent.corejava.generalprogramming;

import java.awt.Color;

public class ColoursExamp {

		enum Color{
			RED,GREEN,BLUE;}
		enum News{
			North,East,West,South;}
		enum Abcproduct{
			Laptops,Desktops,Tabs;}
		enum Days{
			M,T,W,Tue,F,Sunday;}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c=Color.RED;
		System.out.println(c);
		News s=News.North;
		System.out.println(s);
		Abcproduct p=Abcproduct.Laptops;
		System.out.println(p);
		

	}

}
