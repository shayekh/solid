package OpenClosed.WithOpenClosed;

import SingleResponsibility.WithSingleResponsibility.Invoice;

//open for extension but closed for modification

public interface InvoiceDao {

  public void save(Invoice invoice);

}
