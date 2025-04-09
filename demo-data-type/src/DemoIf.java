public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    // asking if x > 3
    // x > 3 -> true/ false
    boolean result = x > 3;
    System.out.println(result); // false

    boolean result2 = x >= 3;
    System.out.println(result2); // true

    // if condition
    if (x > 3) { // false -> skip code block
      System.out.println("x is larger than 3");
    }

    if (x >= 3) {
      System.out.println("x is larger or euqal to 3");
    }

    // if + else
    if (x > 3) {
      System.out.println("do somthing ...");
    } else { // implicaiton: x <= 3
      System.out.println("do somthing else ...");
    }

    // ==
    // x = 3, "=" -> assignment (assign 3 to x)
    // ! "==" -> asking if thery are same value
    char gender = 'F';
    if (gender == 'M') { // false
      System.out.println("He is male.");
    } else {
      System.out.println("She is female.");
    }

    // ! "!=" -> asking if they are not equal
    if (gender != 'M') { // true
      System.out.println("Not a male");
    }

    if (x == 3) {
      System.out.println("superman");
    }

    // Math Operations: +, -, *, /, %
    int r = 14 / 3;
    System.out.println(r); // 4

    // "%" -> remainder
    int r2 = 14 % 3;
    System.out.println(r2); // 2

    // Comparision operator: >, <, >=, <=, !=, ==
    // Apply for all primitives

    // String ()
    // equals()
    String s2 = "Bootcamp";
    if (s2.equals("Bootcamp")) { // true
      System.out.println("12345");
    }

     // Approach 1
     // Step 1: s2.equals ("Bootcamp") -> true
     // Step 2: true == false -> false
     // Step 3: Skip code block
    if (s2.equals("Bootcamp") == false) { 
      System.out.println("23456");
    }

    // Approach 2
     // Step 1: s2.equals ("Bootcamp") -> true
     // Step 2: !true -> false
     // Step 3: Skip code block
    if (!s2.equals("Bootcamp")) {
      System.out.println("23456");
    }

    boolean r3 = !(x > 3); // !false -> true
    System.out.println(r3); //true

    boolean isRaining = true;
    if (!isRaining) {
      System.out.println("I am runing...");
    }

    // if + length(), charAt()
    if (s2.length() >= 3) {
      System.out.println("hello"); // print
    } else {
      System.out.println("goodbye"); // skip
    }

    // Question: check if the last character of s2 equals to 'a'. 
    // if yes, print "yes", if no, print "no"
    // ! chartAt() + lenght()
    // Step 1: s2.length() -> 8
    // Step 2: 8 - 1 -> 7
    // Step 3: charAt(7) -> 'p'
    // Step 4: 'p' == 'a' -> false
    // Step 5: print no

    if (s2.charAt(s2.length()-1) == 'a') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // Question: Find the middle char of the String
    // abcde -> c
    // abcd -> c
    // ab -> b
    // a -> a

    String s3 = "ab";
    System.out.println(s3.charAt(s3.length()/2));

    System.out.println(s3.length()/2);

    String s4 = "abcdef";
    if (s4.length() % 2 == 1) { //odd length
      System.out.println(s4.charAt(s4.length() / 2));
    } else {
      System.out.println(s4.charAt(s4.length() / 2 -1));
    }

    // odd number
    int x5 = 7;
    // Assigment (right to left)
    boolean isOdd = x5 % 2 == 1;
    System.out.println(isOdd); //true

    boolean isLargerThan5 = x5 >5;
    System.out.println(isLargerThan5); // True

    // && -> AND
    if (isOdd && isLargerThan5) {
      System.out.println("It is an odd number and larger than 5.");
    }

    // even number and larger than 5
    if (!isOdd && isLargerThan5) {
      System.out.println("It is an even nunber and larger than 5.");
    }

    if (x5 % 2 == 1 && x5 > 5) {

    }

    // || -> or
    if (isOdd || isLargerThan5) {
      System.out.println("It is an odd number OR larger than 5.");
    }

    int x6 = 10;
    // Step 1: x6 < 9. If true, exit criteria checking; if false, go step 2.
    // Step 2: x6 % 2 == 0 && x6 > 0
    if (x6 < 9 || x6 % 2 == 0 && x6 > 0) {
      System.out.println("yes");
    }
    
    // ! For loop
    // 3 Stateents
    // for (initialization; continue condition; modifier- )
    // Step 1: int i = 0/
    // Step 2: check if i < 3 -> true, next step
    // Step 3: print  hello
    // Step 4: i = i + 1 -> 1
    // Step 5: check if i < 3 -> true
    // Step 6: print hello
    // Step 7: i = i + 1 -> 3
    // Step 8: check if i < 3 -> true, next step
    // Step 9: print hello
    // Step 10 : i = i + 1 -> 3
    // Step 11: check if i < 3 -> false -> exit the loop

    int count = 3;
    for (int i = 0; i < count; i= i +1) {
      System.out.println("hello");
    }
    
    // Question: Counting
    String s5 = "hello world"; // index = 0, 1, 2, 3, 4
    // Count how many character 'o' in s5.
    int counter = 0;

    for (int i = 0; i < s5.length(); i = i + 1) { // 0,1,2,3,4
      System.out.println("i=" + i);
      if (s5.charAt(i) == 'o'){
        counter = counter + 1;
      }
    }
    System.out.println("Number of o= " + counter);

    }

    







    }



