public class DemoObject {
  public static void main(String[] args) {
    Animal a1 = new Cat("John", 1);
    // Animal is a parent class

    // the top parent class -> Object.java (Concrete class)
    Object o1 = new Cat("Peter", 2);
    // Object's equals() -> memory address
    // Cat inherits Object's equals()
    Object o2 = new Cat("Peter", 2);
    System.out.println(o1.equals(o2)); // ! false, Cat didn't override the meaning of Object's equals()

    // ! Dog override the meaning of Object's equals()
    Object o3 = new Dog("ABC");
    Object o4 = new Dog("ABC");
    System.out.println(o3.equals(o4)); // ! true

    // Common Usage: Validation
    // When you use "if" to check they are the same "object" in your system/ world.
    if (o3.equals(new Dog("ABC"))){
      System.out.println("This Dog is the ABC dog");
    }

    // toString()
    // ! Cat.java override toString()
    Cat c1 = new Cat ("Mary", 2);
    System.out.println(c1.toString()); // Cat(name=Maryage=2)
    
    // ! Dog.java didn't override toString()
    Dog d1 = new Dog("Tommy");
    System.out.println(d1.toString()); // Dog@1b28cdfa (Object Reference)

    // hashCode(), dimilar to equals() concept
    Object d3 = new Dog("Joker");
    System.out.println(d3.hashCode()); // 250421012
    Object d4 = new Dog("Joker");
    System.out.println(d4.hashCode()); // 1915318863, different to d3, because different Object

    // ! The definition of hashCode() MUST BE same as equals()
    Citizen c10 = new Citizen("John", "A1234");
    Citizen c11 = new Citizen("Peter", "A1234"); 
    System.out.println(c10.equals(c11)); // true

    Citizen c12 = new Citizen("John", "B1234");
    System.out.println(c10.equals(c12)); // false

    System.out.println(c10.hashCode()); // 61538338
    System.out.println(c11.hashCode()); // 61538338
    System.out.println(c12.hashCode()); // 62461859
  }
}
