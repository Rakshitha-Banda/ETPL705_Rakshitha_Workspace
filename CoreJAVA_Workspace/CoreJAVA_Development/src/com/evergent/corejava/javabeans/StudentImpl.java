package com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		//initializing values through setter methods
		StudentBean stu=new StudentBean();
		stu.setSno(10);
		stu.setSname("rakshitha");
		stu.setAddress("nizamabad");
		
		//getting values through toString method
		
		System.out.println(stu);
	}

}
