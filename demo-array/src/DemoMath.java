import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // abs
    // pow

    // int -> double(safe -> auto-conversion)
    double result = Math.pow(2.0, 3.0);
    System.err.println(result); // 8.0

    // square root
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.abs(-3.0)); // 3.0
    double value = -3.0;
    double value2 = 0.0;
    if (value < 0) {
      value2 = value * -1; 
      } else {
        value2 = value;
      }
      System.out.println(value2);

      // Round to integer
      System.out.println(Math.round(3.24)); // 3
      System.out.println(Math.round(3.7812931)); // 4

      // 0 - 1
      System.out.println(Math.random());

      System.out.println(new Random().nextInt(3)); // 0 - 2

      // 1 - 3
      System.out.println(new Random().nextInt(3) + 1); // 1 - 3

      // 1 - 49
      System.out.println(new Random().nextInt(49) + 1); // 1 -49

      // Generate 6 numbers between 1 - 49
      int [] marksix = new int[6];
      int k=0;
      while(k < 6) {
        marksix[k] = new Random().nextInt(49) + 1;
        System.out.println(marksix[k]);
        k++;
      }

      // Generate 6 deifferent numbers between 1-49
      int[] marksix2 = new int[6];
      int uniqueCount = 0;
      boolean isDuplicated = false;
      while(uniqueCount < 6) {
        int generatedValue = new Random().nextInt(49) + 1;

        // ! Check if generated value is already in the array -> isDuplicated
        // code.. for loop + if
        isDuplicated = false;
        for (int i = 0; i < marksix2.length; i++) {
          if (marksix2[i] == generatedValue) {
            isDuplicated = true;
            break;
          }
        }
        if(!isDuplicated) {
          marksix2[uniqueCount] = generatedValue;
          uniqueCount++;
        }
      }
      System.out.println(Arrays.toString(marksix2));

      int temp = -1;
      for (int i = 0; i < marksix2.length - 1; i++) { // i = 0
        for (int j = 0; j < marksix2.length - i - 1; j++) { // j = 0,1,2,3,4 | j=0,1,2,3
          if (marksix2[j + 1] < marksix2[j]) {// swap
            temp = marksix2[j + 1];
            marksix2[j + 1] = marksix2[j];
            marksix2[j] = temp;
          }
        }
      }
      System.out.println(Arrays.toString(marksix2));


  }
}
