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


        // Uppgift 3 - Enkelt Prisvalideringssystem
        int personAge = 23;
        String personStatus = "Student";

        boolean ageStatus = PriceCalculator.validateAge(personAge);
        boolean discountStatus = PriceCalculator.validateDiscount(personStatus);
        double finalPrice = PriceCalculator.getPrice(100, ageStatus, discountStatus);
        System.out.println("Personen är " + personAge + " år gammal och har status " + personStatus);
        System.out.println("Det slutgiltiga priset är: " + finalPrice);




        /* **** REMOVE COMMENT TO RUN ASSIGNMENT 4 ****
        // Uppgift 4 - Lagerhantering med Meny
        // TODO: Inte färdig! Lägg till While-loop och flytta till egen Class. Fråga om sista delen av instruktioner, förstår ej.
        String[] productsArr = {"Äpplen", "Bananer", "Päron", "Kiwi"};
        ArrayList<String> products = new ArrayList<String>();
        for (int i = 0; i < productsArr.length; i++) {
            products.add(productsArr[i]);
        }

        int[] stockBalance = {10, 5, 8, 12};

        checkStock(products, stockBalance);
        updateStock(products, stockBalance);
    }

    public static void checkStock (ArrayList<String> products, int[] stockBalance) {
        for(int i = 0; i < products.size(); i++) {
            System.out.println("Produkten " + products.get(i) + " har ett lagersaldo på " + stockBalance[i]);
        }
    }

    public static void updateStock (ArrayList<String> products, int[] stockBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken av produkterna Äpplen, Bananer, Päron, Kiwi vill du uppdatera?");
        String productToChange = scanner.nextLine();

        // Check if product exists in stock
        if (!products.contains(productToChange)) {
            System.out.println("Ingen produkt med namnet " + productToChange + " finns i lagersaldot, kan ej uppdatera lagersaldo för vald produkt.");
            return;
        }

        // Update stock of product
        int indexOfProduct = products.indexOf(productToChange);
        System.out.println("Produkten " + productToChange + " har lagersaldo " + stockBalance[indexOfProduct]);
        System.out.println("Ange nytt lagersaldo: ");
        int newStock = scanner.nextInt();

        // Check if stock is < 0
        if (newStock < 0) {
            System.out.println("Lagersaldo kan inte vara negativt. Försök igen.");
            return;
        }

        stockBalance[indexOfProduct] = newStock;
        System.out.println("Produkten " + productToChange + " har nytt lagersaldo " + stockBalance[indexOfProduct]);

        scanner.close();
        **** REMOVE COMMENT TO RUN ASSIGNMENT 4 **** */
    }
}
