public class DemoWrapper {
  public static void main(String[] args) {
    // 8 primitives
    int a = 0;
    long b = 123456;
    short c = 1234;
    float d = 0.333f;
    double e = 0.333;
    byte f = 8;
    boolean g = true;
    char cha = 'a';

    // Wrapper Class of char
    Character c1 = Character.valueOf('a');
    System.out.println(c1); // a
    char c0 = c1.charValue();
    System.out.println(c0);

    System.out.println(c1.compareTo(Character.valueOf('c'))); // -2
    System.out.println(Character.valueOf('c').compareTo(c1)); // 2
    System.out.println(Character.valueOf('c').compareTo(Character.valueOf('c'))); // 0

    // Wrapper Class of boolean
    Boolean b3 = Boolean.valueOf(true);
    Boolean b4 = Boolean.valueOf(false);

    // Wrapper Class of byte, short, int, long
    byte b6 = 2;
    Byte b5 = Byte.valueOf((byte)2);
    // int -> byte (unsafe)
    Short s2 = Short.valueOf((short)2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2L);

    // Wrapper Class of float, double
    Float f3 = Float.valueOf(3.14f);
    Double d3 = Double.valueOf(3.14);

    // ! Autoboxing (Only for the pair of primitive and wrapper class)
    // int value -> Integar variable
    Integer i2 = 2;

    // int -> long (safe conversion)
    long l3 = 2;

    // int value -> long value -> Long (NOT OK for auto-conversion)
    // Long l2 = 2; cannot
    Long l2 = 2L;

    // ! Unboxing
    int i4 = Integer.valueOf(10);
    // int i5 = Long.valueOf(10L); cannot
    long i5 = Long.valueOf(10L);

    // Long -> long -> int -> (autobox) Integar
    Integer i6 = (int) ((long) Long.valueOf(10L));

    // ! compareTo()
    int age = 102;
    // ! Integar never use >, <, >=, <=, We should use compareTo for comparison
    System.out.println(Integer.valueOf(100).compareTo(Integer.valueOf(age))); // -1 (right is larger)
    System.out.println(Integer.valueOf(102).compareTo(Integer.valueOf(age))); // 0 (output only -1/ 0/ 1)

    // unboxing for Math operation (int - int)
    int diff = Integer.valueOf(100) - Integer.valueOf(age);
    System.out.println(diff); // -2

    String s10 = "abcd";
    String s11 = "bcde";
    System.out.println(s11.compareTo(s10)); // 1 (compare first char, b-a)
    System.out.println(s10.compareTo(s11)); // -1 (compare first char, a-b)
    String s12 = "ccde";
    System.out.println(s12.compareTo(s10)); // 2 (compare first char, c-a)
    String s13 = "cdde";
    System.out.println(s13.compareTo(s12)); // 1 (d - c)

    String s14 = "Abcd";
    System.out.println(s14.compareTo(s10));; // -32 (A - a)
    String s16 = "Abcdef";
    System.out.println(s14.compareTo(s16)); // -2

    String name = "John";
    if (!name.equals("John")) {
      // do somethimg
      System.out.println("Not John");
    } else {
      System.out.println("John");
    }


  }
}
