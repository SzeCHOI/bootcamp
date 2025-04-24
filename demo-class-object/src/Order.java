import java.math.BigDecimal;

public class Order {
  private Cart[] carts;

  public Order() {
    this.carts = new Cart[0];
  }

  // 
  public Cart[] getCarts() {
    return this.carts;

  }

  public int sizeCart() {
    return this.carts.length;
  }

  public void sum(Cart cart){
    Cart[] newCarts = new Cart[this.carts.length+1];
    for (int i = 0; i < this.carts.length; i++) {
      newCarts[i] = this.carts[i];
    }
    newCarts[newCarts.length - 1] = cart;
    this.carts = newCarts;
  }

  public double totalAmount() {
    BigDecimal subTotal = BigDecimal.valueOf(0.0);
    for (int i=0; i< this.carts.length; i++){
      subTotal = BigDecimal.valueOf(this.carts[i].checkoutAmount()).add(subTotal);
    }
    return subTotal.doubleValue();

  }

}
