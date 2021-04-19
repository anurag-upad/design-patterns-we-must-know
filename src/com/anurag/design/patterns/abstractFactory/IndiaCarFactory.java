package com.anurag.design.patterns.abstractFactory;

public class IndiaCarFactory {
	
	public static Car buildCar(CarModel model){
		Car car =null;
		switch (model) {
		case HB:
			car = new HBCar(Location.INDIA);
			break;
		case SEDAN:
			car = new SedanCar(Location.INDIA);
			break;
		case SUV:
			car=new SuvCar(Location.INDIA);
			break;
		default:
			break;
		}
		return car;
	}

}
