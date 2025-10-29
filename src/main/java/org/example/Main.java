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

        boolean ageStatus = validateAge(personAge);
        boolean discountStatus = validateDiscount(personStatus);
        double finalPrice = getPrice(100, ageStatus, discountStatus);
        System.out.println("Personen är " + personAge + " år gammal och har status " + personStatus);
        System.out.println("Det slutgiltiga priset är: " + finalPrice);
    }

    public static boolean validateAge (int age) {
        if ( 18 <= age && age <= 65) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateDiscount (String status) {
        return status == "Student" || status == "Pensionär";
    }

    public static double getPrice (double grundpris, boolean isTarget, boolean hasDiscount) {
        double price;

        if (isTarget && hasDiscount) {
            price = grundpris * 0.75;
        } else if (!isTarget) {
            price = grundpris * 1.1;
        } else {
            price = grundpris;
        }

        return price;
    }
}
