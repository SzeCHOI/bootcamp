import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  // BMI = kg / m*m
  private double weight;
  private double height;

  public Person () {

  }
  
  // all argument constructor
  public Person (double height, double weight){
    this.weight = weight;
    this.height = height;
  }

  public void setWeight (double weight) {
    this.weight = weight;
  }
  public void setHeight (double height) {
    this.height = height;
  }

  public double getWeight() {
    return this.weight;
  }
  public double getHeight() {
    return this.height;
  }

  public double getBMI() {
   return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, 
    RoundingMode.HALF_UP)
    .doubleValue();
    // return result
  }

  // get WeightStatus (prestation)
  public String getWeightStatus() {
    double bmi = this.getBMI();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static void main(String[] args) {
    Person john = new Person();
    john.setWeight(70);
    john.setHeight(1.7);
    System.out.println(john.getBMI());
    System.out.println(john.getWeightStatus());

    Person peter = new Person(1.7, 700);
    System.out.println(peter.getBMI());
    System.out.println(peter.getWeightStatus());

  }



}
