import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  // BMI = kg / m*m
  // ! Attributes (Instance Variable)
  // Instance means Object
  private double weight;
  private double height;

  public Person() {

  }

  // all argument constructor
  public Person(double height, double weight) {
    this.weight = weight;
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // ! Instance Method (Object Method)
  // getter
  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  // getBMI (weight / height^2)
  public double getBMI() {
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
    // return result
  }

  // static getBMI
  public static double getBMI2(double weight, double height) {
    return BigDecimal.valueOf(weight)
        .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
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

  public boolean equals(Person person){
    return this.height == person.getHeight()
    && this.weight == person.getWeight();
  }

  public String toString() {
    return "Person ( " //
    + "height = " + this.height //
    + " weight " + this.weight //
    +")";
  }

  public static void main(String[] args) {
    Person john = new Person();
    john.setWeight(70);
    john.setHeight(1.7);
    System.out.println(john.getBMI());
    System.out.println(john.getWeightStatus());

    Person peter = new Person(1.76, 76);
    System.out.println(peter.getBMI());
    System.out.println(peter.getWeightStatus());

    System.out.println(Person.getBMI2(1.76, 76)); // 24.54

    // You prepared the toString method, System.out.println() calls the object toString() method.
    System.out.println(john); // Person ( height = 1.7 weight 70.0)
    System.out.println(peter); // Person ( height = 1.76 weight 76)

    // You prepared the equals() mehtod. p2 is able to call equals().
    Person p3 = new Person(1.76, 76);
    System.out.println(peter.equals(p3)); // true
    System.out.println(john.equals(p3)); // false


  }

}
