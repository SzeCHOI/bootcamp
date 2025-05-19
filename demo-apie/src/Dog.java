import java.util.HashMap;
import java.util.Objects;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void sound() {
    System.out.println("wow wow...");
  }

  public void bark() {
    System.out.println("barking!!!!");
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Dog))
      return false;
    Dog dog = (Dog) obj;
    return dog.getName().equals(super.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getName());
  }

  // ! After using toString(), System.out.println(d1) -> Dog(name=Steven)

  public static void main(String[] args) {
    Dog d1 = new Dog("Steven");
    System.out.println(d1); // Dog@6d06d69c
    Dog d2 = new Dog("Lucas");
    System.out.println(d1.equals(d2)); // false

    Dog d3 = new Dog("Lucas");
    System.out.println(d2.hashCode()); // 73771435
    System.out.println(d3.hashCode()); // 73771435

    HashMap<Dog, String> dogMap = new HashMap<>();
    dogMap.put(new Dog("Lucas"), "Book");
    dogMap.put(new Dog("Lucas"), "Fish"); // ! replace the entry, because same key (equals() & hashCode())
    System.out.println(dogMap.size()); // 1

  }
}