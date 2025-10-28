package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
    // Uppgift 1 - Kalkylator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a number");
        int firstNumber = scanner.nextInt();
        System.out.println("Chose a second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please input one of the following methods: addition, subtraction, multiplication, division, average");
        // TODO: Borde funka och vara med scanner.nextLine() men det renderar bara i skip av input, varför?
        String typeOfCalc = scanner.next();

        switch (typeOfCalc) {
            case "addition":
                System.out.println("Summan av talen är: " + (firstNumber + secondNumber));
                break;
            case "subtraction":
                System.out.println("Summan av talen är: " + (firstNumber - secondNumber));
                break;
            case "multiplication":
                System.out.println("Summan av talen är: " + (firstNumber * secondNumber));
                break;
            case "division":
                System.out.println("Summan av talen är: " + (firstNumber / secondNumber));
                break;
            case "average":
                System.out.println("Summan av talen är: " + ((firstNumber + secondNumber) /2));
                break;
            default: {
                System.out.println("No valid method was chosen, can't generate a sum");
            }
        }
        scanner.close();
    }
}
