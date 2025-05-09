import java.util.Arrays;

public class Teacher {
  private static Candy[] candies = new Candy[] {
      new Candy("RED"),
      new Candy("RED"),
      new Candy("RED"),
      new Candy("RED"),
      new Candy("RED"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("YELLOW"),
      new Candy("BLUE"),
      new Candy("BLUE"),
      new Candy("BLUE"),
      new Candy("BLUE"),
      new Candy("BLUE"),
      new Candy("BLUE"),
      new Candy("BLUE"),
  };

  // static?
  public void distribute(Child child, Candy candy) {
    child.receive(candy);
  }

  public void distributeAll(Child[] childs) {
    int totalCandyCount = Teacher.candies.length;
    int idx = 0;
    boolean isEmpty = false;
    while (true) { // 20 times
      for (int i = 0; i < childs.length; i++) {
        distribute(childs[i], Teacher.candies[idx]);
        Teacher.candies[idx] = null;
        if (idx + 1 >= totalCandyCount) {
          isEmpty = true;
          break;
        }
        idx++;
      }
      if (isEmpty) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    // Teacher t1 = new Teacher();
    // Child child1 = new Child();
    // Candy candy1 = new Candy("RED");
    // t1.distribute(child1, candy1);

    Child child1 = new Child();
    Child child2 = new Child();
    Child child3 = new Child();
    Child child4 = new Child();
    Child child5 = new Child();
    Child child6 = new Child();
    Child[] childs = new Child[] { child1, child2, child3, child4, child5, child6 };
    Teacher t1 = new Teacher();
    t1.distributeAll(childs);

    for (int i =0; i< childs.length; i++){
      System.out.println(Arrays.toString(childs[i].getCandies()));
    }

  }
}
