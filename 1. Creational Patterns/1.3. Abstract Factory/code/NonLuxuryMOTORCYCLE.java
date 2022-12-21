public class NonLuxuryMOTORCYCLE implements NonLuxury{
    private String name;
    public NonLuxuryMOTORCYCLE(String mName){
        name = mName;
    }
    public String getNLName() {
        return name;
    }
    public String getNLFeatures() {
        return "Non-Luxury Motorcycle Features";
    }
    
}
