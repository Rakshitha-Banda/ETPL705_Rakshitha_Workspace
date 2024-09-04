package com.evergent.corejava.task3;

import java.util.*;
public class GeneralStoreImp {
	Set<Product> set=new HashSet<>();
	public void addProduct(Product p) {
		set.add(p);
		
	}
	public void ProductSearch(String pName) {
		int n=0;
		if(set.size()>0) {
			
			for(Product p:set) {
				if(pName.equals(p.getpName())) {
					System.out.println("product is found");
					n=1;
				}
			}
			
		}
		if(n==0) {
			System.out.println("product not found");
		}
	}
	public void getProducts() {
		if(set.size()>0) {
			for(Product p:set) {
				System.out.println("product name is:"+p.getpName()+"product price is:"+p.getpPrice());
			}
		}
	}
	

}
