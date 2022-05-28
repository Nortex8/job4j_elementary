package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int x = 1;
        for (int i = 0; i <= n; i++) {
            x = (int) Math.pow(a, i);
        }
        return x;
    }

    public static void main(String[] args) {
        int rsl = DegreeLoop.calculate(2, 7);
        System.out.println(rsl);
    }
}

