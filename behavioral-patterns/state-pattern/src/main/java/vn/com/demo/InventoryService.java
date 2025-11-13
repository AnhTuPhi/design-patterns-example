package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class InventoryService implements Observer{

    @Override
    public void update(Order order) {
        if (order.getState() instanceof ShippedState) {
            System.out.println("Inventory System: Order shipped, updating inventory.");
        }
    }
}
