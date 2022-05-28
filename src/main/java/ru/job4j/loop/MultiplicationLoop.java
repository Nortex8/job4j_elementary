package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int s = 0;
        for (int i = 1; i < b; i++) {
            s = i * a * b;
        }
        return s;
    }

    public static void main(String[] args) {
        int rsl = MultiplicationLoop.mult(1, 2);
        System.out.println(rsl);
    }
}

