import java.util.Arrays;

public class Teacher {
  private Candy[] candies;

  public Teacher() {
    this.candies = new Candy[] {new Candy("RED"), new Candy("RED"),
        new Candy("RED"), new Candy("RED"), new Candy("RED"),
        new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
        new Candy("YELLOW"), new Candy("YELLOW"), new Candy("YELLOW"),
        new Candy("YELLOW"), new Candy("BLUE"), new Candy("BLUE"),
        new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE"),
        new Candy("BLUE"), new Candy("BLUE"), new Candy("BLUE"),};
  }

  public boolean distribute(Child child, Candy candy) {
    return child.receive(candy);
  }

  public boolean distributeAll(Child[] childs) {
    int totalCandyCount = this.candies.length;
    int idx = 0;
    boolean isEmpty = false;
    while (true) { // 20 times
      for (int i = 0; i < childs.length; i++) { // 0-5
        System.out.println(idx);
        if (!distribute(childs[i], this.candies[idx])) {
          return false;
        }
        this.candies[idx] = null;
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
    return true;
  }

  // Testing
  public static void main(String[] args) {

    // Child child1 = new Child();
    // Candy candy1 = new Candy("RED");
    // t1.distribute(child1, candy1);

    Child child1 = new Child();
    Child child2 = new Child();
    Child child3 = new Child();
    Child child4 = new Child();
    Child child5 = new Child();
    Child child6 = new Child();
    Child[] childs =
        new Child[] {child1, child2, child3, child4, child5, child6};
    Teacher teacher1 = new Teacher();
    teacher1.distributeAll(childs);

    for (int i = 0; i < childs.length; i++) {
      System.out.println(Arrays.toString(childs[i].getCandies()));
    }
  }
}
