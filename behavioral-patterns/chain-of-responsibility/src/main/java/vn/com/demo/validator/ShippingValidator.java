package vn.com.demo.validator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import vn.com.demo.model.Order;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShippingValidator extends Validation<Order> {

    InventoryValidator inventoryValidator;
    BillingValidator billingValidator;

    @Override
    public void validate(Order order) {
        System.out.println("shipping validator");
        super.validate(order);
    }

    @Override
    public void buildSubChain() {
        this.addSubChain(inventoryValidator)
                .addSubChain(billingValidator);
    }
}
