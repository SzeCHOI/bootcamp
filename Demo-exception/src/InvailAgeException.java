// Custom Exception

import java.util.Scanner;

public class InvailAgeException extends RuntimeException {
  private String code;

  public static void main(String[] args) {
    // InvailAgeException iae = new InvailAgeException();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input an age number: ");
    int input = scanner.nextInt();

  try{
    int result = calculate(input);
    System.out.println("The input is " + input + " and the result is " + result);
  }catch(
  InvailAgeException e)
  {
    System.out.println("Please input again. The value age is invalid.");
  }

  scanner.nextLine();

    System.out.println("Enter name: ");
    String name = scanner.nextLine();


    // capture name, name length cannot be > 10
    try{
      int length = nameLength(name);
      System.out.println("The name lenght is " + length);
    } catch (NameTooLongException e) {
      System.out.println("The name is too long. Please enter again.");
    }
}

public static int nameLength(String name){
  if (name.length() > 10){
    throw new NameTooLongException(); // throw an error event
  }
  return name.length();
}

  public static int calculate(int age) {
    if (age < 0) {
      throw new InvailAgeException();
    }
    return age + 10;

  }
}
