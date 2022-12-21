public abstract class VehicleFactory {
  public static final String CAR = "Car";
  public static final String SUV = "Suv";
  public static final String MOTORCYCLE = "Motorcycle";


  public abstract Luxury getLuxury();
  public abstract NonLuxury getNonLuxury();

  public static VehicleFactory getVehicleFactory(String type) {
    if (type.equals(VehicleFactory.CAR))
      return new CARVehicleFactory();
    if (type.equals(VehicleFactory.SUV))
      return new SUVVehicleFactory();
    if (type.equals(VehicleFactory.MOTORCYCLE))
      return new MOTORCYCLEVehicleFactory();
      
    return new CARVehicleFactory();
  }

} // End of class


