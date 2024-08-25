package com.evergent.corejava.constructor;
 class Employee{
	 public Employee() {}
	 public Employee(int eno) {
		 System.out.println("myemployee no:"+eno);
	 }
 }
public class Employee6 extends Employee{
	int eno; //0 123
	String ename;// null  rakshitha
	double sal;// 0.0 5000
	Employee6(){
		System.out.println("default constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("ename is:"+ename);
		System.out.println("sal is:"+sal);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		Employee6 emp=new Employee6(123,"rakshitha",5000);
		emp.display();
		



	}

}
