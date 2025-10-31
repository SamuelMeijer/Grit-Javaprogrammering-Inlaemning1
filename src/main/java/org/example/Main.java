package org.example;

import java.util.Scanner;


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
                    InventoryManager.checkStock(products, stockBalance);
                    break;
                case 2:
                    InventoryManager.updateStock(products, stockBalance);
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
}
