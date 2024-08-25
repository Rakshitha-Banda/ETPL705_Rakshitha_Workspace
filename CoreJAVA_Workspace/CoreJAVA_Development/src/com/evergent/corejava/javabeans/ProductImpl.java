package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		//initializing values through constructor
		Product product=new Product(10,"laptop",85000);
		//getting values through getter methods
		
System.out.println("product n0 :"+product.getPno());
System.out.println("Product name:"+product.getPname());
System.out.println("Product price:"+product.getPrice());
		
		

	}

}
