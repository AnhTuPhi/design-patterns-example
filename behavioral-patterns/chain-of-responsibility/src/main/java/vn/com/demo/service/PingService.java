package vn.com.demo.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import vn.com.demo.controller.PingController;
import vn.com.demo.model.Order;
import vn.com.demo.validator.ShippingValidator;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PingService implements PingController {

    ShippingValidator validator;

    @Override
    public void ping() {
        Order order = new Order("new");
        validator.validate(order);
    }
}
