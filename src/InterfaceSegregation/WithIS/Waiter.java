package InterfaceSegregation.WithIS;

public class Waiter implements WaiterInterface{

  @Override
  public void serveCustomers() {
    System.out.println("Serving the customer");
  }

  @Override
  public void takeOrders() {
    System.out.println("Taking orders");
  }
}
