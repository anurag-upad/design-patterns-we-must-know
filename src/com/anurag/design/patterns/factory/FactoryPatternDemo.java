package com.anurag.design.patterns.factory;

/**
 *
 *Factory design pattern is most suitable when complex object creation steps are involved. 
 *To ensure that these steps are centralized and not exposed to composing classes.
 *The most usual method of creating an instance of a class in java? “using new keyword“.
 *If object creation code is spread in the whole application, and if you need to change 
 *the process of object creation, then you need to go in each and every place to make necessary changes.
 *This would make your class tightly coupled with each other.
 *Factory pattern introduces loose coupling between classes 
 *which is the most imp principle one should consider n apply while designing the application architecture.
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarModel.SEDAN));
		System.out.println(CarFactory.buildCar(CarModel.SUV));
		System.out.println(CarFactory.buildCar(CarModel.HB));
	}
}
