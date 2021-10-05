package com.nt.beans;

public class Student {
	
	private String sname;
	private String collegeName;
	private int age;
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sname + ", collegeName=" + collegeName + ", age=" + age + "]";
	}
	
}
