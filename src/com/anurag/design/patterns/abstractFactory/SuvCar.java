package com.anurag.design.patterns.abstractFactory;

public class SuvCar extends Car {
	
	public SuvCar(Location location){
		super(CarModel.SUV, location);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside SuvCar : constructing SuvCar...");
	}

}
