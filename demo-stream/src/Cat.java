public class Cat implements Flyable{

  @Override
  public void fly(){
    System.out.println("Cat is flying.");
  }
  
  public Cat sleep(){
    System.out.println("Cat is sleeping");
    return this;
  }

  public Cat eat() {
    System.out.println("Cat is eating");
    return this;
  }

  public static void main(String[] args) {
    new Cat().sleep().eat();
  }
}
