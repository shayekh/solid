package Liskov;

public class Bicycle implements Bike{


  @Override
  public void turnOnEngine() {
    throw new AssertionError("There is no engine for bicycle");


  }

  @Override
  public void accelerate() {

    // increase the speed

  }
}
