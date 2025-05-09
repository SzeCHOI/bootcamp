public class SuperDecimal {
  private double value;
  
  public SuperDecimal(String value){
    this.value = Double.valueOf(value);
  }

  public void setValue(double value) {
    this.value = value;
  }

  public double getValue() {
    return this.value;
  }

  public SuperDecimal add (SuperDecimal sd){
    // this.value (3.3) + sd.getValue() (3.5)
    double result = this.value + sd.getValue();
    return new SuperDecimal(String.valueOf(result));
  }

  public void add2(SuperDecimal sd) {
    this.value = this.value + sd.getValue();
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal ("3.3");
    System.out.println(sd.getValue()); // 3.3

    SuperDecimal vincent = new SuperDecimal("3.5");

    SuperDecimal sd2 = sd.add(vincent);
    System.out.println(sd2.getValue()); // 6.8
    
    sd.add2(new SuperDecimal("4.2"));
    System.out.println(sd.getValue()); // 7.5

  }
}
