public class DemoString {
  public static void main (String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // "100100"
    s1 = s1 + "100";
    System.out.println(s1); // "Hello100"

    int x = 246;
    String t3 = s1 + x;
    System.out.println(t3);

    double y = 3.1416;
    char p = '$';
    char e = '=';
    String t4 = "Pie";
    String t5 = t4 + e + p + y;
    System.out.println(t5);

    String coke = "Coke Cola";
    int c = 10;
    String t6 = coke + e + p + c;
    System.out.println(t6);

    // String + int -> String (Step 1)
// Assign String value to String variable (Step 2)
String s3 = "hello" + 13;
System.out.println(s3);

// String + boolean -> String
s3 = s3 + true;
System.out.println(s3);

// ! Sting method 1: equals() -> tools
// ! Primitives has not tools (value storage ONLY)
// String is not a primitive
String s4 = "hello";
System.out.println(s4.equals("hello")); // true, asking if s4 equals to "hello"
System.out.println(s4.equals("male")); // true, asking if s4 equals to "male"

System.out.println(1 + 1); // 2
int r2 = 1 + 1;

boolean result = s4.equals("hello");
System.out.println(result); // ture

System.out.println(s4.equals("Hello")); // false , case sensitive

// ! String method 2: length()
// charm suio
// length() has no parameters
int s4Length = s4.length();
System.out.println(s4.length()); // 5

double d1 = s4.length(); // ! why OK?
// short s10 = s4.length(); // ! why NOT ok?

// ! Sting method 3: charAt()
// 1 is an index, which always start with 0
System.out.println(s4.charAt(1)); // e
System.out.println(s4.charAt(0)); // H
System.out.println(s4.charAt(3)); // l


  }
  
}
