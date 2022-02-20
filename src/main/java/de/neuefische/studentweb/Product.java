package de.neuefische.studentweb;

import java.util.UUID;

public class Product {

    private final String id;
    private String name;

    public Product(String name, String s) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

