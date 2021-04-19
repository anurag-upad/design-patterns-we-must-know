package com.anurag.design.patterns.abstractFactory;

public class ChinaCarFactory {
	
	public static Car buildCar(CarModel model){
		Car car =null;
		switch (model) {
		case HB:
			car = new HBCar(Location.CHINA);
			break;
		case SEDAN:
			car = new SedanCar(Location.CHINA);
			break;
		case SUV:
			car=new SuvCar(Location.CHINA);
			break;
		default:
			break;
		}
		return car;
	}

}
