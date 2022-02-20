package de.neuefische.studentweb;

import java.util.HashMap;
import java.util.UUID;

public class Order {

    private String id;
    private HashMap<String,Product> products;



    public Order() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }
}
