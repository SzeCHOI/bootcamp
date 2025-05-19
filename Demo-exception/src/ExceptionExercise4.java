import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();

    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration
    // is Fail."
    // or "User Registeration is Success."

    // try, catch
    try {
      registerUser(username, password, email);
      System.out.println("User Registration is Success");
    } catch (UserRegistrationException e) {
      System.out.println("User Registration fail");
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    // code here ...
    public UserRegistrationException(String message) {
      super(message); // call parent constructo, then the parent store the message
    }
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should
  // throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong
  // is the username.
  public static void registerUser(String username, String password,
      String email) {
    // code here ...
    // try{
    // validateUsername(username);
    // validatePassword(password);
    // validateEmail(email);
    // System.out.println("User registered successfully : " + username);
    // } catch (IllegalArgumentException e) {
    // throw new UserRegistrationException(e.getMessage());
    // }
    // }

    String errorMessage = "";
    boolean errorFound = false;
    try {
      validateUsername(username);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }

    try {
      validateUsername(password);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }

    try {
      validateUsername(email);
    } catch (IllegalArgumentException e) {
      errorFound = true;
      errorMessage += e.getMessage();
    }
    if (errorFound) {
      throw new UserRegistrationException(errorMessage);
    }
    System.out.println("User registered successfully: " + username);
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == null || "".equals(username)) {
      throw new IllegalArgumentException("Username validation fail.");
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    // contains..
    boolean withSpecialChar = password.contains("!") || password.contains("@")
        || password.contains("$") || password.contains("&")
        || password.contains("_");
    if (password.length() < 8 || !withSpecialChar) {
      throw new IllegalArgumentException("Password validation fail.");
    }
  }
  // boolean notContainSpecialChar = !password.contains("!") &&
  // !password.contains("@") &&
  // !password.contains("$") && !password.contains("&")&& !password.contains("_");
  // if (password.length() < 8 || notContainSpecialChar) {
  // throw new IllegalArgumentException();
  // }
  // }

  // Throw IllegalArgumentException if String email is null or it does not contain
  // character @
  private static void validateEmail(String email) {
    // code here ...
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Email validation fail.");
    }
  }
}