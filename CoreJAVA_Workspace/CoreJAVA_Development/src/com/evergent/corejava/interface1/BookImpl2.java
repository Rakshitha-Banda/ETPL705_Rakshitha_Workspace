package com.evergent.corejava.interface1;

public class BookImpl2 implements Book{
	
	public void bookTitle() {
		System.out.println("Core java");
	}
	public void bookAuthor() {
		System.out.println("oracle crop:"+cName);
	}
	public void bookPrice() {
		System.out.println("Rs.550");
	}
	public void show() {
		System.out.println("local methods of BookImpl");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can not instantiate the type book
		//Book b1=new Book();
		Book book1=new BookImpl2();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		//book1.show();


	}

}
