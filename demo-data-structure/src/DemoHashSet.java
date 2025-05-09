import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // A set of String
    // ! Differece between ArrayList and HashSet
    // 1. ArrayList has ordering, while HashSet has not
    // 2. HashSet avoid duplicate elements, while ArrayList

    HashSet<String> strings = new HashSet<>();
    // Java allows bypass the returned value.
    strings.add("abc");
    strings.add("def");
    System.out.println(strings.size()); // 2

    System.out.println(strings.add("ijk")); // true
    System.out.println(strings.size()); // 3

    // ! because "def" already exists in string HashSet, we cannot add duplicate
    // objects into Hashset
    System.out.println(strings.add("def")); // false
    System.out.println(strings.add("def")); // false
    System.out.println(strings.size()); // 3

    // ! HashSet has most of the methods of ArrayList
    strings.remove("ijk");
    strings.isEmpty();
    strings.contains("abc");
    // strings.clear();

    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");
    names.add("John");

    // ! ArrayList allows duplicate objects
    System.out.println(names.size()); // 3

    HashSet<String> uniqueNames = new HashSet<>();
    for (String name : names) {
      uniqueNames.add(name);
    }
    // HashSet's toString()
    System.out.println(uniqueNames); // [John, Peter]

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Jennie"));
    cats.add(new Cat("Vincent"));
    cats.add(new Cat("Lucau"));
    cats.add(new Cat("Jennie"));
    System.out.println(cats);

    // HashSet
    HashSet<Cat> uniqueCats = new HashSet<>();
    for (Cat cat : cats) {
      uniqueCats.add(cat); // add () -> equals() 
    }


    // add() -> equals() -> duplicate
    HashSet<String> newCats = new HashSet<>();
    for (Cat cat : cats) {
      newCats.add(cat.getName());
    }
    System.out.println(newCats);

    if (cats.size() == newCats.size()) {
      System.out.println("no duplicate");
    } else {
      System.out.println("duplicated");
    }
    // 1. true/ false (Check if any duplicated cat)
    boolean foundDuplicated = false;
    for (Cat cat: cats){
      if (!uniqueCats.add(cat)){
        foundDuplicated = true;
        break;
      }
    }
    System.out.println(foundDuplicated);
    // 2. Has Ordering, remove Duplicated
    HashSet<Cat> catset = new HashSet<>();
    ArrayList<Cat> orderedCats = new ArrayList<>();
    for (Cat cat : cats) {
      if (catset.add(cat)){
        orderedCats.add(cat);
      }
    }
    System.out.println(orderedCats);

    

  }
}
