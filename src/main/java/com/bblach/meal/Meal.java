package com.bblach.meal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bblach.products.Product;

public class Meal {

	private String name;
	private double calories;
	private double fats;
	private double carbs;
	private double proteins;
	private double weight;
	private Date date;
	private List<Product> products = new ArrayList<>();

	public Meal(String name) {
		super();
		this.name = name;

		date = new Date();

	}

	public void createMeal(List<Product> products) {
		Scanner in = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.print("Enter product name : ");
			String name = in.nextLine();

			System.out.print("Enter weight in grams : ");
			double weight = in.nextDouble();
			addProduct(name, weight, products);

			System.out.print("Add another product? (y/n) : ");
			String choice = in.next();
			if (choice.equals("n")) {
				calculateNutrients();
				in.close();
				status = false;

			}
		}

	}

	public boolean addProduct(String name, double weight, List<Product> products) {
		Product productToAdd = findProduct(name, products);
		if (productToAdd != null) {
			this.products.add(productToAdd);
			System.out.println(name + " added.");
			return true;
		}
		System.out.println("No such product");
		return false;
	}

	public boolean removeProduct() {
		return false;
	}

	public Product findProduct(String name, List<Product> products) {
		for (Product product : products) {
			if (name.equals(product.getName())) {
				return product;
			}
		}

		return null;

	}

	public void calculateNutrients() {
		for (Product product : products) {
			this.calories += product.getCalories();
			this.carbs += product.getCarbs();
			this.proteins += product.getProteins();
			this.fats += product.getFats();
		}
	}
	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public double getFats() {
		return fats;
	}

	public double getCarbs() {
		return carbs;
	}

	public double getProteins() {
		return proteins;
	}

	public double getWeight() {
		return weight;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Meal [name=" + name + ", calories=" + calories + ", fats=" + fats + ", carbs=" + carbs + ", proteins="
				+ proteins + ", date=" + date + ", products=" + products + "]";
	}

}
