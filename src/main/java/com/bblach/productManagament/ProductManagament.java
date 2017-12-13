package com.bblach.productManagament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bblach.products.CarbProduct;
import com.bblach.products.FatProduct;
import com.bblach.products.Product;
import com.bblach.products.ProteinProduct;

public class ProductManagament {

	private List<Product> products;
	Scanner in = new Scanner(System.in);

	public ProductManagament() {

		this.products = new ArrayList<>();
	}

	public Product createproduct() {
		System.out.print("Select type of the product (fat/carb/protein) : ");
		String type = in.nextLine();
		
		String name = null;
		while (name == null){
			System.out.print("Enter name : ");
			 name = in.nextLine();
				if (findProduct(name) != -1){
					System.out.println("Product already on the list");
					name =null;
				}else if (name.equals("return")){
					return null;
				}
		}
		
		

		System.out.print("Enter proteins : ");
		Double proteins = in.nextDouble();
		System.out.print("Enter carbs : ");
		Double carbs = in.nextDouble();
		System.out.print("Enter fats : ");
		Double fats = in.nextDouble();

		in.nextLine();
		if (type.equals("fat")) {

			return new ProteinProduct(name, proteins, carbs, fats);
		} else if (type.equals("carb")) {
			return new ProteinProduct(name, proteins, carbs, fats);
		} else {
			return new ProteinProduct(name, proteins, carbs, fats);
		}

	}

	public boolean addProduct(Product newProduct) {

		if (products.contains(newProduct)) {
			System.out.println(newProduct.getName() + " already on the list");
			return false;
		}
		products.add(newProduct);
		return true;
	}

	public boolean removeProduct() {
		System.out.print("Enter product to remove : ");
		String name = in.nextLine();
		int indexOfSearchedProduct = findProduct(name);
		if (indexOfSearchedProduct == -1) {
			return false;
		}
		products.remove(indexOfSearchedProduct);
		return true;

	}

	public void printProducts() {
		int couter = 1;

		for (Product product : products) {
			System.out.println(couter++ + ". " + product);
		}
	}

	public int findProduct(String name) {
		for (Product product : products) {
			if (product.getName().equals(name)) {
				return products.indexOf(product);
			}
		}
		return -1;
	}

	public void loadData() {
		Product bread = new CarbProduct("bread", 2, 19, 1);
		Product rice = new CarbProduct("rice", 1, 20, 1);
		Product butter = new FatProduct("butter", 2, 1, 17);
		Product olive = new FatProduct("olive oil", 3, 2, 20);
		Product chickenBreast = new ProteinProduct("chicken breast", 18, 5, 5);
		Product beaf = new ProteinProduct("beaf", 28, 5, 5);

		this.addProduct(beaf);
		this.addProduct(chickenBreast);
		this.addProduct(olive);
		this.addProduct(butter);
		this.addProduct(rice);
		this.addProduct(bread);
		this.addProduct(beaf);

	}

	public List<Product> getProducts() {
		return products;
	}

}
