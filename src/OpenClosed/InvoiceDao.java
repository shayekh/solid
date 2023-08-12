package OpenClosed;

import SingleResponsibility.WithSingleResponsibility.Invoice;

public class InvoiceDao {

  Invoice invoice;

  public InvoiceDao(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToDB()
  {
    //save to DB
  }

  // Now if a new action comes to save for file then

  public void saveToFile()
  {
    //save to File
  }

  // Here OpenClosed is broken. As we have modified the class with a new method saveToFile().
}
