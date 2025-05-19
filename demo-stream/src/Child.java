import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child implements Walkable{
  private String name;
  
  public Child(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name= name;
  }

  public String getName(){
    return this.name;
  }

  public void walk(){
    System.out.println("I am walking... ");
  }

  @Override
  public String toString(){
    return "Child("
    + "name= "+ this.name
    + ")";
  }

  public void play(){

    class Watch{
      private int x;
      private int y;
    }
    Watch watch = new Watch();
  }

  // ! Static Nested Class
  public static class Ball {
    private int num;
  }

  // ! Inner Class
  public class Toy {
    private String code;

    @Override
    public String toString() {
      return "Child.Toy("
          + "code= " + this.code
          + ", name= " + name // ! Inner class is able to access Outer Class (Child) attributes
          + ")";
    }
  }

  public static void main(String[] args) {
    Child c1 = new Child("John");
    Child.Ball b1 = new Child.Ball();

    Child c2 = new Child("Peter");
    Child.Toy t1 = c2.new Toy();
    Child.Toy t2 = c2.new Toy();

    System.out.println(t1); // Child.Toy(code= null, name= Peter)
    c2.setName("Annie");
    System.out.println(t1); // Child.Toy(code= null, name= Annie)


    Walkable child = new Walkable(){
      @Override
      public void walk(){
        System.out.println("I am child and walking...");
      }
    };

    Swimable child2 = new Swimable(){
      @Override
      public void swim(){
        System.out.println("i am swimming,... ");
      }
    };

    child2.swim();
    // t1 c2
   // Map<Child, List<Toy>> map = new HashMap<>();

   // 2014 Java 8
   // Java 8: Lambda Expression
   // ! "Walkable child3" -> child3 only need to implement walk() method
   // ! Becasue you have only one mthod need to be implemented.
   // ! so, "() ->" must present walk() implementation
   Walkable child3 = () -> System.out.println("I am walking ...");

  // What if the method implementation has more than one line of code...
      Walkable child4 = () -> {
        System.out.println("I am child.");
        System.out.println("I am walking on the road...");
  };
  child4.walk();

  // ! Because the interface has more than 1 method.
  // that means Lambda cannot support non-functional interface.
  //Living child5 = ()-> {  };
}
}
