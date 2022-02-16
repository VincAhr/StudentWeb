package de.neuefische.studentweb;

import java.util.Collection;
import java.util.HashMap;

public class OrderRepo {

    private HashMap<String, Order> allMyOrders;

    public OrderRepo() {
        allMyOrders = new HashMap<>();
    }

    public Collection<Order> list() {
        return allMyOrders.values();
    }

    public Order get(String theorder) {
        return allMyOrders.get(theorder);
    }

    public void add(Order newOrder) {
        allMyOrders.put(newOrder.getId(), newOrder);
    }

}
