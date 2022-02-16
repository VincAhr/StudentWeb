package de.neuefische.studentweb;

import java.util.Collection;
import java.util.HashMap;

public class ProductRepo {

    private HashMap<String, Product> allMyProducts;

    public ProductRepo() {
        allMyProducts = new HashMap<>();
    }

    public Collection<Product> list(){
        return allMyProducts.values();
    }

    public Product get(String searchedId){
        return allMyProducts.get(searchedId);
    }

    public void add(Product newProduct){
        allMyProducts.put(newProduct.getId(), newProduct);
    }
}
