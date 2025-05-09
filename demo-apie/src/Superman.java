// Fly
// Eat
public class Superman extends Human implements Living, Flyable{
  private String name; // ! Incorrect Design
  
  public Superman(String name){
    // super (name);
    this.name = name;
  }
  
  @Override
  public void eat(){
    System.out.println("I am eating ...");
  }

  @Override
  public void fly(){
    System.out.println("I am flying...");
  }

  @Override
  public void sleep(){
    System.out.println("I am sleeping..");
  }

  @Override
  public String getName() {
    return this.name;
  }

  public void setSecondName(String secondName) {
    super.setName(secondName);
  }

  public 

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    System.out.println(s1.getName()); // null

    s1.drink();
  }
}
