public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x); //5

    x = ++x;
int y = 2;


    int k = 0;
    while (k++ < 3) {
      System.out.println("hello");
    }

    x = 10;
    y = 8;

    x = ++y + ++y + 2;
    // Step1 : first ++y -> 9
    // Step2 : second ++y -> 10
    // Step3 : 9 + 10 + 2
    System.out.println(x); // 21
    System.out.println(y); // 10

    y = 8; //reset
    x = y++ + y++ + 2;
    // Step1 : first ++y -> 8
    // Step2 : second ++y -> 9
    // Step3 : 8 + 9 + 2
    System.err.println(x); //19
    System.err.println(y); //10


  }
  
}
