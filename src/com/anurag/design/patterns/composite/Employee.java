package com.anurag.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String designation;
	private int salary;
	private List<Employee> subordinates;
	
	Employee (String name,String designation,int salary){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		subordinates=new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee){
		subordinates.add(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}
	
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Employee Name: ").append(name)
		.append(" Designation: ").append(designation)
		.append(" salary: ").append(salary);
		return sb.toString();
	}
}
