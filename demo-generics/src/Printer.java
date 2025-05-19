// Generics
// ! During compile time, you can write less code (StrinPrinter.java, IntegerPrinter.java)

import java.util.ArrayList;
import java.util.HashMap;

public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  // ! During runtime, you have to define "what is T"
  public static void main(String[] args) {
    // Printer<T> genericPrinter = new Printer<T>(1); // error
    Printer<String> StringPrinter = new Printer<String>("hello");
    Printer<Integer> integerPrinter = new Printer<Integer>(10);
    Printer<Object> objectPrinter = new Printer<Object>("hello");
    // objectPrinter.getValue().charAt();
    ((String) objectPrinter.getValue()).charAt(1); // OK

    Printer<Number> numberPrinter = new Printer<>(Long.valueOf(10));
    numberPrinter = new Printer<>(Double.valueOf(10.9));

    ArrayList<String> strings = new ArrayList<>();
    // strings.add(10);
    ArrayList<Object> objects = new ArrayList<>();

    // Java 1.5 (Why Java create Generics? -> because ArrayList, HashSet, HashMap are convenient for use)
    HashMap<String, Integer> map1 = new HashMap<>();
  }
}
