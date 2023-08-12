package DependencyInversion.WithDI;

// Class should depend on interfaces rather than concrete classes

// Here mouse and keyborad can be wired or bluetooth

public class Macbook {

  private final Keyborad keyborad;
  private final Mouse mouse;



// Constructor Injection
  public Macbook(Keyborad keyborad, Mouse mouse) {
    this.keyborad = keyborad;
    this.mouse = mouse;
  }

  // Here we can pass any time of keyboard & mouse object (Interface object) in the constructor, it might be wired or bluetooth
}
