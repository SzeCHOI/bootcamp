public class DemoArray {
  public static void main(String[] args) {
    //assign int value 3 into int variable
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;

    // array []
    // right hand side -> creating an array with size 3
    // left hadn side -> assign int array object to int array type (variable)
    int[] arr = new int[3]; // now, we got 3 boxes able to store 3 int values.

    // write
    // First box (index)
    arr[0] = 3;
    // second box
    arr[1] = 4;
    // third box
    arr[2] = -7;

    // Question: int array with size 5.
    // 10, 7, 4, -100, 6
    int[] box = new int[5];
    box[0] = 10;
    box[1] = 7;
    box[2] = 4;
    box[3] = -100;
    box[4] = 6;

    // Question: double array with size 4.
    // assign 4 double values into the array
    double[] d = new double[4];
    d[0] = 2.2;
    d[1] = 3.9;
    d[2] = 8.9;
    d[3] = 1.0;

    // read
    System.out.println(arr[0]); // 10.3
    System.out.println(d[3]); // 1.0

    double amount = 99.9;
    d[3] = amount; // assign double value into a double variable
    System.out.println(d[3]);

  }
}
