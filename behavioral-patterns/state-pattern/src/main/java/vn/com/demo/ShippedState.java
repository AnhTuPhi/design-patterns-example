package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class ShippedState implements OrderState{

    @Override
    public void proceed(Order order) {
        System.out.println("Order is shipped, updating inventory.");
        order.setState(new CompletedState());
    }
}
