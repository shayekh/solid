package DependencyInversion.WithoutDI;

// Here mouse and keyborad can be wired or bluetooth
// But we have fixed the type here Wired

public class Macbook {

  private final WiredKeyboard keyboard;
  private final WiredMouse mouse;

  public Macbook() {
    keyboard = new WiredKeyboard();
    mouse = new WiredMouse();
  }
}
