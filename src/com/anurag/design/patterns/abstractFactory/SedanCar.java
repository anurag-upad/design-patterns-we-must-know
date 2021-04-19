package com.anurag.design.patterns.abstractFactory;

public class SedanCar extends Car {
	
	public SedanCar(Location location){
		super(CarModel.SEDAN, location);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside SedanCar : constructing SedanCar.");
	}

}
