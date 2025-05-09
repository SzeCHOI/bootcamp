public class DemoEncapsulation {
  public static void main(String[] args) {
    // Encapsulation

    // Role of writing program
    // ! 1. Author
    // ! 2. User

    // Customer, Order, Item
    // Customer has Orders (Order[])
    // Order has Item (Item[])
    // Customer.class -> add(Order order)
    // Order.class -> add(Item item)
    // Order.class -> remove(Item item)

    // Encapsulation
      // 1. Author use array to present One to Many (In future, Author can use ArrayList instead of array)
      // AND
      // 2. provide add() and remove(), but not setter

    // ! from Author perspective
      // Access Control for attributes (read and write)
      // The ways to store data (data structure)

    // ! from user perspective
    // Readability (Convenient for calling method, easy to understand)
      // customerA.add(order)
      // orderA.add(itemA)
  }
}
