import java.math.BigDecimal;
import java.math.RoundingMode;

// ! array -> int[] + String[]
// 1. Finite lenght

// ! class is going to solve a problem of "set of different values"
public class Circle {
  private double radius;
  private String colour;

  public String getColour() {
    return this.colour;
  }

  public char getColour2() {
    return this.colour.charAt(0);
  }

  public int getColour3() {
    if (this.colour.equals("Red")) {
      return 1;
    } else if (this.colour.equals("YELLOW")) {
      return 2;
    }
    return 3;
  }

  // c1.
  public void setColour(String colour) {
    this.colour = colour;
  }

  public void setRadius(double radius) { // void -> return
    this.radius = radius;
  }

  // area (presentation)
  // radius * radius * pi
  public double Area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
  }

  // return "BIG" (>= 5.0) or "SMALL"
  public String getSizeStatus() {
    return this.Area() >= 5.0 ? "BIG" : "SMALL";
  }
  // if (this.Area >= 5.0)
  // return "BIG";
  // return "SMALL";

  public static void main(String[] args) {
    System.out.println(Math.PI); // 3.14159...
    Circle c = new Circle();
    c.setRadius(3.0);
    System.out.println(c.Area());
    System.out.println(c.getSizeStatus());

    Circle c3 = new Circle();
    c3.setColour("YELLOW");
    System.out.println(c3.getColour()); //YELLOW
    System.out.println(c3.getColour2()); //Y
    System.out.println(c3.getColour3()); //2
  }
}
