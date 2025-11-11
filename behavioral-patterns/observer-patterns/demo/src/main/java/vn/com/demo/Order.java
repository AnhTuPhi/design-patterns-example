package vn.com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */

public class Order {
    List<EventObserver> observers = new ArrayList<>();
    private String status;

    public Order(String status) {
        this.status = status;
    }

    public void registerObserver(EventObserver observer) {
        observers.add(observer);
    }

    public void unregisterObserver(EventObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (EventObserver observer : observers) {
            observer.update(this);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
