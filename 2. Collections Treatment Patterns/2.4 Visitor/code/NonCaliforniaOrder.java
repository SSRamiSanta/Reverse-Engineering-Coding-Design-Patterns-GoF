public class NonCaliforniaOrder implements Order {
  private double orderAmount;

  public NonCaliforniaOrder() {
  }
  public NonCaliforniaOrder(double inp_orderAmount) {
    orderAmount = inp_orderAmount;
  }
  public double getOrderAmount() {
    return orderAmount;
  }
  
  @Override
  public void accept(VisitorInterface v) {
    v.visit(this);
  }
}
