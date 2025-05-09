import java.math.BigDecimal;

public class Rectangular extends Shape{
  private double lenght;
  private double width;

  public Rectangular (String colour, double length, double width){
    super(colour);
    this.lenght = length;
    this.width = width;
  }

  public double getLenght() {
    return this.lenght;
  }
  public double getWidth() {
    return this.width;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.lenght)
    .multiply(BigDecimal.valueOf(this.width))
    .doubleValue();
  }
}
