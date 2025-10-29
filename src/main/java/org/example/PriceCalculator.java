package org.example;

public class PriceCalculator {
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
