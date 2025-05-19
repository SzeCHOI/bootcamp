import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal implements Comparable<Animal> {
  private LocalDate dob;
  public Animal (){}

  public Animal(LocalDate dob){
    this.dob= dob;
  }

  public LocalDate getDob(){
    return this.dob;
  }

  @Override
  public int compareTo(Animal animal){
    return this.dob.isAfter(animal.getDob()) ? -1 : 1;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", LocalDate.of(2024, 6, 5));
    Cat c2 = new Cat("Peter", LocalDate.of(2024, 7, 5));
    Cat c3 = new Cat("Lucas", LocalDate.of(2024, 6, 30));
    List<Cat> cats = new ArrayList<>();
    cats.add(c1);
    cats.add(c2);
    cats.add(a3);
    Collections.sort(cats); // safe -> compile time: checked Cat.class has Comparable interface
    System.out.println(cats);
  }
}
