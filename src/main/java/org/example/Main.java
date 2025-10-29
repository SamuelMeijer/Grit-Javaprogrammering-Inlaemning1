package org.example;

public class Main {
    static void main() {
        /* **** REMOVE COMMENT TO RUN ASSIGNMENT 1 ****
        // Uppgift 1 - Kalkylator
        Calculator calculator = new Calculator();
        calculator.runCalculation();
        **** REMOVE COMMENT TO RUN ASSIGNMENT 1 **** */

        // Uppgift 2 - Betygskalkylator och Array-analys
        int[] myNumbs = {36,77,68,92,73};

        double avgOfPoints = avgPointsCalculator(myNumbs);
        System.out.println("The class got an average score of: " + avgOfPoints);

        for (int score: myNumbs) {
            String grade = setGrade(score);

            System.out.println("Poäng " + score + " ger betyg " + grade);
        }
    }

    // Uppgift 2 - Betygskalkylator och Array-analys
    public static double avgPointsCalculator (int[] points){
        int sumOfPoints = 0;

        for (int point : points) {
            sumOfPoints += point;
        }

        return (double) sumOfPoints / points.length;
    }

    public static String setGrade (int point) {
        String grade;

        if (point >= 90) {
            grade = "A";
        }   else if (point >= 80) {
            grade = "B";
        } else if (point >= 70) {
            grade = "C";
        } else if (point >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }
}
