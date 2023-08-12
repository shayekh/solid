package SingleResponsibility;


// A class should have 1 reason to change

//Marker Entity
public class Marker {
 String name;
  String color;
  int year;
  public int price;

  public Marker(String name, String color, int year, int price) {
    this.name = name;
    this.color = color;
    this.year = year;
    this.price = price;
  }
}


