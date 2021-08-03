package com.mmdoss.springrestassignment;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String department;
	private String designation;
	private int salary;
	public Employee(int id, String name, String department, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee(String name, String department, String designation, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("\nEmployee [id=%s, name=%s, department=%s, designation=%s, salary=%s]", id, name,
				department, designation, salary);
	}
	

}
