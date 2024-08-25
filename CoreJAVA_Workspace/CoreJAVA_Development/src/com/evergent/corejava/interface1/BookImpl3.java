package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook{

	public void bookTitle() {
		System.out.println("Core java");
	}
	public void bookAuthor() {
		System.out.println("oracle crop:"+cName);
	}
	public void bookPrice() {
		System.out.println("Rs.550");
	}
	public void mynewBook() {
		System.out.println("my new book");
	}
	public void dataInfo() {
		System.out.println("my data info");
	}
	public void show() {
		System.out.println("local methods of BookImpl");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 book1=new BookImpl3();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		book1.show();
		book1.mynewBook();
		book1.dataInfo();

	}

}
