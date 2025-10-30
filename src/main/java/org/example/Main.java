package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main() {
        /* **** REMOVE COMMENT TO RUN ASSIGNMENT 1 ****
        // Uppgift 1 - Kalkylator
        Calculator calculator = new Calculator();
        calculator.runCalculation();
        **** REMOVE COMMENT TO RUN ASSIGNMENT 1 **** */



        /* **** REMOVE COMMENT TO RUN ASSIGNMENT 2 ****
        // Uppgift 2 - Betygskalkylator och Array-analys
        int[] myNumbs = {36,77,68,92,73};

        double avgOfPoints = GradeCalculator.avgPointsCalculator(myNumbs);
        System.out.println("The class got an average score of: " + avgOfPoints);

        for (int score: myNumbs) {
            String grade = GradeCalculator.setGrade(score);

            System.out.println("Poäng " + score + " ger betyg " + grade);
        }
         **** REMOVE COMMENT TO RUN ASSIGNMENT 2 **** */



        /* **** REMOVE COMMENT TO RUN ASSIGNMENT 3 ****
        // Uppgift 3 - Enkelt Prisvalideringssystem
        int personAge = 23;
        String personStatus = "Student";

        boolean ageStatus = PriceCalculator.validateAge(personAge);
        boolean discountStatus = PriceCalculator.validateDiscount(personStatus);
        double finalPrice = PriceCalculator.getPrice(100, ageStatus, discountStatus);
        System.out.println("Personen är " + personAge + " år gammal och har status " + personStatus);
        System.out.println("Det slutgiltiga priset är: " + finalPrice);
        **** REMOVE COMMENT TO RUN ASSIGNMENT 3 **** */



        // Uppgift 4 - Lagerhantering med Meny
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Äpplen", "Bananer", "Päron", "Kiwi"};
        int[] stockBalance = {10, 5, 8, 12};
        int userSelection = 0;

        do {
            System.out.println("Lagerhantering");
            System.out.println("1. Visa lagerstatus");
            System.out.println("2. Uppdatera saldo (Lägg till/Ta bort)");
            System.out.println("3. Avsluta");

            System.out.println("Välj vad du vill göra");
            if (scanner.hasNextInt()) {
                userSelection = scanner.nextInt();
            } else {
                System.out.println("Du valde inte ett giltigt alternativ, försök igen.");
                scanner.next();
                continue;
            }


            switch (userSelection) {
                case 1:
                    checkStock(products, stockBalance);
                    break;
                case 2:
                    updateStock(products, stockBalance);
                    break;
                case 3:
                    System.out.println("Avslutar...");
                    break;
                default:
                    System.out.println("Du valde inte ett giltigt alternativ, försök igen.");
            }
        }
        while (userSelection != 3);

        scanner.close();
    }

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
        Scanner scanner = new Scanner(System.in); //TODO: remove?
        System.out.println("Vilken av produkterna Äpplen, Bananer, Päron, Kiwi vill du uppdatera?");
        String productToChange = scanner.nextLine();

        // Check if product exists in stock and returns index if it does. Index = -1 if no such product exists.
        int productToChangeIndex = getProductIndex(productToChange, products);

        if (productToChangeIndex < 0) {
            System.out.println("Ingen produkt med namnet " + productToChange + " finns i lagersaldot, kan ej uppdatera lagersaldo för vald produkt.");
            return;
        }

        // Update stock of product
        System.out.println("Produkten " + products[productToChangeIndex] + " har lagersaldo " + stockBalance[productToChangeIndex]);
        System.out.println("Ange nytt lagersaldo: ");
        int newStock = scanner.nextInt();

        // Check if stock is < 0
        if (newStock < 0) {
            System.out.println("Lagersaldo kan inte vara negativt. Försök igen.");
            return;
        }

        stockBalance[productToChangeIndex] = newStock;
        System.out.println("Produkten " + products[productToChangeIndex] + " har nytt lagersaldo " + stockBalance[productToChangeIndex]);

        // TODO: remove?
        // scanner.close();
    }
}
