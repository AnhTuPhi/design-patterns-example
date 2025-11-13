package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Order {
    private OrderState state;
    private List<Observer> observers = new ArrayList<>();

    public Order(OrderState state) {
        this.state = state;
    }

    public void setState(OrderState state) {
        this.state = state;
        notifyObservers();
    }

    public OrderState getState() {
        return state;
    }

    public void proceed() {
        state.proceed(this);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
