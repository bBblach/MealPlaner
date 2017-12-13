package com.bblach.meal;

import java.util.ArrayList;

import java.util.List;

/*
*Można dodać sortowanie highestKcal highestProtein
*/

public class MealsManagament {
	private static List<Meal> meals = new ArrayList<>();
		
	public static boolean addToMeals(Meal newMeal){
		meals.add(newMeal);
		System.out.println("Product " + newMeal.getName() + " added");
		return true; 
	}
	public static boolean removeFromMeals(Meal meal){
		
		meals.remove(meals.indexOf(meal));
		return true;
	}
	public static int findMeal(String name){ 
		for (Meal meal: meals){
			if(meal.getName().equals(name)){
				return meals.indexOf(meal);
			}
		}
		return -1;
	}
	public static void printMeals(){
		int iterator=0;
		for (Meal meal: meals){
			System.out.println(++iterator + ". " + meal.getName());
		}
	}
	
}
