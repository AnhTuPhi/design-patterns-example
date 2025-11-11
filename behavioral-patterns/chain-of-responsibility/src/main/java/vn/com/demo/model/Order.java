package vn.com.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
@Getter
@Setter
public class Order {
    private String status;

    public Order(String status) {
        this.status = status;
    }
}
