package org.example;

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
    }
}
