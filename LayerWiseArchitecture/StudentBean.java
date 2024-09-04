package com.evergent.corejava.studentApplication;

public class StudentBean {
	private int sId;
	private String sName;
	private int sMarks;
	private String sgrade;
	public StudentBean() {
//		this.sId=sId;
//		this.sName=sName;
//		this.sMarks=sMarks;
	}
	public void  setsId(int sId) {
		this.sId=sId;
	}
	public void setsName(String sName) {
		this.sName=sName;
	}
	public void setsMarks(int sMarks) {
		this.sMarks=sMarks;
	}
	public void setsGrade(String sgrade) {
		this.sgrade=sgrade;
	}
	public int getsId() {
		return sId;
	}
	public String getsName() {
		return sName;
	}
	public int getsMarks() {
		return sMarks;
	}
	public String getsGrade() {
		return sgrade;
	}

}
