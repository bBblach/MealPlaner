package com.bblach.products;

public abstract class Product {
    private static final String PRODUCT_DESCRIPTION="default";
    private String name;
    private double proteins;
    private double carbs;
    private double fats;
    
    public Product(String name, double proteins, double carbs, double fats) {
        super();
        this.name = name;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fats = fats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", proteins=" + proteins + ", carbs="
                + carbs + ", fats=" + fats + "]";
    }

    public static String getProductDescription() {
        return PRODUCT_DESCRIPTION;
    }
    
    
}
