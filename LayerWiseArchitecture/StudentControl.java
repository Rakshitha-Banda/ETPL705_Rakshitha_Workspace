package com.evergent.corejava.studentApplication;

public class StudentControl {
  
	public int  addStudent(int id,String name,int marks) {
		String sgrade;
		if(marks<30) {
			sgrade="P";
		}
		else if(marks>30 && marks<60) {
			sgrade="B";
		}
		else {
			sgrade="A";
		}
		
		StudentBean bean=new StudentBean();
		bean.setsId(id);
		bean.setsName(name);
		bean.setsMarks(marks);
		bean.setsGrade(sgrade);
		
		StudentDAO dao=new StudentDAO();
		int t=dao.showDetails(bean);
		return t;
	}
}
