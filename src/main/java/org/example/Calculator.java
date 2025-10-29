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
            typeOfCalc = scanner.nextLine();

            switch (typeOfCalc) {
                case "addition":
                    System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "subtraction":
                    System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "multiplication":
                    System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case "division":
                    float quotientOfNumbers = (float) firstNumber / secondNumber;
                    System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + quotientOfNumbers);
                    break;
                case "average":
                    float averageOfNumbers = (float) (firstNumber + secondNumber) / 2;
                    System.out.println("Result: " + averageOfNumbers);
                    break;
                default:
                    System.out.println("No valid method was chosen, can't generate a sum");
            }

        scanner.close();
    }
}
