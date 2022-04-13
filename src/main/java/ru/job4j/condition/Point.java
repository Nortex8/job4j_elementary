package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);

        return Math.sqrt(a + b);
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 3, 7, 9);
        System.out.println("result (5, 3) to (7, 2) " + result);
    }
}
