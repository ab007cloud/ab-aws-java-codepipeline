package com.ab.model;

public class Employee {

	private String employeeID;
	private String employeeName;
	private String employeeMobile;

	public Employee(String employeeID, String employeeName, String employeeMobile) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

}
