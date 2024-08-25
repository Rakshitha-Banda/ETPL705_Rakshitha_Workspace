package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3{

		public ProductImpl3() {
			System.out.println("ProductImpl3 sub class Constructor");
		}
		public void newProduct() {
			cName="welcome";
			System.out.println("My new Product:"+cName);
		}
		public void show() {
			System.out.println("Local methods of product Impl class");
		}
		public static void main(String[] args) {
			//can not instantiate the type product
			//Product p1=new Product();
			ProductImpl3 p2=new ProductImpl3();
			p2.allProducts();
			p2.newProduct();
			p2.show();

	}

}
