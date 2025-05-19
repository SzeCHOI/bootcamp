import java.math.BigDecimal;

public abstract class Shape { 
  // Parent Class - 
  // 1. concrete class - can be "new"
  // 2. abstract class - cannot be "new"

  // Abstract Class:
  // 1. May contain abstract method

  private String colour;
  // Child inherit attributes, instance metods
  // But cannot inherit constructor

  // constructor
  // super ("RED")
  public Shape(){
  }

  public Shape (String colour){
    this.colour = colour;
  }
  // getter setter

  public String getColour(){
    return this.colour; 
  }

  public void setColour(String colour){
    this.colour = colour;
  }

  public abstract double area();

  public static void main(String[] args) {
    // Shape shape = new Shape ();
    Circle circle = new Circle(3.0, "RED");
    System.out.println(circle.getColour());
    System.out.println(circle.getRadius());

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.5, "RED"); // 38.48
    shapes[1] = new Rectangular("RED", 3.0, 5.0);
    shapes[2] = new Circle(4.0, "RED");
    // Circle Rectangular

    // calculate the total area of all shapes.
    // Shape (Parent class) ensures child class has area()

    BigDecimal sum = new BigDecimal(0.0);
    for (int i = 0; i< shapes.length; i++) {
      sum = sum.add(BigDecimal.valueOf(shapes[i].area()));
    }
    System.out.println(sum.doubleValue()); // 103.7...
  }
}
