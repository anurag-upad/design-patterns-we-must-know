package com.anurag.design.patterns.abstractFactory;

public class CarFactory
{
  private CarFactory() {
    //Prevent instantiation
  }
 
  public static Car buildCar(CarModel type)
  {
    Car car = null;
    Location location = Location.INDIA; //Read location property somewhere from configuration
    
    //Use location specific car factory
    switch(location)
    {
      case USA:
        car = UsaCarFactory.buildCar(type);
        break;
      case INDIA:
        car = IndiaCarFactory.buildCar(type);
        break;
      default:
        car = ChinaCarFactory.buildCar(type);
    }
  return car;
  }
}
