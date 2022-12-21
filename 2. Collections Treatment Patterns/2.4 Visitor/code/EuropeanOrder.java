public class EuropeanOrder implements Order {
    private double orderAmount;
    private double additionalSH;
  
    public EuropeanOrder() {
    }
    public EuropeanOrder(double inp_orderAmount,
        double inp_additionalSH) {
      orderAmount = inp_orderAmount;
      additionalSH = inp_additionalSH;
    }
    public double getOrderAmount() {
      return orderAmount;
    }
    public double getAdditionalSH() {
      return additionalSH;
    }
    @Override
    public void accept(VisitorInterface v) {
      v.visit(this);      
    }
  }
  