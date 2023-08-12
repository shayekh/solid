package Liskov;

public class WithLiskov {

  Bike obj = new MotorBike();

  void turnOnEngine()
  {
    obj.turnOnEngine();
  }

  void accelerate()
  {
    obj.accelerate();
  }

}
