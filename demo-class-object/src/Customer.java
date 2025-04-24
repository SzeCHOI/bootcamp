import java.math.BigDecimal;

public class Customer { // blueprint
  // ! class content

  // Attributes
  // private -> by default, this object is not readable
  private String name;
  private String email;
  // ...
  private Order[] orders; // One customer has many orders, One order has many items

  // VIP, if the total amount of all orders >= 10000 (boolean method isVIP())
  // customer1.isVIP()-> true / false

  public Customer() {
    this.orders = new Order[0];
  }
  
  // 1 second -> 1000ms
  // 0 -1 ms
  // hunman being -> 0.1s 0.2s
  public boolean isVIP() {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.orders.length; i++){
      total = total.add(BigDecimal.valueOf(this.orders[i].amount()));
    }
    return total.doubleValue() >= 10000;
  }

  public void add(OrderV order) {
    OrderV[] newOrderVs = new OrderV[this.orders.length +1];
    for (int i = 0; i < this.orders.length; i++) {
      new OrderV[i] = this.orders[i];
    }
    new OrderV[newOrderVs.length - 1] = order;
    this.orders = new OrderV[i];

  // private double totalSpend;
  // for (int i = 0; i < newItems.lenght; i++){
  // totalSpend = BigDecimal.valueOf(newItems(i)).doubleValue();
  // }
  //public boolean isVIP(){
  //if ( totalSpend >= 10000);
  //return isVIP();
  //}

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  // main method is NOT a must for a class file
  public static void main(String[] args) {
    String s = "hello";

    BigDecimal bd = new BigDecimal("1.3");

    // ! Create Object (new ...)
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());

    OrderV order1 = new OrderV();
    order1.add(new Item(15.3, 9));
    order1.add(new Item(2.5, 3));
    john.add(order1);

    OrderV order2 = new OrderV();
    order2.add(new Item(1000.3, 9));
    mary.add(order2);
    System.out.println(mary.isVIP()); // false

    OrderV order3 = new OrderV();
    order3.add(new Item(200.5, 10));
    mary.add(order3);
    System.out.println(mary.isVIP()); // true

  }
}
