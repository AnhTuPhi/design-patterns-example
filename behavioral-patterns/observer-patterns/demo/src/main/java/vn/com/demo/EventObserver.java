package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
@FunctionalInterface
public interface EventObserver {

    void update(Order order);

}
