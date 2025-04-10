import java.util.Scanner;

public class DemoGuessGamo {
  public static void main(String[] args) {
    // 1 - 100
    // Bomb = 67

    // User A: 93 (1-100)
    // User B: 49 (1-92)
    // User A: 66 (67-92)
    // User B: 68 (67-92)
    // User A: 67 (67-67) -> User B win.

    int bomb = 67; // random number
    // loop
    // Scanner (Collect user input)
    // ! User A and B ? counter -> User A / B
    // Adjust the range of numbers
    // Prompt Question: "Please inupt a number: "
    // continue condition
 Scanner scanner = new Scanner(System.in);
    int input = -1;
    int min = 1;
    int max = 100;
    int round = 0;
    char user = 'A';
    

    while (input != bomb) {
      if (round % 2 == 1) {
        user = 'B';
      } else {
        user = 'A';
      }
     
      System.out.println("User " + user + ", Please input a number between " + min + "-" +max);
      input = scanner.nextInt();
      // Validate input if it is valid
      //Adjust the range of numbers
      if (input >= min && input <= max) { 
        // if (input < min || input > max) {
        // continue;}
        if (input > bomb) {
        max = input - 1;
      } else {
        min = input + 1;
      }
      round++;
      }
      
      // User A, round 1, lose
    if (round % 2 == 1) {
      user = 'B';
    }else {
      user = 'A';
    System.out.println("Game end. User " + user + " win.");
    
} 
    
    }
    

    //while (input != bomb) 
      // Prompt Question
      // collect input
      //
      // Adjust the range of numbers
      // collect input
    

    //Scanner scanner = new Scanner(System.in);
    //System.out.println("Please input a number:");
    //int input = scanner.nextInt();
    //int x = 0;
    //int y = 1;
    //int z = 100;
    //while (input != bomb) {
      //x = input;
      //if (x > bomb) {
        //z = x;
      //} else {
          //y = x;
        

}
}




    
    
  
  

