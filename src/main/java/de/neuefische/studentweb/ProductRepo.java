package de.neuefische.studentweb;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;


@Repository
public class ProductRepo {

    private HashMap<String, Product> allMyProducts = new HashMap<>();

    public ProductRepo() {
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
