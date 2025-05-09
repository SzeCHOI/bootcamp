import java.util.Objects;

public class Book {

  private int id;
  private String name;
  private Library library; // book -> library object address

  public Book(int id, String name) {
    this.name = name;
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  // ! equals()
  // this.book vs book
  public boolean equals(Object obj) {
    if (this == obj) // object address
      return true;
    if (!(obj instanceof Book)) // ! check if obj is an object of Book Class
      return false;
      Book book = (Book) obj;
      // return this.id == book.getId() && this.name.equals(book.getName());
      return Objects.equals(this.id, book.getId());
      //&& Objects.equals(this.name, book.getName());
  }

  public static void main(String[] args) {
    // ! In Java, all class implicitly extends Object
    Human h1 = new Superman("John"); // upgrade
    Object o1 = new Superman("John"); // upgrade
    Superman sm = (Superman) h1;

    Book b1 = new Book(1, "ABC");
    Book b2 = new Book(2, "ABC");
    System.out.println(b1.equals(b2)); // false
    Book b3 = new Book(1, "DEF");
    System.out.println(b1.equals(b3)); // true
    System.out.println(b1.equals(new Cat("IJK", 1))); // false
    Book b4 = b1;
    System.out.println(b1.equals(b4)); // true

    Animal a1 = new Cat("Steven", 10);
    System.out.println(a1 instanceof Cat); // true
    System.out.println(a1 instanceof Animal); // true
    a1 = new Dog("Peter");
    // a1 is a dog or cat?
    System.out.println(a1 instanceof Animal); // true
    System.out.println(a1 instanceof Cat); // false
    System.out.println(a1 instanceof Dog); // true

    Cat a2 = new Cat("Mary", 12);
    System.out.println(a2 instanceof Cat); // ! doesn't make sense


  }

}
