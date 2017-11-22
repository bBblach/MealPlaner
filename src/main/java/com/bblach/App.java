package com.bblach;

import java.util.Scanner;

import com.bblach.lists.ProductsList;
import com.bblach.productManagament.ProductManagament;
import com.bblach.products.CarbProduct;
import com.bblach.products.FatProduct;
import com.bblach.products.ProteinProduct;

/**
 * Hello world!
 *
 */
public class App {
    private static Scanner keybordInput = new Scanner(System.in);
    public static void main(String[] args) {
        ProductManagament.loadData();
        printMenu();
        menu();
    }

    public static void printMenu() {
        System.out.println("Press: ");
        System.out.println("1 - to print menu");
        System.out.println("2 - to list products");
        System.out.println("3 - to add product");
        System.out.println("4 - to remove product");
        System.out.println("5 - to quit");
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
                    ProductManagament.printProducts();

                    break;
                }
                case 3 : { // ADD
                    ProductManagament.addProduct();

                    break;
                }
                case 4 : { // REMOVE
                    ProductManagament.removeProduct();
                    break;
                }
                case 5 : {// QUIT
                    status = false;
                }

            }
        }
    }

}
