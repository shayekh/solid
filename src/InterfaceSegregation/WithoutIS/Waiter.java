package InterfaceSegregation.WithoutIS;

//Interfaces should be such, that client should not implement unnecessary functions they do not need

public class Waiter implements RestaurantEmployee {

  @Override
  public void washDishes() {
    // not waiter job
  }

  @Override
  public void serverCustomers() {

    //waiter job
  }

  @Override
  public void cookFood() {

    //not waiter job
  }
}

// Here Interface Segregation is broken.