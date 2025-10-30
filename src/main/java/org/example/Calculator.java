package org.example;

import java.util.Scanner;

public class Calculator {
        // Uppgift 1 - Kalkylator
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber;
        String typeOfCalc;

         public void runCalculation () {
            System.out.println("Choose a number");
            firstNumber = scanner.nextInt();
            System.out.println("Choose a second number");
            secondNumber = scanner.nextInt();
            scanner.nextLine(); // Consuming the leftover new line from 'scanner.nextInt()'.
            System.out.println("Please input one of the following methods: addition, subtraction, multiplication, division, average");
            typeOfCalc = scanner.nextLine().toUpperCase();

            switch (typeOfCalc) {
                case "ADDITION":
                    additionCalc(firstNumber,secondNumber);
                    break;
                case "SUBTRACTION":
                    subtractionCalc(firstNumber,secondNumber);
                    break;
                case "MULTIPLICATION":
                    multiplicationCalc(firstNumber,secondNumber);
                    break;
                case "DIVISION":
                    divisionCalc(firstNumber,secondNumber);
                    break;
                case "AVERAGE":
                    averageCalc(firstNumber,secondNumber);
                    break;
                default:
                    System.out.println("No valid method was chosen, can't generate a sum");
            }

        scanner.close();
    }

    public void additionCalc (int firstNumber, int secondNumber) {
             System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }

    public void subtractionCalc (int firstNumber, int secondNumber) {
            System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }

    public void multiplicationCalc (int firstNumber, int secondNumber) {
            System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }

    public void divisionCalc (int firstNumber, int secondNumber) {
             if (secondNumber == 0) {
                 System.out.println("Can't divide by zero, try again!");
             } else {
                 float quotientOfNumbers = (float) firstNumber / secondNumber;
                 System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + quotientOfNumbers);
             }
    }

    public void averageCalc (int firstNumber, int secondNumber) {
            float averageOfNumbers = (float) (firstNumber + secondNumber) / 2;
            System.out.println("Result: " + averageOfNumbers);
    }
}
