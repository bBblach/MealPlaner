package com.bblach.test;



import com.bblach.meal.Meal;
import com.bblach.productManagament.ProductManagament;

public class TestProductManagament {
	private static  ProductManagament products = new ProductManagament();
	
	public static void main(String[] args) {
		products.loadData();
		products.printProducts();
		Meal chickenRice = new Meal("Chicken with rice and brockolli");
		chickenRice.createMeal(products.getProducts());
		System.out.println(chickenRice.toString());
		
		
	}

	
	

}
