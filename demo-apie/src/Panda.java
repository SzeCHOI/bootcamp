public class Panda extends Animal {
  
  private int age;

  public Panda(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}
