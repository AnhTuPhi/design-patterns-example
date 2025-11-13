package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class ShippingService implements Observer{

    @Override
    public void update(Order order) {
        if (order.getState() instanceof NewState) {
            System.out.println("Shipping System: New order received, preparing for shipment.");
        }
    }
}
