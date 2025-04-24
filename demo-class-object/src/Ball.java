public class Ball {
  // attributes
  private double size;

  //constructor
  // ! by defult, implicitly empty constructor exist.
  // ! but once you define a new constructor, the empty constructor will disapper
  public Ball() {

 }

  // can be more than one constructor
  // All arguement constructor
  public Ball(double size){
    this.size = size;
  }

  
// methods
  // setter

  public void setSize(double size) {
    this.size = size;
  }

  // getter

  public String getSizeDesc(){
    if (this.size > 5){
      return "BIG";
    } else {
      return "SMALL";
    }
  }

  public double getSize() {
    return this.size;
  }

  // main (create object, set, get)
  public static void main(String[] args) {
    // "new" associate with constructor
    Ball b1 = new Ball(); // call empty constructor
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());

    Ball b2 = new Ball(10); // call the anohter constructor
    System.out.println(b2.getSize()); // 10.0

  }
}
