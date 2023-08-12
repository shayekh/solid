package Liskov;

public class MotorBike implements Bike{

  boolean isEngineOn;
  int speed;

  @Override
  public void turnOnEngine() {
    //turn on the engine
    isEngineOn = true;

  }

  @Override
  public void accelerate() {

    // increase the speed
    speed = speed+10;
  }
}
