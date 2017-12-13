package com.bblach;

import java.util.Scanner;


import com.bblach.productManagament.ProductManagament;


public class App {
    private static Scanner keybordInput = new Scanner(System.in);
    private static ProductManagament productManagament = new ProductManagament();
    public static void main(String[] args) {
    	productManagament.loadData();
        printMenu();
        menu();
    }

    public static void printMenu() {
        System.out.println("Press: ");
        System.out.println("1 - to print menu");
        System.out.println("2 - to list products");
        System.out.println("3 - to add product");
        System.out.println("4 - to remove product");
        System.out.println("5 - to add a meal");
        System.out.println("6 - to list  meals");
        System.out.println("7 - to quit");
        // System.out.print(": ");
    }

    public static void menu() {
        boolean status = true;

        while (status) {
            System.out.print(": ");
            int choice = keybordInput.nextInt();
            keybordInput.nextLine();
            switch (choice) {
                case 1 : { // MENU
                    printMenu();

                    break;
                }
                case 2 : { // LSIT
                    productManagament.printProducts();

                    break;
                }
                case 3 : { // ADD
                	productManagament.addProduct(productManagament.createproduct());

                    break;
                }
                case 4 : { // REMOVE
                	productManagament.removeProduct();
                    break;
                }
                case 5 : {// add meal
                	/*MealsManagament.addToMeals();*/
                }
                case 6 : {// list meal
                    status = false;
                }
                case 7 : {// QUIT
                    status = false;
                }

            }
        }
    }

}
