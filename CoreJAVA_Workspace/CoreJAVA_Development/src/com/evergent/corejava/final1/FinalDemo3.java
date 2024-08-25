package com.evergent.corejava.final1;
//we can not inherit the final class
//final class myClass{
public class myClass{
	//final public void myProducts() {
		 public void myProducts() {
		System.out.println("all products");
	}
}
public class FinalDemo3 extends myClass{
	final String cname="rakshitha";
	public void myData() {
		//cname="ramya";
		System.out.println(cname);
	}
	public void myProducts() {
		System.out.println("new products");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 f=new FinalDemo3();
		f.myProducts();



	}

}
