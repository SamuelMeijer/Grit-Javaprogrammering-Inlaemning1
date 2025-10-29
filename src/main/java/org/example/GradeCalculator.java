package org.example;

public class GradeCalculator {
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
