public class LuxuryMOTORCYCLE implements Luxury{
    private String name;
    public LuxuryMOTORCYCLE(String mName){
        name = mName;
    }
    public String getLuxuryName() {
       return name; 
    }
    public String getLuxuryFeatures() {
        return "Luxury Motorcycle Features";
    }
    
}
