package Liskov;

public class WithoutLiskov {

  Bike obj1 = new Bicycle();

  void turnOnEngine() {
    obj1.turnOnEngine();
    // This will throw an exception which will break the behaviour of the program
    // Narrowing the capability of parent class

  }

  void accelerate() {
    obj1.accelerate();
  }

}
