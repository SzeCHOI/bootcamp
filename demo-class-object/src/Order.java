import java.math.BigDecimal;

public class Order {
  // Static variable (Not related to Object, common values for all objects)
  private static long counter = 0;

  // ! Attributes (belongs to object)
  private long id;
  private Item[] items;

  // ! Constructors
  public Order() {
    this.items = new Item[0];
    this.id = ++counter;
  }

  // Once we have static variable design, id is not required inputted by user.
  // public Order(long id) {
  // this.items = new Item[0];
  // this.id = id;
  // }

  // ! Methods
  public long getId() {
    return this.id;
  }

  public void add(Item item) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  // Order order = new Order()
  // order.getAmount()
  public double amount() {
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
    }
    return amount.doubleValue();
  }

  public static void main(String[] args) {
    Order order1 = new Order(); // counter -> 1
    Item apple = new Item(6.5, 3);
    order1.add(apple);
    System.out.println(order1.amount()); // 19.5

    Order order2 = new Order(); // counter -> 2
    System.out.println(order2.getId()); // 2
    Order order3 = new Order(); // counter -> 3
    System.out.println(order3.getId()); // 3

    
  }
}
