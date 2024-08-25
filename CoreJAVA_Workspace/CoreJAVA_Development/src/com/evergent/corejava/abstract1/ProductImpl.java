package com.evergent.corejava.abstract1;
//if you will not override the abstract method you have to make the class as abstract 
//because it internally consist of abstract method
//abstract public class ProductImpl extends Product{
public class ProductImpl extends Product{
	public void newProduct() {
		System.out.println("My new Product");
	}
	public void show() {
		System.out.println("Local methods of product Impl class");
	}
	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
