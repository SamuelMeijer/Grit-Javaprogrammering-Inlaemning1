package org.example;

import java.util.Scanner;

public class InventoryManager {
    public static void checkStock (String[] products, int[] stockBalance) {
        for(int i = 0; i < products.length; i++) {
            System.out.println("Produkten " + products[i] + " har ett lagersaldo på " + stockBalance[i]);
        }
    }

    public static int getProductIndex (String product, String[] products) {
        int index = -1;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(product)) {
                index = i;
            }
        }

        return index;
    }

    public static void updateStock (String[] products, int[] stockBalance) {
        Scanner inventoryScanner = new Scanner(System.in);
        System.out.println("Vilken av produkterna Äpplen, Bananer, Päron, Kiwi vill du uppdatera?");
        String productToChange = inventoryScanner.nextLine();

        // Check if product exists in stock and returns index if it does. Index = -1 if no such product exists.
        int productToChangeIndex = getProductIndex(productToChange, products);

        if (productToChangeIndex < 0) {
            System.out.println("Ingen produkt med namnet " + productToChange + " finns i lagersaldot, kan ej uppdatera lagersaldo för vald produkt.");
            return;
        }

        // Update stock of product
        System.out.println("Produkten " + products[productToChangeIndex] + " har lagersaldo " + stockBalance[productToChangeIndex]);
        System.out.println("Ange nytt lagersaldo: ");
        int newStock = inventoryScanner.nextInt();

        // Check if stock is < 0
        if (newStock < 0) {
            System.out.println("Lagersaldo kan inte vara negativt. Försök igen.");
            return;
        }

        stockBalance[productToChangeIndex] = newStock;
        System.out.println("Produkten " + products[productToChangeIndex] + " har nytt lagersaldo " + stockBalance[productToChangeIndex]);
    }
}
