package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("40", 10);
        Item item2 = new Item("50", 20);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.setPaymentStrategy(new PaypalStrategy("test.gmail.com", "mypwd"));
        cart.checkout();

        cart.setPaymentStrategy(new CreditCardStrategy("DAO ANH TU", "1234567890"));
        cart.checkout();
    }
}
