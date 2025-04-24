import java.math.BigDecimal;

public class OrderV { // !this is oringinal answer from Vincent
  // ! Static variable (Not related to Object, common values for all objects)
  private static long counter = 0;

  // !Attributes
  private Item[] items;
  private long id;

  // !Constructor
  public OrderV() {
    this.items = new Item[0];
    this.id = ++counter;
  }
  // Once we have static varible design, id is not required inputted by user
  // public OrderV(long id) {
  //  this.items = new Item[0];
  //  this.id = id;
  //}

  // ! Methods
  public long getId(){
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

  // OrderV order= new OvrdV()
  // order.getAmount ()
  public double amount() {
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
    }
    return amount.doubleValue();
  }

  public static void main(String[] args) {
    OrderV order1 = new OrderV(); // counter -> 1
    Item apple = new Item(6.5, 3);
    order1.add(apple);

    OrderV order2 = new OrderV(); // counter -> 2
    System.out.println(order2.getId()); // 2
    OrderV order3 = new OrderV(); // couner -> 3
    System.out.println(order3.getId()); // 3
  }
}
