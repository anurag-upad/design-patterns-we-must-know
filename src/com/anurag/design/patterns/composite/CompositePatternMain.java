package com.anurag.design.patterns.composite;

/**
 * This pattern is most suitable in cases where you need to work with 
 * objects which form a tree like hierarchy. 
 */
public class CompositePatternMain {
	
	public static void main(String[] args) {
		Employee CEO=new Employee("Sanjay","CEO",1000);
		Employee hrHead= new Employee("Manish","Head-HR Opeations", 800);
		Employee techHead=new Employee("Salim","Head-Sales Operations",800);
		
		Employee techLead=new Employee("Pira","Lead Consultant", 700);
		Employee dev=new Employee("Anurag","Consultant", 500);
		
		Employee hrLead=new Employee("Bipasha","Lead HR",700);
		Employee hrExecutive=new Employee("Sandhya","HR Executive",500);
		
		CEO.addEmployee(hrHead);
		CEO.addEmployee(techHead);
		
		hrHead.addEmployee(hrLead);
		hrHead.addEmployee(hrExecutive);
		
		techHead.addEmployee(techLead);
		techHead.addEmployee(dev);
		
		System.out.println(CEO);
		for( Employee ceoSub:CEO.getSubordinates()){
			System.out.println(ceoSub);
			for(Employee emp:ceoSub.getSubordinates()){
				System.out.println(emp);
			}
		}
	}
}
