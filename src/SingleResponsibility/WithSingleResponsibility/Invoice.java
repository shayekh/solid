package SingleResponsibility.WithSingleResponsibility;

import SingleResponsibility.Marker;

//separate responsibility for each class

public class Invoice {
  private Marker marker;
  private int quantity;

  public Invoice(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public int calculate() {
    int price = ((marker.price) * this.quantity);
    return price;
  }

}
