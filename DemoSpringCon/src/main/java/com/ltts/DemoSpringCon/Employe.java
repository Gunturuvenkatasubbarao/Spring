package com.ltts.DemoSpringCon;

public class Employe {
	private int empid;
	private String empName;
	private String empaddress;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", empName=" + empName + ", empaddress=" + empaddress + "]";
	}
	public Employe(int empid, String empName, String empaddress) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empaddress = empaddress;
	}
	public Employe() {
		super();
	}
	
	
}
