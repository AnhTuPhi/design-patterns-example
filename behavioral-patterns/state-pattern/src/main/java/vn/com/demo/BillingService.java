package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class BillingService implements Observer{

    @Override
    public void update(Order order) {
        if (order.getState() instanceof CompletedState) {
            System.out.println("Billing System: Order completed, generating invoice.");
        }
    }
}
