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
public class InventoryValidator extends ValidationStep<Order> {

    @Override
    public void validate(Order order) {
        System.out.println("inventory validator");
        validateNext(order);
    }
}
