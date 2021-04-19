package com.anurag.design.patterns.factory;

public class HBCar extends Car{
	
	public HBCar(){
		super(CarModel.HB);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside HBCar : constructing HBCar.");
		
	}

}
