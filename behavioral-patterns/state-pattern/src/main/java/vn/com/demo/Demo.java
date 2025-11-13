package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        Order order = new Order(new NewState());

        InventoryService inventoryService = new InventoryService();
        BillingService billingService = new BillingService();
        ShippingService shippingService = new ShippingService();

        order.registerObserver(inventoryService);
        order.registerObserver(shippingService);
        order.registerObserver(billingService);

        order.proceed();
        order.proceed();
    }
}
