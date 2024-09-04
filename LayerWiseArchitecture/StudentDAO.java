package com.evergent.corejava.studentApplication;

import java.util.*;
public class StudentDAO {

	public int showDetails(StudentBean b) {
		ArrayList list=new ArrayList();
		list.add(b.getsId());
		list.add(b.getsName());
		list.add(b.getsMarks());
		list.add(b.getsGrade());
		
		System.out.println(list);
		return 1;
	}
}
