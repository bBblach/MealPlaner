package com.bblach.lists;

import java.util.ArrayList;
import java.util.List;

import com.bblach.products.Product;

public class ProductsList <T extends Product> {
    private String description;
    private List<T> products;
    public ProductsList(String description) {
        super();
        this.description = description;
        this.products = new ArrayList<>();
    }
    public boolean addProduct(T newProduct){
        if (products.contains(newProduct)){
            return false;
        }
        products.add(newProduct);
        return true;
        
    }
    public boolean removeProduct(String name){
        int indexOfSearchedProduct = findProduct(name);
        if (indexOfSearchedProduct>0){
            products.remove(indexOfSearchedProduct);
            return true;
        }
        System.out.println("Product not found");
        return false;
    }
    public void printProducts(){
        int couter = 1;
        
        for (T product : products){
            System.out.println(couter++ + ". " + product);
        }
    }
    public int findProduct(String name){
        for (T product : products){
            if (product.getName().equals(name)){
                return products.indexOf(product);
            }
        }
        return 0;
    }
    public String getDescription() {
        return description;
    }
    public List<T> getProducts() {
        return products;
    }
    
    
    
    
}
