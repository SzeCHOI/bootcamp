import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  public Item () {

  }

  public Item(double price, int quantity){
    this.price = price;
    this.quantity = quantity;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  // item.getPrice()
  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  // similar to BMI
  public double amount(){
    return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
  }

  public static void main(String[] args) {
    Item item1 = new Item();
    item1.setPrice(10);
    item1.setQuantity(2);

    System.out.println(item1.amount());
  }
}
