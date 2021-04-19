package com.anurag.design.patterns.factory;

public class SuvCar extends Car {
	
	public SuvCar(){
		super(CarModel.SUV);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside SuvCar : constructing SuvCar...");
	}

}
