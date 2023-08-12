package SingleResponsibility.WithoutSingleResponsibility;

 /*Without Single Responsibility
 Here, we can see a class consists of different responsibilities*/

import SingleResponsibility.Marker;

public class InvoiceWithoutSingleResponsibility {

  private Marker marker;
  private int quantity;

  public InvoiceWithoutSingleResponsibility(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public int calculate() {
    int price = ((marker.price) * this.quantity);
    return price;
  }

  public void printInvoice() {
    //print invoice
  }

  public void saveToDB() {
    // save to DB
  }
}
