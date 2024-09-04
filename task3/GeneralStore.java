package com.evergent.corejava.task3;

import java.util.*;
public class GeneralStore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GeneralStoreImp gen=new GeneralStoreImp();
		
		 while(true) {
			 System.out.println("enter your choice");
			 int n=sc.nextInt();
		 switch(n) {
		 case 1:
			 	Product p=new Product();
			 	System.out.println("enter product name");
			 	String s=sc.next();
			 	System.out.println("enter price number");
			 	int  num=sc.nextInt();
			 	p.setpName(s);
			 	p.setpPrice(num);
			 	gen.addProduct(p);
			 	break;
		 
		 case 2:
			 System.out.println("enter search product name");
			 String s1=sc.next();
			 gen.ProductSearch(s1);
			 break;
		 case 3:
			 gen.getProducts();
			 break;
		 }
		 
		 }
	}

}
