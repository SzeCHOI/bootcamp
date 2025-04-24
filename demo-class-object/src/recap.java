public class recap {
  private int age;
  private String name;

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // getter
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isSuperman() {
    if (this.age >= 30 && name.equals("Vincent"))
      return true;
    return false;
  }

  // compareTo
  public int compareTo(recap recap) {
    if (this.age == recap.getAge()) {
      return 0;
    } else if (this.age > recap.getAge()) {
      return 1;
    } else {
      return -1;
    }
  }

  // w1.isOlderThan(xxx)
  public boolean isOlderThan(recap recap) {
    // if (this.age > recap.getAge()) {
    // return true;
    // }
    // return false;
    return this.age > recap.getAge();
  }

  // method name -> Presentation
  public boolean isElderly() {
    return this.age >= 65;
  }

  public static void main(String[] args) {

    recap w1 = new recap();
    w1.setAge(12);
    recap w2 = new recap();
    w2.setAge(14);
    System.out.println(w1 == w2); // false -> different objects
    System.out.println(w1.getAge() == w2.getAge()); // false -> differnt value
    System.out.println(w1.compareTo(w2)); // -1
    System.err.println(w1.isOlderThan(w2)); // false

    Circle c1 = new Circle();
    app a1 = new app();

  }
}
