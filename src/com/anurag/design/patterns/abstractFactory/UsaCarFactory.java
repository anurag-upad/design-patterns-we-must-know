package com.anurag.design.patterns.abstractFactory;

public class UsaCarFactory {
	
	public static Car buildCar(CarModel model){
		Car car =null;
		switch (model) {
		case HB:
			car = new HBCar(Location.USA);
			break;
		case SEDAN:
			car = new SedanCar(Location.USA);
			break;
		case SUV:
			car=new SuvCar(Location.USA);
			break;
		default:
			break;
		}
		return car;
	}

}
