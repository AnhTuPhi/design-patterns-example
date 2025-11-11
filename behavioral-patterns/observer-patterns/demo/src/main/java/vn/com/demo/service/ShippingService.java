package vn.com.demo.service;

import vn.com.demo.EventObserver;
import vn.com.demo.Order;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
public class ShippingService implements EventObserver {

    @Override
    public void update(Order order) {
        if (order instanceof Order && ((Order) order).getStatus().equals("new")) {
            System.out.println("Shipping System: New order received, preparing for shipment.");
        }
    }
}
