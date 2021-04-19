package com.anurag.design.patterns.abstractFactory;

public class HBCar extends Car{
	
	public HBCar(Location location){
		super(CarModel.HB, location);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Inside HBCar : constructing HBCar.");
		
	}

}
