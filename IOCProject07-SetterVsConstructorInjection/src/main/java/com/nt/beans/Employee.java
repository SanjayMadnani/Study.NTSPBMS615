package com.nt.beans;

public class Employee {
	private int empNo;
	private String empName;
	private String emailId;
	
	
	public Employee(int empNo, String empName, String emailId) {
		this.empNo = empNo;
		this.empName = empName;
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", emailId=" + emailId + "]";
	}

}
