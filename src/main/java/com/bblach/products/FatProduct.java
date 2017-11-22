package com.bblach.products;

public class FatProduct extends Product {
    private static final String PRODUCT_DESCRIPTION="Fats";
    
    public FatProduct(String name, double proteins, double carbs, double fats) {
        super(name, proteins, carbs, fats);
        // TODO Auto-generated constructor stub
    }

    public static String getProductDescription() {
        return PRODUCT_DESCRIPTION;
    }
   

   
    
    
    
}
