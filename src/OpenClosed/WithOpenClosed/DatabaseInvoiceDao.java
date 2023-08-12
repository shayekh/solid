package OpenClosed.WithOpenClosed;

import SingleResponsibility.WithSingleResponsibility.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{

  @Override
  public void save(Invoice invoice) {
    // save to DB
  }
}
