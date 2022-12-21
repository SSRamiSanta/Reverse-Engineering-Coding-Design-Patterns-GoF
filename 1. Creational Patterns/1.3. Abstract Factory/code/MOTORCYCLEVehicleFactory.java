public class MOTORCYCLEVehicleFactory extends VehicleFactory{
    
    @Override
    public LuxuryMOTORCYCLE getLuxury() {
        return new LuxuryMOTORCYCLE("Luxury-Motorcycle");
    }

    @Override
    public NonLuxuryMOTORCYCLE getNonLuxury() {
        return new NonLuxuryMOTORCYCLE("NonLuxury-Motorcycle");
    }
    
}
