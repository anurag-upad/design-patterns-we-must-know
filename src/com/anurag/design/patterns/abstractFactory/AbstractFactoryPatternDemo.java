package com.anurag.design.patterns.abstractFactory;

/**
 * Abstract factory pattern is used whenever we need another level of abstraction 
 * over a group of factories created using Factory design pattern.
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarModel.SEDAN));
		System.out.println(CarFactory.buildCar(CarModel.SUV));
		System.out.println(CarFactory.buildCar(CarModel.HB));
	}
}
