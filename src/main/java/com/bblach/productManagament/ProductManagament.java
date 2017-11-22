package com.bblach.productManagament;

import java.util.Scanner;

import com.bblach.lists.ProductsList;
import com.bblach.products.CarbProduct;
import com.bblach.products.FatProduct;
import com.bblach.products.ProteinProduct;

public class ProductManagament {
    private static ProductsList<ProteinProduct> proteinsList = new ProductsList<>(
            "Sources of Proteins");
    private static ProductsList<CarbProduct> carbsList = new ProductsList<>(
            "Sources of Proteins");
    private static ProductsList<FatProduct> fatsList = new ProductsList<>(
            "Sources of Proteins");
    private static Scanner keybordInput = new Scanner(System.in);

    public static boolean addProduct() {
        String type = selectType();
        if (type != null) {

            System.out.print("Product name: ");
            String name = keybordInput.nextLine();

            System.out.print("Proteins: ");
            double proteins = keybordInput.nextDouble();
            System.out.print("Fats: ");
            double fats = keybordInput.nextDouble();
            System.out.print("Carbs: ");
            double carbs = keybordInput.nextDouble();

            if (type.equals("fats")) {
                FatProduct newFatProduct = new FatProduct(name, proteins, carbs,
                        fats);

                fatsList.addProduct(newFatProduct);
                keybordInput.nextLine();
                return true;
            } else if (type.equals("carbs")) {
                CarbProduct newCarbProduct = new CarbProduct(name, proteins,
                        carbs, fats);

                carbsList.addProduct(newCarbProduct);
                keybordInput.nextLine();
                return true;
            } else if (type.equals("protein")) {
                ProteinProduct newProteinProduct = new ProteinProduct(name,
                        proteins, carbs, fats);

                proteinsList.addProduct(newProteinProduct);
                keybordInput.nextLine();
                return true;
            }
        }
        keybordInput.nextLine();
        return false;

    }
    public static boolean printProducts() {
        String type = selectType();
        if (type != null) {
            if (type.equals("fats")) {
                System.out.println("Size: " + fatsList.getProducts().size());
                fatsList.printProducts();
                return true;
            } else if (type.equals("carbs")) {
                System.out.println("Size: " + carbsList.getProducts().size());
                carbsList.printProducts();
                return true;
            } else {
                System.out
                        .println("Size: " + proteinsList.getProducts().size());
                proteinsList.printProducts();
                return true;
            }

        }

        return false;
    }
    public static String selectType() {

        System.out.print("Select type: ");
        String inputType = keybordInput.nextLine();
        String[] avaibleTypes = {"fats", "carbs", "proteins"};
        for (String availableType : avaibleTypes) {
            if (availableType.equals(inputType)) {
                return availableType;
            }
        }
        System.out.println("Wrong type");
        return null;

    }
    public static boolean removeProduct() {
        String type = selectType();
        if (type != null) {
            System.out.println("Which product to delete: ");
            String productToRemove = keybordInput.nextLine();

            if (type.equals("fats")) {
                fatsList.removeProduct(productToRemove);
                return true;
            } else if (type.equals("carbs")) {
                carbsList.removeProduct(productToRemove);
                return true;
            } else if (type.equals("protein")) {
                proteinsList.removeProduct(productToRemove);
                return true;
            }
            System.out.println("No such category");
            return false;
        }
        return false;
    }
    public static void loadData() {
        fatsList.addProduct(new FatProduct("olive oil", 1, 2, 19));
        fatsList.addProduct(new FatProduct("butter", 2, 3, 14));
        fatsList.addProduct(new FatProduct("coconut oil", 3, 3, 23));

    }
}
