package com.UniDirectional.Mapping.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	@Column
	private String empname;
	private String dept;
	private int deptno;
	private int Salary;
	
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "aadharno", referencedColumnName = "id")
    private PersonalDetails aadhardetails;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String empname, String dept, int deptno, int salary, PersonalDetails aadhardetails) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dept = dept;
		this.deptno = deptno;
		Salary = salary;
		this.aadhardetails = aadhardetails;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public PersonalDetails getAadhardetails() {
		return aadhardetails;
	}


	public void setAadhardetails(PersonalDetails aadhardetails) {
		this.aadhardetails = aadhardetails;
	}


	



}
