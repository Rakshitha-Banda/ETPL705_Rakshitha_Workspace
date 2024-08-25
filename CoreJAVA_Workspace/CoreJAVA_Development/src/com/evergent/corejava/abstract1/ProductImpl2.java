package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product {

	public void newProduct() {
		cName="welcome";
		//by default variables in abstract classes are not final
		System.out.println("My new Product:"+cName);
	}
	public void show() {
		System.out.println("Local methods of product Impl class");
	}
	public static void main(String[] args) {
		//can not instantiate the type product
		//Product p1=new Product();
		Product p2=new ProductImpl2();
		p2.allProducts();
		p2.newProduct();
		//p2.show();

	}

}
