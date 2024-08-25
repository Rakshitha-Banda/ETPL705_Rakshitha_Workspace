package com.evergent.corejava.abstract1;
 //we can create constructor for abstract classes
abstract public class Product3 {
	public Product3() {
		System.out.println("Product3 abstract class constructor");
	}
	String cName="India";
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("ALl products");
	}

}
