// ! One to One: One Person has one height and one weight

// ! One to Many

import java.util.Arrays;

public class Classroom {
  private String[] names;
  private String tutor;

  public String[] getNames() {
    return this.names;
  }

  public void setNames(String[] names) {
    this.names = names;
  }

  public void setTutor(String tutor) {
    this.tutor = tutor;
  }

  public static void main(String[] args) {
    Classroom c1 = new Classroom();
    // John Mary
    // create String array;
    String[] students = new String[2];
    students[0] = "John";
    students[1] = "Mary";
    // c1.setNames(student[0]); // error, students is String array object,
    // student[0] -> String object
    c1.setNames(students);
    System.out.println(Arrays.toString(c1.getNames()));// [John, Mary]
    System.out.println(c1.getNames()[0]); // John

    // for loop, print all student names in th classroom
    for (int i = 0; i < c1.getNames().length; i++) {
      System.out.println(c1.getNames()[i]);
    }

    // Find Mary, and replace by Steven.
    for (int i = 0; i < c1.getNames().length; i++) {
      if (c1.getNames()[i].equals("Mary")) {
        c1.getNames()[i] = "Steven";
        break;
      }
    }

    System.err.println(Arrays.toString(c1.getNames())); // [John, Steven]

  }
}
