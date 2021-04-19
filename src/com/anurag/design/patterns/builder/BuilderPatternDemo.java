package com.anurag.design.patterns.builder;

/**
 * Builder pattern is used as alternative to create complex objects, more specifically
 * objects of immutable class with large set of attributes
 */
public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		User user1=new User.UserBuilder("anurag", "upadhyay")
				.age(31)
				.phone("99999999")
				.address("Ghaziabad")
				.age(22)
				.build();
		
		System.out.println(user1);
		
	}

}
