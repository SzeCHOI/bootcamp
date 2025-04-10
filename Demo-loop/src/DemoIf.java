public class DemoIf {
  public static void main(String[] args) {
    // if, else if, else
    int x = 25;

    // 1. if + else if + else
    if (x < 10) {
      System.out.println("x < 10"); // ! print
    } else if (x <15){
      System.out.println("x < 15"); // not print
    } else if (x >= 20) {
      System.out.println("x >= 20"); // not print
    } else { //10-19
      System.out.println("10-19"); // not print
      }

      // 2. if
      if (x >= 0 && x <= 100) {
        System.out.println("x is a number between 0-100");
      }

      // 3. if + else
      if (x % 2 == 0) {
        System.out.println("x is even number");
      } else {
        System.out.println("x is odd number");
      }

      // 4. if + else if
      String s = "goodbye";
      if (s.equals("hello")) {
        System.out.println("this is hello");
      } else if (s.equals("Hello")) {
        System.out.println("this is Hello");
      }
  }
}
