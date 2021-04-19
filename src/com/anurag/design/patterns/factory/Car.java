package com.anurag.design.patterns.factory;

public abstract class Car {
	
	private CarModel carModel;
	
	public Car(CarModel carModel){
		this.carModel = carModel;
	}
	
	public abstract void constructCar();

}
