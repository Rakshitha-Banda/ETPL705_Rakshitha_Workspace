package com.evergent.corejava.oops;

public class UserLogin {
	public void logindata() {
		System.out.println("Login info");
	}
	public void logindata(String name,String pass) {
		System.out.println(name);
		System.out.println(pass);
		
	}
	public void logindata(String name,String pass,String captcha) {
		System.out.println(name);
		System.out.println(pass);
		System.out.println(captcha);
		
	}
	public void logindata(int mobile,String pass) {
		System.out.println(mobile);
		System.out.println(pass);
	}
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin u=new UserLogin();
		u.logindata();
		u.logindata("rakshitha","rak123");
		u.logindata("rakshitha","rakshitha123","abc");
		u.logindata(123456789,"welcome");
		u.show();

	}

}
