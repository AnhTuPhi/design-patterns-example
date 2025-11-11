package vn.com.demo.service;

import vn.com.demo.EventObserver;
import vn.com.demo.Order;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
public class InventoryService implements EventObserver {

    @Override
    public void update(Order order) {
        if (order instanceof Order && ((Order) order).getStatus().equals("shipped")) {
            System.out.println("Inventory System: Order shipped, updating inventory.");
        }
    }
}
