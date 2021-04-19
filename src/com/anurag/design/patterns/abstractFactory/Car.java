package com.anurag.design.patterns.abstractFactory;

public abstract class Car {
	
	private CarModel carModel;
	private Location location;
	
	public Car(CarModel carModel, Location location){
		this.carModel = carModel;
		this.location=location;
	}
	
	public abstract void constructCar();

}
