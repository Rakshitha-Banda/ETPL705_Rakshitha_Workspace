package com.evergent.corejava.constructor;

public class Employee2 {
	int eno; //0 123
	String ename;// null  rakshitha
	double sal;// 0.0 5000
	Employee2(){
		System.out.println("default constructor");
	}
	Employee2(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
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
