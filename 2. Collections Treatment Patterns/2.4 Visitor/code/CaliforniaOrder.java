public class CaliforniaOrder implements Order {
  private double orderAmount;
  private double additionalTax;

  public CaliforniaOrder() {
  }
  public CaliforniaOrder(double inp_orderAmount,
      double inp_additionalTax) {
    orderAmount = inp_orderAmount;
    additionalTax = inp_additionalTax;
  }
  public double getOrderAmount() {
    return orderAmount;
  }
  public double getAdditionalTax() {
    return additionalTax;
  }

  @Override
  public void accept(VisitorInterface v) {
    v.visit(this);
  }
}

