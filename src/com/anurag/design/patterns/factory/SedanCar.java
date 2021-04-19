package com.anurag.design.patterns.factory;

public class SedanCar extends Car {
	
	public SedanCar(){
		super(CarModel.SEDAN);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside SedanCar : constructing SedanCar.");
	}

}
