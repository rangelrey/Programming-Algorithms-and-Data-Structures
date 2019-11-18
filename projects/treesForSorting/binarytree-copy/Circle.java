public class Circle extends Shape {
  private int radius;

  public Circle (String colour, int radius) {
    super (colour);
    this.radius = radius;
  }

  public int getRadius () {
    return radius;
  }
}