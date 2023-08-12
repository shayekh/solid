package SingleResponsibility.WithSingleResponsibility;

//separate responsibility for each class

public class InvoicePrinter {

  private Invoice invoice;

  public InvoicePrinter(Invoice invoice) {
    this.invoice = invoice;
  }

  public void print() {
    // print invoice
  }
}
