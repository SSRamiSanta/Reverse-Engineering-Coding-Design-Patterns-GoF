public class NonLuxuryCAR implements NonLuxury {
  private String name;
  public NonLuxuryCAR(String cName) {
    name = cName;
  }
  public String getNLName() {
    return name;
  }
  public String getNLFeatures() {
    return "Non-Luxury CAR Features ";
  };

} // End of class