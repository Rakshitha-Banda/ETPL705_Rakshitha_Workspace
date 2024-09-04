package com.evergent.corejava.studentApplication;

import java.util.*;
public class StudentService {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("entre marks");
		int marks=sc.nextInt();
		
		StudentControl con=new StudentControl();
		int k=con.addStudent(id, name, marks);
		System.out.println(k);
	}

}
