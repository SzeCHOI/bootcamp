import java.math.BigDecimal;

public class Triangle extends Shape {

  private double lenght;
  private double height;

  public Triangle (double lenght, double height, String colour){
    super(colour);
    this.lenght = lenght;
    this.height = height;
  }

  public double getLenght() {
    return this.lenght;
  }

  public double getHeight() {
    return this.height;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.lenght)
    .multiply(BigDecimal.valueOf(this.height))
    .divide(BigDecimal.valueOf(2))
    .doubleValue();
  }


  public static void main(String[] args) {
    Triangle t1 = new Triangle(2, 2, "RED");

    System.out.println(t1.area());
  }
}
