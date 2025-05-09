import java.util.Arrays;
import java.util.Scanner;

public class Cat extends Animal {
// Attributes -> inherited (name, age)
  private int age;

  // private String name;
  // private int age;

  // Constructor
  public Cat(String name, int age) {
    // super (parent)
    super(name); // calling parent class's constructor
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // // ! inherit all instance method: getName()
  // public String getName() {
  //   return super.getName();
  // }



  // public void setName(String name) {
  //   this.name = name;
  // }


  // ! inherit all instance method: getName()
  public String getName() {
    return super.getName();

  }

  // Child Class can override the parent class method
  @Override
  public void sound() {
    System.out.println("Meow...");
  }

  // equals()

  @Override
  public String toString() {
    return "Cat("
    + "name=" + super.getName() //
    + "age=" + this.age //
    + ")";
  }

  // // equals
  // public boolean equals(Cat cat) {
  //   return this.name.equals(cat.getName())
  //       && this.age == getAge();
  // }

  // toString
  // public String toString() {
  //   return "Cat ( "
  //       + "name = " + this.name
  //       + ", age = " + this.age
  //       + " )";
  // }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 10);
    System.out.println(c1.getName()); // John
    c1.setName("Peter");
    System.out.println(c1.getName()); // Peter

    Cat c2 = new Cat("Peter", 10);
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1 == c2); // false

    System.out.println(c2.toString()); // Cat ( name = Peter, age = 10 )

    Scanner scanner = new Scanner(System.in);
    String[] catNames = new String[5]; // default value: [null, null, null, null, null]
    int idx = 0;
    while (true) {
      System.out.println("Please name the Cat: ");
      String input = scanner.nextLine();
      // check if exists
      boolean found = false;
      for (int i = 0; i < idx; i++) {
        if (catNames[i].equals(input)) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println("This cat name " + input + " already exists.");
        continue;// goes to while loop
      } else {
        catNames[idx++] = input;
      }
      // check
      if (idx >= catNames.length) {
        break;
      }
    } 
    scanner.close();
       System.out.println(Arrays.toString(catNames));

  }
}
