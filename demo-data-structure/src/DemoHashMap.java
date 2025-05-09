import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // ArrayList -> a set of something (ordering)
    // HashSet -> a set of something (no ordering)

    // key -> value
    // value ( a set of something)
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Jennie");

    ArrayList<Student> class3a = new ArrayList<>();
    class3a.add(s1);
    class3a.add(s2);
    class3a.add(s3);

    Student s4 = new Student("Annie");
    Student s5 = new Student("Joe");
    Student s6 = new Student("Ken");

    ArrayList<Student> class3b = new ArrayList<>();
    class3b.add(s4);
    class3b.add(s5);
    class3b.add(s6);

    // HashMap<Key, Value>
    HashMap<String, ArrayList<Student>> searchEngine = new HashMap<>();
    searchEngine.put("3A", class3a);
    searchEngine.put("3B", class3b);

        // Add a new Student "Steven" into class 3A by HashMap
        // No Loop

    // ! search student by a String value
    ArrayList<Student> results = searchEngine.get("3B");
    for (Student s : results) {
      System.out.println(s.getName());
    }

    UserProfile up1 = new UserProfile("John", "Chan", "jc@gmail.com");
    UserProfile up2 = new UserProfile("Mary", "Cheung", "mc@gmail.com");
    UserProfile up3 = new UserProfile("Lucas", "Lau", "ll@gmail.com");

    // "put()" is something similar to add().
    // put() -> add a whole entry into the HashMap
    HashMap<String, UserProfile> userMap = new HashMap<>();
    userMap.put("johnchan001", up1);
    userMap.put("marycheung100", up2);
    userMap.put("lucasLau999", up3);

    String userId = "marycheung100";
    UserProfile profile = userMap.get(userId);
    System.out.println(profile.getFirstName());
    System.out.println(profile.getLastName());
    System.out.println(profile.getEmail());

    HashMap<Dog, LocalDate> dobMap = new HashMap<>();
    dobMap.put(new Dog(1), LocalDate.of(2024, 12, 5));
    dobMap.put(new Dog(3), LocalDate.of(2022, 8, 31));

    // ! because Dog's equals()
    System.out.println(dobMap.get(new Dog(3))); // 2022-08-31

    System.out.println(dobMap.containsKey(new Dog(1))); // true
    System.out.println(dobMap.containsValue(LocalDate.of(2024, 12, 5))); // true

    HashMap<String, String> nameMap = new HashMap<>();
    nameMap.put("vincent", "orange");
    nameMap.put("lucas", "apple");
    System.out.println(nameMap.get("Jennie")); // null
    nameMap.put("lucas", "lemon");
    System.out.println(nameMap.get("lucau")); // lemon
    // vincent -> "orange!!"
    String newValue = nameMap.get("vincent").concat("!!");
    nameMap.put("vincent", newValue);

    // for-each loop for HashMap
    // HashMap is a set of Entry
    // A entry = key + value
    for (Map.Entry<String, String> entry : nameMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Problem Solving
    // counting
    int[] arr = new int[] { -1, 3, -1, 3, 3, 8 };

    // HashMap
    // Output:
    // there are 2 of -1.
    // there are 3 of 3.
    // there are 1 of 8.
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int num : arr) {
      if (countMap.containsKey(num)) {
        countMap.put(num, countMap.get(num) + 1);
      } else {
        countMap.put(num, 1);
      }
    }
    for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()){
      System.out.println("there are " + entry.getValue() + " of " + entry.getKey());
    }


  }
}
