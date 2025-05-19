import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    cats.add(new Cat("John"));
    System.out.println(cats); // [Cat(name=John), Cat(name=Jacky)]

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    ArrayList<String> names = new ArrayList<>();
    names.add("john");
    names.add("peter");

    ArrayList<ArrayList<String>> strings = new ArrayList<>();
    strings.add(fruits);
    strings.add(names);

    System.out.println(strings.get(0)); // fruit list
    System.out.println(strings.get(1)); // name list

    // HashMap?
    // Map is an interface of HashMap
    Map<String, ArrayList<String>> map = new HashMap<>();
    map.put("fruit", fruits);
    map.put("name", names);
    System.out.println(map.get("name")); // [john, peter]

    // Floor
    Map<String, Map<String, ArrayList<String>>> map2 = new HashMap<>();
    ArrayList<String> p1a = new ArrayList<>(List.of("John", "Peter"));
    ArrayList<String> p1b = new ArrayList<>(List.of("Sally", "Tommy"));

    ArrayList<String> p2a = new ArrayList<>(List.of("ABC", "DEF"));

    ArrayList<String> p3a = new ArrayList<>(List.of("OPQ", "XYZ"));
    ArrayList<String> p3b = new ArrayList<>(List.of("IJK", "RST"));
    ArrayList<String> p3c = new ArrayList<>(List.of("KLJ", "000"));

    Map<String, ArrayList<String>> lineMap = new HashMap<>();
    lineMap.put("PA", p1a);
    lineMap.put("PB", p1b);

    // addddddddddddddd

    // Dog, Cat
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Cat("John"));
    animals.add(new Dog(13));
    for (Animal animal : animals) {
      if (animal instanceof Cat) {
        System.out.println(((Cat) animal).getName());
      } else if (animal instanceof Dog) {
        System.out.println(((Dog) animal).getAge());
      }
    }

    // Generics
    // The definition of arraylist can be ArrayList<Cat>, ArrayList<Dog> and ArrayList<animal>
    // ! Difference between "ArrayLit<? extends Animal>" and "ArrayList<Animal>"
    ArrayList<? extends Animal> animals3 = new ArrayList<Cat>();
    animals3 = new ArrayList<Dog>();
    animals3 = new ArrayList<Animal>();
    ArrayList<? extends Animal> animals4 = new ArrayList<Dog>();
    ArrayList<? extends Animal> animals5 = new ArrayList<Animal>();
    // animals3.add(new Cat("Lucas"));


    // Scenario 1:
    // 2 Cat List ("cat1", "cat 2") and 1 Dog List ("dog1")
        Map<String, ArrayList<? extends Animal>> map1 = new HashMap<>();

        // Convenient for writing data
        ArrayList<Cat> catlist1 = new ArrayList<>();
        catlist1.add(new Cat("Ken"));
        catlist1.add(new Cat("Oscar"));

        map1.put("cat1", catlist1);

        ArrayList<Dog> doglist1 = new ArrayList<>();
        doglist1.add(new Dog(10));
        doglist1.add(new Dog(99));

        map1.put("dog1", doglist1);

        // Data retrieval (read -> No obvious advantages)
        for (Animal animal : map1.get("cat1")){

        }



    // Senario 2:
    // manya animlal list -> every animal list contains cat and dog.
    Map<String, ArrayList<Animal>> catMap2 = new HashMap<>(); // ! This design idicates many lists of (cat and dog)


    // ! Animal is the parent of Cat (OK)
    // ! but ArrayList<Aniaml> IS NOT the parent of ArrayList<Cat>
    // cat

  }
}
