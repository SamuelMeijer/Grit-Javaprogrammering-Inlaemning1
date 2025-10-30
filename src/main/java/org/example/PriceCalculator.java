package org.example;

import java.util.Objects;

public class PriceCalculator {
    public static boolean validateAge (int age) {
        return 18 <= age && age <= 65;
    }

    public static boolean validateDiscount (String status) {
        return Objects.equals(status, "Student") || Objects.equals(status, "Pensionär");
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
