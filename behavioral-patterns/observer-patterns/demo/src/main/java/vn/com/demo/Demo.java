package vn.com.demo;

import vn.com.demo.service.BillingService;
import vn.com.demo.service.InventoryService;
import vn.com.demo.service.ShippingService;

public class Demo {

    public static void main(String[] args) {
        Order order = new Order("new");

        InventoryService inventoryService = new InventoryService();
        ShippingService shippingService = new ShippingService();
        BillingService billingService = new BillingService();


        order.registerObserver(inventoryService);
        order.registerObserver(shippingService);
        order.registerObserver(billingService);

        order.setStatus("new");
        order.setStatus("shipped");
        order.setStatus("completed");
    }
}