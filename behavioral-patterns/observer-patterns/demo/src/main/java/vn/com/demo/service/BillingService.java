package vn.com.demo.service;

import vn.com.demo.EventObserver;
import vn.com.demo.Order;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
public class BillingService implements EventObserver {

    @Override
    public void update(Order order) {
        if (order instanceof Order && ((Order) order).getStatus().equals("completed")) {
            System.out.println("Billing System: Order completed, generating invoice.");
        }
    }
}
