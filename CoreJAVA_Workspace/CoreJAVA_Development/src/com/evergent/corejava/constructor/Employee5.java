package com.evergent.corejava.constructor;
//we can call one constructor from other constructor using this keyword
public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
		
	}
	Employee5(int eno,String ename,double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("eno is:"+eno);
		System.out.println("ename is:"+ename);
		System.out.println("sal is:"+sal);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();
		Employee5 emp=new Employee5(123,"rakshitha",5000);
		emp.display();
		
		

	}

}
