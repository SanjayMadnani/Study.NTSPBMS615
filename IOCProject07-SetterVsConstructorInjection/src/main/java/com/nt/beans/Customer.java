package com.nt.beans;

public class Customer {
	private int cNo;
	private String cName;
	private String emailId;
	private long mobileNo;
	
	public Customer(int cNo, String cName) {
		super();
		this.cNo = cNo;
		this.cName = cName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", cName=" + cName + ", emailId=" + emailId + ", mobileNo=" + mobileNo + "]";
	}
	
}
