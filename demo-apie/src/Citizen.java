// Citizen -> find Library -> find BookShelf -> finds Books
// book.getBorrow()

import java.util.Collections;
import java.util.Objects;

// ! "Citizen implements Interface Borrowable" -> implies citizen object has borrow method at compile time
public class Citizen implements Borrowable {
  private String name;
  private Library library;
  private Book[] books;
  private String hkid;

  public Citizen(String name) {
    this.name = name;
  }

  public Citizen(String name, String hkid) {
    this.name = name;
    this.hkid = hkid;
  }

  public String getName() {
    return this.name;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public String getHKID() {
    return this.hkid;
  }

  @Override // hkid
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Citizen))
      return false;
    Citizen citizen = (Citizen) obj;
    return this.hkid.equals(citizen.getHKID());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hkid);
  }

  // ! 合約
  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);
  }

  public Integer search(String bookName) {
    Book book = this.library.search(bookName);
    return book != null ? book.getId() : null;
  }

  // ! 要求合約
  public static <T extends Borrowable> void xxx(T object) {
    object.borrow(new Book(1, "ABC"));
  }

  public static void main(String[] args) {
    // Citizen.xxx(new Cat("John", 13)); // because Cat.class didn't implement Borrowable
    Citizen.xxx(new Citizen("John"));

    // ! You have to put a list of object into Collections.sort(), which the object must be having compareTo()
    // Collections.sort(null);
  }
}