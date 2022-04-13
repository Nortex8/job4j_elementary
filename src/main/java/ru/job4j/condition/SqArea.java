package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(7, 4);
        System.out.println(" p = 7, k = 4, s = 11.2, real = " + result1);
    }
}
