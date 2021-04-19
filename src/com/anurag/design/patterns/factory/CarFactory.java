package com.anurag.design.patterns.factory;

public class CarFactory {
	
	public static Car buildCar(CarModel model){
		Car car =null;
		switch (model) {
		case HB:
			car = new HBCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case SUV:
			car=new SuvCar();
			break;
		default:
			break;
		}
		return car;
	}

}
