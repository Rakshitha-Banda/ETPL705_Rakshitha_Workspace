package com.evergent.corejava.test;

public class userLogin {
	
	public void login() {
		System.out.println("dafault constructor");
	}
	public void login(String name,int pass) {
		System.out.println(name);
		System.out.println(pass);
	}
	public void login(String name,int pass,String cap) {
		System.out.println(name);
		System.out.println(pass);
		System.out.println(cap);}

public void login(int mob,int pass) {
	System.out.println(mob);
	System.out.println(pass);}

	

	public static void main(String[] args) {
	userLogin li=new userLogin();
	li.login();
	li.login("rak",123);
	li.login("rak",123,"abc");
	li.login(1234,123);

	}

}
