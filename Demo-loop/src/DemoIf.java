import java.util.Scanner;

public class DemoIf {
  public static void main(String[] args) {
    // if, else if, else
    int x = 25;

    // 1. if + else if + else
    if (x < 10) {
      System.out.println("x < 10"); // ! print
    } else if (x < 15) {
      System.out.println("x < 15"); // not print
    } else if (x >= 20) {
      System.out.println("x >= 20"); // not print
    } else { // 10-19
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

    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 45;

    // base premium = 120
    // Female 40% or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Smoker -> 7% more
    // age 70 or above -> 20% more

    // 1. Female 40 NS -> 8
    // 2. Female 40 S -> 8 + 7
    // 3. Male 16 NS -> 3
    // 4. Male 16 S -> 3 + 7



    double premium = 120.0;
    double extraRate = 0.0;
    if (isFemale) {
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 40) {
        extraRate += 0.08;
      }
    } else { // male
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 16) {
        extraRate += 0.03;
      }
    }
    if (isSmoker) {
      extraRate += 0.07;
    }
    premium *= 1 + extraRate;
    System.out.println(extraRate); // 0.27
    System.err.println(premium); //152.4

    int base = 120;
    int prem = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your gender (M / F) : ");
    int input = scanner.nextInt();
    if (input == 'F') {
      System.out.println("Do you smoke (Y / N) : ");
      if (input == 'Y') {
        prem = base *= 1.07;
        System.out.println("How old are you?");
      }
    } // else

  }
}
