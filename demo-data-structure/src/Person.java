import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static class SortedByAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
  }

  @Override
  public String toString() {
    return "Person(" + "name= " + this.name + ", age= " + this.age + ")";
  }

  // A -> B -> C
  // Collections.sort(persons) -> loop persons -> each person.compareTo()
  // You prepare program C. Java prepared program B

  public static void main(String[] args) {
    // sorted by age, desceding order

    List<Person> persons = new ArrayList<>(Arrays.asList(new Person("John", 3), new Person("Mary", 12),
        new Person("Peter", 30)));
    // persons.add(new Person("Peter", 3));
    // persons.add(new Person("Mary", 18));
    // persons.add(new Person("Jacky", 27));

    Collections.sort(persons, new Person.SortedByAge());
    System.out.println(persons);
  }
}
