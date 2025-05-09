import java.util.Random;

public class Student {
  // A student has a bag
  // A bag has many Balls (5)

  // A ball has a colour and a number
  // 3 different colours (RED, YELLOW, BLUE)
  // number 1-9

  // random pick a ball from bag
  // 1. place a ball into the bag
  // 2. random pick a ball from bag, return ball.toString() (empty bag -> "Empty Bag!!!")

 private Bag bag;

 public Student(){
  this.bag = new Bag();
 }

 public boolean place(Ball ball){
  return this.bag.add(ball);
 }

 public String randomPick() {
  if (this.bag.isEmpty()){
    return "Empty Bag!!!";
  }
  Ball ball = null;
  while (ball == null) {
  int random = new Random().nextInt(this.bag.getSize()); // 0-4
    ball = this.bag.pick(random);
    if (ball != null) {
      break;
    }
  }
  return ball.toString();

 }


 public static void main(String[] args) {
  Student s1 = new Student(); // Create Student Object, Ball Array Object
  s1.place(new Ball());
  s1.place(new Ball());
 }
}
