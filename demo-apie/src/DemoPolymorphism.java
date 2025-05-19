public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/ Setter for private variable)

    Animal a1 = new Dog("Peter");
    // Dog d1 = a1 // why error? type unsafe

    // ! Java compile time: Method readability based on the type of "object
    // reference"
    // a1.bark();
    System.out.println(a1.getName()); // Animal.class has getName(), ensure Cat/Dog must contain getName()

    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Rum-time: Found the object is Dog, so the result "wow wow"
    a1.sound(); // wow wow ...

    // ! How to eliminate teh risk? we can use instanceof to check the actual type
    // of
    // object
    if (a1 instanceof Dog) {
      Dog d2 = (Dog) a1; // force conversion - risky
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force conversion (downcast) - risky
    }

    // 2. Interface
    Flyable superman = new Superman("John");

    superman.fly(); // OK, i am flying
    // superman.drink(); // NOT OK
    // superman.eat(); // NOT OK
    // superman.sleep(); // NOT OK

    // Example (Account)
    // Use Polymorphism to create objects

    Account acc1 = new PersonalAccount();
    Account acc2 = new CommercialAccount();

    // Parent Class (Account)
    acc1.getSavingAccount().credit(300.0);
    System.out.println(acc1.getSavingAccount().getBalance());
    acc2.getSavingAccount().credit(400.0);
    System.out.println(acc2.getSavingAccount().getBalance());

    SubAccount subAcc1 = SavingAccount.ofHKD();
    SubAccount subAcc2 = new CurrentAccount();
    subAcc1.credit(900.0);
    subAcc2.credit(100.0);

    // subAcc1 = new CurrentAccount();

    // Example (Shape)
    // Polymorphism
    // Shape c1 = new Circle(3.0, "Blue");
    // Shape shape2 = new Rectangular("BLUE", 4.5, 7.8);

    int x = 100;
    Shape shape;
    if (x > 50) {
      shape = new Circle(3.5, "WHITE");
      // } else if (){ // ! new shape comes...
    } else {
      shape = new Rectangular("BLUE", 4.5, 7.8);
    }
    // ! area() is a common method for Circle fand Rectangular
    System.out.println(shape.area());

    double area = shape.area();
    if (area > 10){
      System.out.println("Area=" + area);
    } else {
      System.out.println("it is a small shape.");
    }

    // shape.getLength(); // ! unsafe type, so we have to use "instanceOf" and downcasting

    // get radius
    // get Length/ Width
    if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      System.out.println(circle.getRadius());
    } else if (shape instanceof Rectangular) {
      Rectangular rectangular = (Rectangular) shape;
      System.out.println(rectangular.getLenght());
      System.out.println(rectangular.getWidth());
    }

    // Number
    Number number = Long.valueOf(3);
    number = Integer.valueOf(10);
    number = Byte.valueOf("7");
    number = Short.valueOf("8");
    number = Double.valueOf(3.9);
    number = Float.valueOf("8.4");


    long value = number.longValue(); // 8.4 -> 8
    System.out.println(value); // 8
    double value2 = number.doubleValue();
    System.out.println(value2);

    // floating point issue
    double d1 = 8.4f;
    System.out.println(d1);

  }
}
