// Citizen -> find Library -> find BookShelf -> finds Books
// book.getBorrow()

import java.util.Objects;

public class Citizen implements Borrowable {
  private String name;
  private Library library;
  private Book[] books;
  private String hkid;

  public Citizen(String name) {
    this.name = name;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public Citizen (String name, String hkid){
    this.name = name;
    this.hkid = hkid;
  }

  public String getHkid() {
    return this.hkid;
  }

  @Override // hkid
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Citizen))
      return false;
    Citizen hkid = (Citizen) obj;
    return this.getHkid().equals(hkid.getHkid());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.hkid);
  }

  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);
  }

  public boolean search(String bookName) {
    return this.library.search(bookName) != null;
  }
}
