package com.evergent.corejava.test;


class emp{
	int eno;
	public emp(int eno) {
		this.eno=eno;
	}
}
public class constructor extends emp{
	String ename;
	int esal;
	
	constructor(int eno,String ename,int esal){
		super(eno);
		this.ename=ename;
		this.esal=esal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c=new constructor(1,"abc",123);
		

	}

}
