package SingleResponsibility.WithSingleResponsibility;

//separate responsibility for each class

public class InvoiceDao {

  Invoice invoice;

  public InvoiceDao(Invoice invoice)
  {
    this.invoice = invoice;
  }

  public void saveToDB()
  {
    //save to DB
  }

}
