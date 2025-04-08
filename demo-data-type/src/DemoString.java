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
    String s3 = s1 + x;
    System.out.println(s3);

    double y = 3.1416;
    char p = '$';
    char e = '=';
    String s4 = "Pie";
    String s5 = s4 + e + p + y;
    System.out.println(s5);



  }
  
}
