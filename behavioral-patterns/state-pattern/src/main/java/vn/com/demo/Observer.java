package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
@FunctionalInterface
public interface Observer {
    void update(Order order);
}
