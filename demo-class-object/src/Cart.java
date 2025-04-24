import java.math.BigDecimal;
import java.util.Arrays;

public class Cart {
  private Item[] items;

  // Item.java -> price, quantity

  public Cart() {
    this.items = new Item[0];
  }

  public Item[] getItems() {
    return this.items;
  }

  public int size() {
    return this.items.length;
  }

  // this.item -> 10
  // for 0-9
  // newItems[10]
  public void add(Item item) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public double checkoutAmount() {
    BigDecimal amount = BigDecimal.valueOf(0.0);
    for (int i = 0; i < this.items.length; i++) {
      amount = BigDecimal.valueOf(this.items[i].amount()).add(amount);
    }
    return amount.doubleValue();
  }

  public static void main(String[] args) {
    int[] arr = new int[3]; // fixed length
    arr[0] = 10;
    arr[1] = 100;
    arr[2] = -2;
    System.out.println(Arrays.toString(arr)); // [10, 100, -2]
    int[] arr2 = arr; // backup the address of array object

    arr = new int[4];
    System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]
    System.out.println(Arrays.toString(arr2));

    String s = "hello";
    System.out.println(s); // printing the value in the address of object
    s = "hello1"; // new String object
    System.out.println(s); // different address

    //
    Cart cart = new Cart();
    Item rice = new Item(99.9, 2);
    Item water = new Item(4.5, 7);
    Item fish = new Item(30.0, 4);
    System.out.println(cart.size()); // 0
    cart.add(rice);
    cart.add(water);
    cart.add(fish);
    System.out.println(cart.size()); // 3
    System.out.println(cart.getItems()[2].getQuantity()); // 4

    System.out.println(cart.checkoutAmount()); // 351.3

  }
}
