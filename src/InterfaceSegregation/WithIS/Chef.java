package InterfaceSegregation.WithIS;

public class Chef implements ChefInterface{

  @Override
  public void cookFood() {
    System.out.println("Cook");
  }

  @Override
  public void decideMenu() {

    System.out.println("Decide Menu");
  }
}
