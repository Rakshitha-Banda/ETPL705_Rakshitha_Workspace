package com.evergent.corejava.constructor;

public class Employee3 {
	int eno; //0 123
	String ename;// null  rakshitha
	double sal;// 0.0 5000
	Employee3(){
		System.out.println("default constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
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
		new Employee2();
		Employee2 emp=new Employee2(123,"rakshitha",5000);
		emp.display();
		

	}

}
